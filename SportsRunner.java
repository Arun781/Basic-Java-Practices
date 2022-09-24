class SportsRunner{
	public static void main(String[] list){
		
		String[] names={"sachin","sehwag","dhoni","dravid","laxman","raina","rohit","robin","kohli","ashwin"};
		System.out.println("Enrolled players entered the ground : ");
		Sports.cricketTeamMembers(names);
		System.out.println("Enrolled players exited from ground : ");
		
		int[] nos={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enrolled jersey nos : ");
		Sports.kabbadiTeamMembersJerseyNos(nos);
		System.out.println("Kabbadi exit : ");
		
		double[] salary={1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9,10.10};
		System.out.println("Enrolled players salary : ");
		Sports.footBallTeamMembersSalary(salary);
		System.out.println("football team exit : ");
		
		long[] mobileNos={7349021511L,7349021512L,7349021513L,7349021514L,7349021515L,7349021516L,7349021517L,7349021518L,7349021519L,7349021520L};
		System.out.println("Enrolled ludo team mobile nos : ");
		Sports.ludoTeamMobileNo(mobileNos);
		System.out.println("ludo team exit : ");
		
		int[] matches={1,2,3,4,5,6,7,8,9,10};
		System.out.println("Enrolled hockey team members no of matches : ");
		Sports.hockeyTeamMembersNoOfMatches(matches);
		System.out.println("Hockey team exit : ");
		
		long[] countryNames={93L,355L,213L,1684L,376L,244L,1264L,672L,1268L,54L};
		System.out.println("Enrolled countries code : ");
		Sports.kokoTeamMembersCountryCode(countryNames);
		System.out.println("Countries code exit : ");
		
		boolean[] aliveStatus={true,false,true,false,true,false,true,false,true,false};
		System.out.println("Enrolled lagori team members : ");
		Sports.lagoriTeamMembersAlive(aliveStatus);
		System.out.println("lagori team exit : ");
	}
}