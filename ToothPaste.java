class ToothPaste{
	static String brand;
	static void setBrand(String value)
	{
		brand=value;
	}
	static String getbrand()
	{
		return brand;
	}
	static String flavour;
	static void setFlavour(String value)
	{
		flavour=value;
	}
	static String getFlavour()
	{
		return flavour;
	}
	static int price=250;
	static void setprice(int value)
	{
		price=value;
	}
	static int getprice()
	{
		return price;
	}
	static double netWeight=50;
	static void setnetWeight(double kilograms)
	{
		netWeight=kilograms;
	}
	static double getnetWeight()
	{
		return netWeight;
	}
	static String ingredients="babool, SeaSalt";
	static void setIngredients(String value)
	{
		ingredients=value;
	}
	static String getingredients()
	{
		return ingredients;
	}
	static String Benefits;
	static void setBenefits(String value)
	{
		Benefits=value;
	} 
	static String getBenefits()
	{
		return Benefits;
	}
	
	static float quantity;
	static void setquantity(float value)
	{
		quantity=value;
	} 
	static float getquantity()
	{
		return quantity;
	}
	
	static char color;
	static void setcolor(char value)
	{
		color=value;
	} 
	static char getcolor()
	{
		return color;
	}
	
	static String type;
	static void settype(String value)
	{
		type=value;
	} 
	static String gettype()
	{
		return type;
	}
	
	static long expairyDate=10122022l;
	static void setexpairyDate(long value)
	{
		expairyDate=value;
	}
	static long getexpairyDate()
	{
		return expairyDate;
	}

	static long serialKey=1210122022l;
	static void setserialKey(long value)
	{
		serialKey=value;
	}
	static long getserialKey()
	{
		return serialKey;
	}
	
	static String warning;
	static void setwarning(String value)
	{
		warning=value;
	}
	static String getwarning()
	{
		return warning;
	}
	
	static String purpose;
	static void setpurpose(String safe)
	{
		purpose=safe;
	}
	static String getpurpose()
	{
		return purpose;
	}
	static String whatInSide;
	static void setwhatInSide(String uses)
	{
		whatInSide=uses;
	}
	static String getwhatInSide()
	{
		return whatInSide;
	}
	static String Action;
	static void setaction(String value)
	{
		Action=value;
	}
	static String getAction()
	{
		return Action;
	}
	static String characteristics;
	static void setcharacteristics(String value)
	{
		characteristics=value;
	}
	static String getcharacteristics()
	{
		return characteristics;
	}
	static void displayDetails ()
   { 
   System.out.println(price);
   System.out.println(flavour);
   System.out.println(brand);
   System.out.println(netWeight);
   System.out.println(ingredients);
   System.out.println(Benefits);
   System.out.println(quantity);
   System.out.println(color);
   System.out.println(type);
   System.out.println(expairyDate);
   System.out.println(warning);
   System.out.println(purpose);
   System.out.println(whatInSide);
   System.out.println(Action);
   System.out.println(characteristics);
   }
	
}