
public class calcDiscount {
    // this class is created to calculate the discount on an order and write it to console
	public static calcDiscount(int orderAmt)
	{
		double discPerc;
		double discAmt;
		if (orderAmt >= 25 && orderAmt < 50){
			
		}
		else if (orderAmt >= 50 && orderAmt< 100){
			
		}
		else if (orderAmt >= 100 && orderAmt< 200){
			
		}
		else if (orderAmt >= 200 && orderAmt< 300){
			
		}
		else if (orderAmt >= 300){}
		else{
			discAmt = 0;
			disPerc = 0;
		}
		
			
			
		
		System.out.printf("Number of bags ordered : %0.2d" +orderAmt + " - €%0.2d" + (orderAmt * bagCost) + "\n");
		System.out.printf("              Discount : %0.2d" + discPerc + " -  €%0.2d" + discAmt +"\n");
		System.out.printf("    Your total cost is : €%0.2d" + ((orderAmt *bagCost) - discAmt));
		
		
	}
	
	

	

}
