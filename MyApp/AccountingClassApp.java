class Accounting{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double expense;
	
	public static void print(double dividend1, double dividend2,
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

	public static double getIncome() {
		double income = valueOfSupply-expense;
		return income;
	}

	public static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}


class Accounting2{
	public static double valueOfSupply;
	public static double vatRate;
	public static double expenseRate;
	public static double expense;
	
	public static void print(double dividend1, double dividend2,
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

	public static double getIncome() {
		double income = valueOfSupply-expense;
		return income;
	}

	public static double getExpense() {
		double expense = valueOfSupply*expenseRate;
		return expense;
	}

	public static double getTotal() {
		return valueOfSupply + getVAT();
	}

	public static double getVAT() {
		return valueOfSupply*vatRate;
	}

}


public class AccountingClassApp {
	
	
	public static void main(String[] args) {
//		Accounting1.valueOfSupply = 10000.0;
//		Accounting1.vatRate = 0.1;
//		Accounting1.expenseRate = 0.3;
//		
//		Accounting1.expense = Accounting1.getExpense();
//		double vat = Accounting1.getVAT();
//		double total = Accounting1.getTotal();
		double income = Accounting.getIncome();
		
		double dividend1 = income*0.5;
		double dividend2 = income*0.3;
		double dividend3 = income*0.2;
		// anotherVariable = .. ; 
		// anotherMethod = ... ;
//		
//		Accounting1.print(dividend1, dividend2, dividend3);
//		
//		//	..
//		Accounting2.valueOfSupply = 20000.0;
//		Accounting2.vatRate = 0.1;
//		Accounting2.expenseRate = 0.3;
//		Accounting2.print(dividend1, dividend2, dividend3);
		
		Accounting a1 = new Accounting();
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;		
		
		
	}
}
