class CoffeeRunner
{
	public static void main (String [] details)
	{
	if(details.length==3)
	{
		System.out.println("Details of CoffeeRunner");
		String price=details[0];
        String sugar=details[1];
		String hotelName=details[2];
		
		System.out.println("Price :      "+ details[0]);
        System.out.println("Sugar :      "+ details[1]);
		System.out.println("Hotel Name : "+ details[2]);
		
	}
        int convertedPrice=Integer.parseInt(details[0]);
        System.out.println("Converted price: "+details[0]);
		if(convertedPrice<=10)
		{
        System.out.println("Price is ok");
        }
        else
		{
        System.out.println("eee coffee instonda price....");
        }
		
		 boolean Sugar=Boolean.parseBoolean(details[1]);
		 System.out.println("Converted sugar: "+details[1]);
		
		if(Sugar==Sugar)
		{
        System.out.println("It is good Diabities People");
        }
        else
		{
        System.out.println("It is not good Diabities People");
        }
	}
}