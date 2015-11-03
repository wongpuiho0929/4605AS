package AJCS;

import java.util.Date;
import java.util.Scanner;

public class AdvanceMem {
	private Member[] members;
		
	public AdvanceMem(Member[] members) {
		this.members = members;
	}

	public Member createMem(){
		String[] typeMember ={"Pri","Com"};
		Scanner kb = new Scanner(System.in);
		String statement =kb.nextLine();
		String [] eachStatement=statement.split(";");
		int typeMemberIndex = 0;
		for(int i=0;i<typeMember.length;i++){
			if(eachStatement[1].equals(typeMember[i])){
				typeMemberIndex = i;
			}	
		}
		Member a = members[typeMemberIndex];
		a.setId(eachStatement[0]);
		a.setName(eachStatement[2]);
		Date date= new Date();
		date.setYear(date.getYear()+1);
		a.setGoodTill(date);
		a.setPostal(eachStatement[3]); 
		return a;
		
	}
	
	public Member searchMem(String id){
		return null;
		
		
		
	}
	
	public void updateAddress(String id){
		
		
	}
	
	public void extendGoodTill(String id){
		
		
	}
	
	public boolean stillGood(String id){
		return false;
		
		
	}
}
