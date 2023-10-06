import java.time.Year;

public class ConvenientCard implements Payment{
	// code here
	private double balance; //so du tai khoan
    private String type; //Student & Adult
	private IDCard IDcard;

	//yeu cau 1
	public ConvenientCard(IDCard IDcard) throws CannotCreateCard {
		this.IDcard = IDcard;
		this.balance = 100;
		
		String[] parts = IDcard.getDate().split("/");
		int currentyear = Year.now().hashCode();
		int year = Integer.parseInt(parts[2]);
		int age = currentyear - year;
		
		if (age < 12) {
			throw new CannotCreateCard("Not enough age");
		}
		else if (age <= 18) {
			this.type = "Student";
		}
		else {
			this.type = "Adult";
		}
	}

	//getter
	public String getType() {
		return this.type;
	}

	public double getBalance() {
		return this.balance;
	}

	public IDCard getIDcard() {
		return this.IDcard;
	}
	


	//setter
	public void setType(String type) {
		this.type = type;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setIDcard(IDCard IDcard) {
		this.IDcard = IDcard;
	}

	@Override
	public String toString() {
		return IDcard + "," + type + "," + balance;
	}

	public double deposit(double amount) { 
		return balance += amount;
	}

	public void topUp(double amount) {
		deposit(amount);
	}


	//yeu cau chung
	@Override
	public boolean pay(double amount) {
		double payout;
		
		if (this.type == "Student") {
			payout  = amount;
		}
		else if (this.type == "Adult") {
			payout = amount + (amount*0.01);
		}
		else {
			return false;
		}

		if (amount <= balance) {
			balance -= payout;
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public double checkBalance() {
		return balance;
	}
}

