public class EWallet implements Payment, Transfer {
	// code here
	private int EPhonenumber;
	private double Ebalance;

	public EWallet(int EPhonenumber) {
		this.EPhonenumber = EPhonenumber;
		this.Ebalance = 0;
	}

	//getter
	public int getEPhonenumber() {
		return EPhonenumber;
	}

	public double getEbalance() {
		return Ebalance;
	}

	//setter
	public void setEphonenumber(int EPhonenumber) {
		this.EPhonenumber = EPhonenumber;
	}

	public void setBalance(double Ebalance) {
		this.Ebalance = Ebalance;
	}

	@Override
	public String toString() {
		return EPhonenumber + "," + Ebalance;
	}

	public double deposit(double amount) { 
		return Ebalance += amount;
	}

	public void topUp(double amount) {
		deposit(amount);
	}

	//Yeu cau chung
	@Override
	public boolean pay(double amount) {
		if (amount <= Ebalance) {
			Ebalance -= amount;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public double checkBalance() {
		return Ebalance;
	}

	//yeu cau 2
	@Override
	public boolean transfer(double amount, Transfer to) {
		double totrans;
		totrans = amount + (double)amount*Transfer.transferFee;
		
		if (totrans <= this.Ebalance) {
			this.Ebalance -= totrans;
			if (to instanceof EWallet) {
				EWallet ew = (EWallet) to;
				ew.topUp(amount);
			}
			else if (to instanceof BankAccount) {
				BankAccount ba = (BankAccount) to;
				ba.topUp(amount);
			}
			return true;
		}

		else {
			return false;
		}
	}
}
