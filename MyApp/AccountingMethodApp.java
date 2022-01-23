
public class AccountingMethodApp {
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double expense;
	
	public static void main(String[] args) {
		
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		expense = getExpense();
		
		double vat = getVAT();
		double total = getTotal();
		double income = getIncome();
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		
		print(dividend1, dividend2, dividend3);

	}

	private static void print(double dividend1, double dividend2,
			double dividend3) {
		System.out.println("Value of supply : "+valueOfSupply);
		System.out.println("VAT : "+getVAT());
		System.out.println("Total : "+getTotal());
		System.out.println("Expense : "+getExpense());
		System.out.println("Income : "+getIncome());
		System.out.println("Dividend 1 : "+dividend1);
		System.out.println("Dividend 2 : "+dividend2);
		System.out.println("Dividend 3 : "+dividend3);
	}

	private static double getIncome() {
		double income = valueOfSupply-expense;
		return income;
	}

	private static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	private static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}
