package bartender;

public class YourWallet{

	private int money;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public YourWallet(int money) {
		super();
		this.money = money;
	}
	
	public int spendingMoney(int moneySpent) {
		money-=moneySpent;
		return money;
	}
	public int addMoney(int moneyAdded) {
		money+=moneyAdded;
				return money;
	}
	
	public int tipping(int tip){
	money-=tip;
	return money;
	}
	
}
