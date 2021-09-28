public class US2Metric {

	public static void main(String[] args) {
		
		double a;
		double b;
		
		System.out.println("INCHES\t CENTIMETERS\t POUNDS\t KILOGRAMS\t");
		System.out.println("------\t -----------\t ------\t ---------\t");
		
		for(double i=1; i<=50; i++) 
		{
			 a= i*2.54;
			
			 b = i*0.45359237;
			
			System.out.print(i+ "\t ");
			
			System.out.printf("%.4f",a);
			System.out.print(" \t " + i + "\t " );
			
			System.out.printf("%.4f",b);
			System.out.println();
		}
		
		
		
		
	}

}
