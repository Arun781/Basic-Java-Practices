class Sports{
	static void cricketTeamMembers(String[] names)
	{
		System.out.println("Enrolled the cricketTeamMembers name : ");
		System.out.println("Total no. of cricketTeamMembers : "+names.length);
		for(int index=0;index<names.length;index++){
			String ref=names[index];
			System.out.println(ref);
		}
	}
	static void kabbadiTeamMembersJerseyNos(int[] nos){
		System.out.println("Enrolled jersey nos : ");
		System.out.println("Total no. of jersey nos enrolled : "+nos.length);
		for(int index=0;index<nos.length;index++){
			int ref=nos[index];
			System.out.println(ref);
		}
	}
	static void footBallTeamMembersSalary(double[] salary){
		System.out.println("Enrolled footBallTeamMembers Salary : ");
		System.out.println("Total no. of footBall Team Members : "+salary.length);
		for(int index=0;index<salary.length;index++){
			double ref=salary[index];
			System.out.println(ref);
		}
	}
	static void ludoTeamMobileNo(long[] mobileNos){
		System.out.println("Enrolled ludoTeam MobileNo : ");
		System.out.println("Total no. of ludo Team MobileNo : "+mobileNos.length);
		for(int index=0;index<mobileNos.length;index++){
			long ref=mobileNos[index];
			System.out.println(ref);
		}
	}
	static void hockeyTeamMembersNoOfMatches(int[] matches){
		System.out.println("Enrolled hockey TeamMembers No Of Matches : ");
		System.out.println("Total no. of matches : "+matches.length);
		for(int index=0;index<matches.length;index++){
			int ref=matches[index];
			System.out.println(ref);
		}
	}
	static void kokoTeamMembersCountryCode(long[] countryNames){
		System.out.println("Enrolled koko Team Members Country Code : ");
		System.out.println("Total no. of countries enrolled : "+countryNames.length);
		for(int index=0;index<countryNames.length;index++){
			long ref=countryNames[index];
			System.out.println(ref);
		}
	}
	static void lagoriTeamMembersAlive(boolean[] aliveStatus){
		System.out.println("Enrolled lagori Team Members : ");
		System.out.println("Total no. of lagori Team Members : "+aliveStatus.length);
		for(int index=0;index<aliveStatus.length;index++){
			boolean ref=aliveStatus[index];
			System.out.println(ref);
		}
	}
}