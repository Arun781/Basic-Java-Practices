class GroceryStoreRunner{
	public static void main (String [] Groceries)
	{
		System.out.println("Declaring the Properties GroceryStore");
		ToothPaste.displayDetails();
		
		GroceryStore.liquor="Vodka Coffee";
		GroceryStore.typeOfLiquor="hotDrniks";
		GroceryStore.percentageOfLiquor=45.5f;
		GroceryStore.quantityOfLiquor=550.0f;
		GroceryStore.liquorMRP=1120;
		GroceryStore.seafood="prance fish";
		GroceryStore.quality="not yet tried";
		GroceryStore.quantity=1;
		GroceryStore.dairyProducts="milk, yogurt, ice cream, cheese supermarket dairy section";
		GroceryStore.listOfItem=15;
		GroceryStore.price=12540d;
		GroceryStore.Meat="Chicken";
		GroceryStore.budgetGroceryList=225;
		GroceryStore.numOfItems=50d;
		GroceryStore.totalCostofItems=150123l;
		
		ToothPaste.displayDetails();
		
		String ref1=GroceryStore.getliquor();
		System.out.println("liquor Name = "+ref1);
		
		String ref2=GroceryStore.gettypeOfLiquor();
		System.out.println("Type of liquor = "+ref2);
		
		float ref3=GroceryStore.getpercentageOfLiquor();
		System.out.println("Percentage of liquor = "+ref3);
		
		float ref4=GroceryStore.getquantityOfLiquor();
		System.out.println(" Quantity liquor Name = "+ref4);
		
		int ref5=GroceryStore.getliquorMRP();
		System.out.println("MRP liquor Name = "+ref5);
		
		String ref6=GroceryStore.getseafood();
		System.out.println(" Name of SeaFood = "+ref6);
		
		String ref7=GroceryStore.getquality();
		System.out.println("Quality of the food = "+ref7);
		
		int ref8=GroceryStore.getquantity();
		System.out.println("Quantity of the food = "+ref8);
		
		String ref9=GroceryStore.getdairyProducts();
		System.out.println("dairyProducts are = "+ref9);
		
		int ref14=GroceryStore.getlistOfItem();
		System.out.println("List of the items = "+ref14);
		
		double ref10=GroceryStore.getprice();
		System.out.println("list price = "+ref10);
		
		String ref11=GroceryStore.getMeat();
		System.out.println("Name of the meat = "+ref11);
		
		int ref12=GroceryStore.getbudgetGroceryList();
		System.out.println("Groceries list = "+ref12);
		
		long ref13=GroceryStore.gettotalCostofItems();
		System.out.println("total amount of the Groceries = "+ref13);
		
		
		
		
	
	}
}