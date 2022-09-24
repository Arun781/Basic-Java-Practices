class MetroPolitonCity
{
	/*its declaration of static variable and simple int datatype declaration*/
	static int waterPoints;
	static float population;
	static byte wards;
	static int layouts;
	static long roadLength;
	static short indiraCanteen;
	static char ecoFriendly;
	static boolean bengaluru;
	static int areas;
	static byte constituencies;
	static long noOfVehicles;
	static float youths;
	static short corporates;
	static char happiNessIndex;
	static boolean bsBommai;
	static int itCompanies;
	static short parks;
	/*static String array declaration*/
	static String[] cityName;
	static String[] nagaragalu;
	static short[] pinCodes;
	static String[] metroStations;
	static String[] neighbouringDistricts;
	static String[] localMLA;
	static String[] malls;
	static String[] xworkzCentres;
	static String[] xworkzStudents;
	static String[] theatres;
	static String[] heroesInBengaluru;
	static String[] roadNames;
	
	/*declaration of all methods using one main method*/
	static void printContent()
	{
		if(cityName!=null){
		System.out.println("array pointing to memory");
		for(int index=0;index<cityName.length;index++)
		{
		String ref=cityName[index];
		System.out.println(ref  +"index"  +index);
		}
	}
		else
		{
			System.out.println("array not pointing to memory");
		}
		System.out.println(waterPoints);
		System.out.println(population);
		System.out.println(wards);
		System.out.println(layouts);
		System.out.println(roadLength);
		System.out.println(indiraCanteen);
		System.out.println(ecoFriendly);
		System.out.println(bengaluru);
		System.out.println(areas);
		System.out.println(constituencies);
		System.out.println(noOfVehicles);
		System.out.println(youths);
		System.out.println(corporates);
		System.out.println(happiNessIndex);
		System.out.println(bsBommai);
		System.out.println(itCompanies);
		System.out.println(parks);
		
		if(nagaragalu!=null)
		{
			System.out.println("array pointing to memory");
			/*declaration&initialition -----condition----increment and decrement*/
			for(int index=0;index<nagaragalu.length;index++)
			{
				String ref=nagaragalu[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(pinCodes!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<pinCodes.length;index++){
				short ref=pinCodes[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(metroStations!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<metroStations.length;index++){
				String ref=metroStations[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(neighbouringDistricts!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<neighbouringDistricts.length;index++){
				String ref=neighbouringDistricts[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(localMLA!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<localMLA.length;index++){
				String ref=localMLA[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(malls!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<malls.length;index++){
				String ref=malls[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(xworkzCentres!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<xworkzCentres.length;index++){
				String ref=xworkzCentres[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(xworkzStudents!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<xworkzStudents.length;index++){
				String ref=xworkzStudents[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(theatres!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<theatres.length;index++){
				String ref=theatres[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(heroesInBengaluru!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<heroesInBengaluru.length;index++){
				String ref=heroesInBengaluru[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
		if(roadNames!=null){
			System.out.println("array pointing to memory");
			for(int index=0;index<roadNames.length;index++){
				String ref=roadNames[index];
				System.out.println(ref  +"index"  +index);
			}
		}
		else{
			System.out.println("array not pointing to memory");
		}
	}
}