class Card{
	static String type;
	static int height;
	static int width;
	static int price;
	static String[] colors;
	
	static void printDetails()
	{
		System.out.println(type);
		System.out.println(height);
		System.out.println(width);
		System.out.println(price);
		if(colors!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<colors.length;index++){
				String ref=colors[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
	}
}