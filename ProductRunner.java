class ProductRunner
{
	public static void main(String[] statement)
{
	
	if(statement.length==5)
		{	
		String name=statement[0];
		String type=statement[1];
		String price=statement[2];
		String quality=statement[3];
		String quantity=statement[4];

	    System.out.println("entered to Market");
		
		System.out.println("product name:"+statement[0]);
		System.out.println("product type:"+statement[1]);
		System.out.println("product type:"+statement[2]);
		System.out.println("product type:"+statement[3]);
		System.out.println("product type:"+statement[4]);
		}
		
		int ref0=Integer.parseInt(statement[2]);
		int ref1=Integer.parseInt(statement[4]);
		
		System.out.println("the price product is"+ref0);
		System.out.println("the Quantity product is"+ref1);
		
		int total=ref0+ref1;
		System.out.println("The Price and Quantity of the product is :-"+total);
		
}
}
	