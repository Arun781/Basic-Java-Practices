class CardRunner{
	public static void main(String[] Deck){
		System.out.println("Andhar main method");
		
		Card.printDetails();
		Card.type="teenpatti";
		Card.height=3;
		Card.width=6;
		Card.price=500;
		String[] bannagalu={"black","red"};
		Card.colors=bannagalu;
		
		Card.printDetails();
		
		System.out.println("Bahar main method");
	}
}