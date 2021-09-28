public class TempConvert 
{

	public static void main(String[] args) 
	{
		
		double tempC;
		double tempF;
		
		for(int i=0; i<=212; i +=2) 
 		{
			tempC= (i - 32) / (9/5) ;
			tempF= tempC * (9/5) + 32 ;
	 
			System.out.println("FARENHEIT            CELCIUS");
			System.out.println(tempF+"                "+tempC);
 		}
		System.out.println();
		for(int i=0; i<=212; i +=2) 
		{
			
			tempC= (i - 32) / (9/5) ;
			tempF= tempC * (9/5) + 32 ;
		 
			System.out.println("CELCIUS              FAHRENHEIT");
			System.out.println(tempC+"                "+tempF);
		}
 
 

	}

}

