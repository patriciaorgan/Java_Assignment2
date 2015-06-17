import java.util.Scanner;

public class DiscountCoffee {

	/**
	 * an	application	that accepts the number	of	bags ordered	
	 and displays the number of	bags ordered, the discount given 
	 and the total cost	of	the	order.		

	 */
	public static void main(String[] args) {
		// main method used to call method calcDiscount and produce the output
		//declare and set variable for the calculation of discount
		final double greater25 = 0.05;
		final double greater50 = 0.1;
		final double greater100 = 0.15;
		final double greater150 = 0.20;
		final double greater200 = 0.25;
		final double greater300 = 0.30;
		final double bagCost = 5.50;
		//declare variables for holding the discount percent and amount
		int discPerc;
		double discAmt;
		
		Scanner input = new Scanner(System.in);// crate a scanner to receive the input value
		System.out.print("This program computes the amount of discount\n" +
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
		int orderAmt = input.nextInt();// set the input value int to the variable orderAmt
				
	
		if (orderAmt >= 25 && orderAmt < 50){
			discAmt = orderAmt*greater25;
			discPerc = (int)greater25 *100;
			}
		else if (orderAmt >= 50 && orderAmt< 100){
			discAmt = orderAmt*greater50;
			discPerc = (int)greater50 *100;
			}
		else if (orderAmt >= 100 && orderAmt< 200){
			discAmt = orderAmt*greater100;
			discPerc = (int)greater100 *100;
			}
		else if (orderAmt >= 200 && orderAmt< 300){
			discAmt = orderAmt*greater200;
			discPerc = (int)greater200 *100;
			}
		else if (orderAmt >= 300){
			discAmt = orderAmt*greater300;
			discPerc = (int)greater300 *100;
		}
		
		else{
			discAmt = 0;
			discPerc = 0;
		}
		//String result1 = String.f
				//format("%0.2f", discAmt);
				
				//System.out.printf("Class Average is %f\n", discAmt); 	
		
		System.out.printf("Number of bags ordered : %d"+ orderAmt + "   - €%0.2f" + (orderAmt * bagCost) + "\n");
		System.out.printf("              Discount : %d"+ discPerc+"% -  €%d"+discAmt+"\n");
		System.out.printf("    Your total cost is : €%0.2f" + ((orderAmt *bagCost) - discAmt));
		

	}// end main method

}// end class
