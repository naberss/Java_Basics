package classes;

public  final  class Account {

	protected int number;
	protected String holder;
	protected double balance;

	public Account() {
		this.holder = "PERA";

	}

	public Account(int number, String holder, double balance) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public final void withdraw(double number) {
		this.balance = (this.balance - (number + 5));
	}

}
