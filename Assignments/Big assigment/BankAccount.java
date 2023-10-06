public class BankAccount implements Payment, Transfer{
    // code here

    private int accNumber;
    private double rate;
    private double Bbalance;

    public BankAccount(int accNumber, double rate) {
        this.accNumber = accNumber;
        this.rate = rate;
        this.Bbalance = 50;
    }

    //getter
    public int getAccnumber() {
        return accNumber;
    }

    public double getRate() {
        return rate;
    }

    public double getBbalance() {
        return Bbalance;
    }

    //setter
    public void setAccnumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public void setBbalance(double Bbalance) {
        this.Bbalance = Bbalance;
    }

    @Override 
    public String toString() {
        return accNumber + "," + rate + "," + Bbalance;
    }

    public double deposit(double amount) { 
		return Bbalance += amount;
	}

	public void topUp(double amount) {
		deposit(amount);
	}

    //yeu cau chung
    @Override
    public boolean pay(double amount) {
        if (amount + 50 <= Bbalance) {
            Bbalance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    @Override
	public double checkBalance() {
		return Bbalance;
	}

    //yeu cau 2
	@Override
	public boolean transfer(double amount, Transfer to) {
		double totrans;
		totrans = amount + (double)amount*Transfer.transferFee;
	
        if (totrans + 50 <= this.Bbalance) {
			this.Bbalance -= totrans;
            if (to instanceof BankAccount) {
				BankAccount ba = (BankAccount) to;
				ba.topUp(amount);
			}
			else if (to instanceof EWallet) {
				EWallet ew = (EWallet) to;
				ew.topUp(amount);
            }
			return true;	
		}

		else {
			return false;
		}
	}
}
