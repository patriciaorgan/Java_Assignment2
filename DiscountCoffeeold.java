
public class DiscountCoffee {

	/**
	 * an	application	that	accepts	the	number	of	bags	ordered	
	 and	displays	the	number	of	bags	ordered,	the	discount	given	and	the	total	cost	of	the	order.		

	 */
	public static void main(String[] args) {
		// main method used to call method calcDiscount and produce the output
		final double less25 = 0.05;
		final double less50 = 0.1;
		final double less100 = 0.15;
		final double less150 = 0.20;
		final double less200 = 0.25;
		final double less300 = 0.30;
		final double bagCost = 5.50;
		
		System.out.println("This program computes the amount of discount\n" +
				"given to the customers of IT125 Coffe Company.\n" +
				"Discounts are listed below.\n"	+
				"  Order Volumn    Discount\n" +
				"---------------------------\n" +
				"  >= 25 Bags         5%\n" +
				"  >= 50 Bags        10%\n" +
				"  >= 100 Bags       15%\n" +
				"  >= 150 Bags       20%\n" +
				"  >= 200 Bags       25%\n" +
				"  >= 300 Bags       30%\n" +
				"\n" +
				"Enter number of coffee dags purchased: ");
		
		int input = nextInt
				
		calcDiscount(input);
		

	}

}
