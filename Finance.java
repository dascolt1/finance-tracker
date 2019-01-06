

public class Finance {

	private double moneyEarned;
	private double moneySpent;
	private int weeksWorked;

	Finance() {
		this.moneyEarned = moneyEarned;
		this.moneySpent = moneySpent;
		this.weeksWorked = weeksWorked;
	}

	Finance(double moneyEarned, double moneySpent, int weeksWorked) {
		this.moneyEarned = moneyEarned;
		this.moneySpent = moneySpent;
		this.weeksWorked = weeksWorked;
	}



	public void setMoneyEarned(double moneyEarned) {
		this.moneyEarned = moneyEarned;
	}

	public double getMoneyEarned() {
		return moneyEarned;
	}

	public void setMoneySpent(double moneySpent) {
		this.moneySpent = moneySpent;
	}

	public double getMoneySpent() {
		return moneySpent;
	}

	public void setWeeksWorked(int weeksWorked) {
		this.weeksWorked = weeksWorked;
	}

	public int getWeeksWorked() {
		return weeksWorked;
	}


	public double moneyAfterExpenses(double moneyEarned, double moneySpent) {
		return moneyEarned - moneySpent;

	}

	public double projectedRevenue(double moneyEarned, double weeksWorked) {
		return moneyEarned * weeksWorked;
	}

}