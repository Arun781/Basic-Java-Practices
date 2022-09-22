class ToothPasteRunner{
	public static void main (String [] paste)
	{
		System.out.println("Declaring the Properties Botanical Sea Salt and Spearmint Toothpaste");
		ToothPaste.displayDetails();
		
		ToothPaste.brand="Botanical Sea Salt and Spearmint Toothpaste";
		
		ToothPaste.flavour= "spearmint";
		ToothPaste.price=150;
		ToothPaste.netWeight=100;
		ToothPaste.ingredients= "Spearmint";
		ToothPaste.Benefits="Improves gum health,Freshens breath,Reduce plaque buildup";
		ToothPaste.quantity=15.05f;
		ToothPaste.color= 'R';
		ToothPaste.type="Solid type";
		ToothPaste.expairyDate=10252023l;
		ToothPaste.warning= "Shouls maintain keep distance from below 7 years kid";
		ToothPaste.purpose= "Wightening";
		ToothPaste.whatInSide= "peppermint,Menthol,Lemon,Fennel,Clove,cinnamon";
		ToothPaste.Action= "Prevents decises though specific function";
		ToothPaste.characteristics="whitening toothpaste and evaluation of its effects on enamel roughness";
		
		
		ToothPaste.displayDetails();
		
		int ref10=ToothPaste.getprice();
		System.out.println("price of the Improves gum health,Freshens breath,Reduce plaque buildup"+ref10);
		
		double ref11=ToothPaste.getnetWeight();
		System.out.println("netWeight price of the Improves gum health,Freshens breath,Reduce plaque buildup"+ref11);
		
		long ref12=ToothPaste.getexpairyDate();
		System.out.println(" expairyDate of the Improves gum health,Freshens breath,Reduce plaque buildup"+ref12);
		
		float ref13=ToothPaste.getquantity();
		System.out.println("quantity of the Improves gum health,Freshens breath,Reduce plaque buildup"+ref13);
		
		char ref14=ToothPaste.getcolor();
		System.out.println("quantity of the Improves gum health,Freshens breath,Reduce plaque buildup"+ref14);
		
		
		String ref1=ToothPaste.getFlavour();
		System.out.println("Name of the Flvour is = "+ref1);
		
		String ref2=ToothPaste.getingredients();
		System.out.println("ingredients includes = "+ref2);
		
		String ref3=ToothPaste.getBenefits();
		System.out.println("Benefits of Botanical Sea Salt and Spearmint Toothpaste = "+ref3);
		
		String ref4=ToothPaste.gettype();
		System.out.println("type of Benefits of Botanical Sea Salt and Spearmint Toothpaste = "+ref4);
		
		String ref5=ToothPaste.getwarning();
		System.out.println("warning of Botanical Sea Salt and Spearmint Toothpaste = "+ref5);
		
		String ref6=ToothPaste.getpurpose();
		System.out.println("purpose of Botanical Sea Salt and Spearmint Toothpaste = "+ref6);
		
		String ref7=ToothPaste.getwhatInSide();
		System.out.println("whatInSide of Botanical Sea Salt and Spearmint Toothpaste = "+ref7);
		
		String ref8=ToothPaste.getAction();
		System.out.println("Action of Botanical Sea Salt and Spearmint Toothpaste = "+ref8);
		
		String ref9=ToothPaste.getcharacteristics();
		System.out.println("characteristics of Botanical Sea Salt and Spearmint Toothpaste = "+ref9);
		
		
		
		

		ToothPaste.displayDetails();
	}
}