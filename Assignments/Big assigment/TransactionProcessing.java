import java.util.*;
import java.io.*;

public class TransactionProcessing {
    private ArrayList<Payment> paymentObjects;
    private IDCardManagement idcm;
    
    public TransactionProcessing(String idCardPath, String paymentPath) {
        idcm = new IDCardManagement(idCardPath);
        readPaymentObject(paymentPath);
    
    }

    public ArrayList<Payment> getPaymentObject() {
        return this.paymentObjects;
    }

    // Requirement 3
    public boolean readPaymentObject(String path) {
        //code here
        try {
            paymentObjects = new ArrayList<Payment>();
            File f = new File(path);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] parts = line.split(",");
                if (parts.length == 2) {
                    int accNumber = Integer.parseInt(parts[0]);
                    double rate = Double.parseDouble(parts[1]);
                    BankAccount ba = new BankAccount(accNumber, rate);
                    paymentObjects.add(ba);
                }
                else if (parts.length == 1) {
                    if (parts[0].length() == 7) {
                        int EPhoneNumber = Integer.parseInt(parts[0]);
                        EWallet ew = new EWallet(EPhoneNumber);
                        paymentObjects.add(ew);
                    }
                    else if (parts[0].length() == 6) {
                        int ID = Integer.parseInt(parts[0]);
                        for (IDCard IDnum : idcm.getIDCards()) {
                            if (IDnum.getIDNum() == ID) {
                                try {
                                    ConvenientCard cc = new ConvenientCard(IDnum);
                                    paymentObjects.add(cc);
                                }
                                catch (CannotCreateCard e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                    
                }
            }
            sc.close();
            return true;
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Requirement 4
    public ArrayList<ConvenientCard> getAdultConvenientCards() {
        //code here
        ArrayList<ConvenientCard> Adultcard = new ArrayList<>();
        
        for (Payment payment : paymentObjects) {
            if (payment instanceof ConvenientCard) {
                ConvenientCard cc = (ConvenientCard) payment;
                if (cc.getType() == "Adult") {
                    Adultcard.add(cc);
                }
            }
        }
        return Adultcard;
    }

    // Requirement 5
    public ArrayList<IDCard> getCustomersHaveBoth() {
        //code here
        ArrayList<IDCard> CustomerHaveBoth = new ArrayList<>();
        for (IDCard IDcard : idcm.getIDCards()) {
            boolean hasCC = false;
            boolean hasEW = false;
            boolean hasBA = false;
            for (Payment payment : paymentObjects) {
                if (payment instanceof ConvenientCard) {
                    ConvenientCard cc = (ConvenientCard) payment;
                    if (cc.getIDcard().getIDNum() == IDcard.getIDNum()) {
                        hasCC = true;
                    }
                }
                if (payment instanceof EWallet) {
                    EWallet ew = (EWallet) payment;
                    if (ew.getEPhonenumber() == IDcard.getPhonenumber()) {
                        hasEW = true;
                    }
                }
                if (payment instanceof BankAccount) {
                    BankAccount ba = (BankAccount) payment;
                    if (ba.getAccnumber() == IDcard.getIDNum()) {
                        hasBA = true;
                    }
                }
            }

            if (hasCC == true && hasEW == true && hasBA == true) {
                CustomerHaveBoth.add(IDcard);
            }
        }
        return CustomerHaveBoth;
    }

    // Requirement 6
    public void processTopUp(String path) {
        //code here
        try {

            File f = new File(path);
            Scanner sc = new Scanner(f);
    
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] parts = line.split(",");
    
                if (parts.length == 3) {
                    String Type = parts[0];
                    int accNumber = Integer.parseInt(parts[1]);
                    double addup = Double.parseDouble(parts[2]);
    
                    for (Payment payment : paymentObjects) {
                        if (Type.equals("CC")) {
                            if (payment instanceof ConvenientCard) {
                                ConvenientCard cc = (ConvenientCard) payment;
                                if (cc.getIDcard().getIDNum() == accNumber) {
                                cc.topUp(addup);
                                break;
                                }
                            }
                        } 
                        else if (Type.equals("EW")) {
                            if (payment instanceof EWallet) {
                                EWallet ew = (EWallet) payment;
                                if (ew.getEPhonenumber() == accNumber) {
                                    ew.topUp(addup);
                                    break;
                                }
                            } 
                        } 
                        else if (Type.equals("BA")) {
                            if (payment instanceof BankAccount) {
                                BankAccount ba = (BankAccount) payment;
                                if (ba.getAccnumber() == accNumber) {
                                    ba.topUp(addup);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
    
            sc.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Requirement 7
    public ArrayList<Bill> getUnsuccessfulTransactions(String path) {
        //code here
        ArrayList<Bill> UnsuccesfulTrans = new ArrayList<>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String [] parts = line.split(",");
                int billID = Integer.parseInt(parts[0]);
                double Payout = Double.parseDouble(parts[1]);
                String Goods = parts[2];
                String Type = parts[3];
                int IDNum = Integer.parseInt(parts[4]);
                Bill bill = new Bill(billID, Payout, Goods);
            
                for (Payment payment : paymentObjects) {
                    if (Type.equals("CC") && payment instanceof ConvenientCard) {
                        ConvenientCard cc = (ConvenientCard) payment;
                        if (cc.getIDcard().getIDNum() == IDNum) {
                            if ( cc.pay(Payout) == false) {
                                UnsuccesfulTrans.add(bill);
                            }
                        }
                    }
                    else if (Type.equals("BA") && payment instanceof BankAccount) {
                        BankAccount ba = (BankAccount) payment;
                        if (ba.getAccnumber() == IDNum) {
                            if ( ba.pay(Payout) == false) {
                                UnsuccesfulTrans.add(bill);
                            }  
                        }
                    }
                    else if (Type.equals("EW")  && payment instanceof EWallet) {
                        EWallet ew = (EWallet) payment;
                        if (ew.getEPhonenumber() == IDNum) {
                            if ( ew.pay(Payout) == false) {
                                UnsuccesfulTrans.add(bill);
                            }
                        }
                    }
                }  
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return UnsuccesfulTrans;      
    }

    // Requirement 8
    public ArrayList<BankAccount> getLargestPaymentByBA(String path) {
        //code here
        ArrayList<BankAccount> PaymentBA = new ArrayList<>();
        try {
            File f = new File(path);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                double Max = 0.0;
                String line = sc.nextLine();
                String [] parts = line.split(",");
                int billID = Integer.parseInt(parts[0]);
                double Payout = Double.parseDouble(parts[1]);
                String Goods = parts[2];
                String Type = parts[3];
                int IDNum = Integer.parseInt(parts[4]);
                Bill bill = new Bill(billID, Payout, Goods);
                
                for (Payment payment : paymentObjects) {
                    if (Type.equals("BA")) {
                        if (payment instanceof BankAccount) {
                            BankAccount ba = (BankAccount) payment;
                            if (ba.getAccnumber() == IDNum) {
                                if (bill.getTotal() > Max) {
                                    Max = bill.getTotal();
                                    PaymentBA.clear();
                                    PaymentBA.add(ba);
                                }
                                else if (bill.getTotal() == Max) {
                                    PaymentBA.add(ba);
                                }
                            }
                        }
                    }
                }

            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return PaymentBA;
    }

    //Requirement 9
    public void processTransactionWithDiscount(String path) {
        //code here
    }
}
