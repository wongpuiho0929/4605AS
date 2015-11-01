package command;

import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import AJCS.AdvanceMem;
import AJCS.CompanyMember;
import AJCS.Member;
import AJCS.PrimaryMember;

public class CreateMember implements Command{

		private Vector<Member> memberList;
	
		
		
	public CreateMember(Vector<Member> memberList) {
			this.memberList = memberList;
		}

	public void execute() {
		Member[] members = { new PrimaryMember(), new CompanyMember() };
		String[] typeMember ={"Pri","Com"};
		Scanner kb = new Scanner(System.in);
		String statement =kb.next();
		String [] eachStatement=statement.split(";");
		int typeMemberIndex = 0;
		for(int i=0;i<typeMember.length;i++){
			if(eachStatement[1].equals(typeMember[i])){
				typeMemberIndex = i;
			}	
		}
		AdvanceMem m1 = new AdvanceMem();
		m1.setMembers(members);
		m1.setTypeMemberIndex(typeMemberIndex);
		Member a = m1.createMem();
		a.setId(eachStatement[0]);
		a.setName(eachStatement[2]);
		Date date= new Date();
		date.setYear(date.getYear()+1);
		a.setGoodTill(date);
		a.setPostal(eachStatement[3]); 
		memberList.add(a);
		for (int i = 0; i < memberList.size(); i++) {
			System.out.print(memberList.get(i).toString() + "\n"
					+memberList.get(i).getClass()+"\n");
		}

		
	}
	
	public void undo() {
		memberList.remove(memberList.size()-1);
		
	}

	

}
