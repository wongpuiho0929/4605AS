package AJCS;

import java.util.Date;
import java.util.Scanner;

public class AdvanceMem {
	private Member[] members;
	private String[] typeMember = { "Pri", "Com" };
	private int typeMemberIndex = -1;
	
	public AdvanceMem(Member[] members) {
		this.members = members;
	}

	public Member createMem() {
		Scanner kb = new Scanner(System.in);
		boolean loop=true;
		while (loop) {
			String statement = kb.nextLine();
			String[] eachStatement = statement.split(";");
			
			if (!statement.isEmpty()) {
				try {
					for (int i = 0; i < typeMember.length; i++) {
						if (eachStatement[1].equals(typeMember[i])) {
							typeMemberIndex = i;
						}
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Not MATCH");
				}
				if (eachStatement.length == 4 && typeMemberIndex!=-1) {
					Member a = members[typeMemberIndex];
					boolean chk =validate(eachStatement[0]);
					if(chk){
					a.setId(eachStatement[0]);
					a.setName(eachStatement[2]);
					Date date = new Date();
					date.setYear(date.getYear() + 1);
					a.setGoodTill(date);
					a.setPostal(eachStatement[3]);
					return a;}
					else{
						System.out.println("Wrong ID");
						loop=false;
					}
				} else {
					System.out.println("Please check the Input Data");
					
					loop=false;
				}
			} else {
				System.out.println("Please Input data");
			}
		}
		return null;
	}

	public Member searchMem(String id) {
		return null;

	}

	public void updateAddress(String id) {

	}

	public void extendGoodTill(String id) {

	}

	
	public boolean stillGood(String id) {
		return false;

	}
	
	public boolean validate(String id){
		boolean chk = false;
		char [] temp =id.toCharArray();
		int total=0;
		for(int i=0;i<temp.length;i++){
			total += Integer.parseInt(temp[i]+"");
		}
		if(typeMemberIndex ==0){
			if(total %3==0){
				chk =true;
			}
		}else if (typeMemberIndex == 1){
			if(total %8==0){
				chk =true;
			}
		}
		return chk;
	} 
}
