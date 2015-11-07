package AJCS;

import java.util.Date;
import java.util.Scanner;

public class AdvanceMem {
	private Member[] members;

	public AdvanceMem(Member[] members) {
		this.members = members;
	}

	public Member createMem() {
		String[] typeMember = { "Pri", "Com" };
		Scanner kb = new Scanner(System.in);
		while (true) {
			String statement = kb.nextLine();
			String[] eachStatement = statement.split(";");
			int typeMemberIndex = -1;
			try{
				for (int i = 0; i < typeMember.length; i++) {
					if (eachStatement[1].equals(typeMember[i])) {
						typeMemberIndex = i;
					}
				}
			}catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("Not MATCH");
				System.out.println("Enter id;type;name;address:");
			}
			if (typeMemberIndex != -1) {
				Member a = members[typeMemberIndex];
				a.setId(eachStatement[0]);
				a.setName(eachStatement[2]);
				Date date = new Date();
				date.setYear(date.getYear() + 1);
				a.setGoodTill(date);
				a.setPostal(eachStatement[3]);
				return a;
			}else{
				System.out.println("Please check the Input Data");
				System.out.println("Enter id;type;name;address:");
				continue;
			}
		}

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
}
