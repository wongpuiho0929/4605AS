package command;

import java.util.ArrayList;
import java.util.Vector;

import AJCS.AdvanceMem;
import AJCS.CompanyMember;
import AJCS.Member;
import AJCS.PrimaryMember;

public class CreateMember implements Command{

	private ArrayList memberList;

	public CreateMember(ArrayList memberList) {
		this.memberList = memberList;
		}

	public void execute() {
		Member [] members={new PrimaryMember(),new CompanyMember()};
		AdvanceMem m1 = new AdvanceMem(members);
		Member a = m1.createMem();
		memberList.add(a);
		System.out.print("New a record successfully"+"\n");
	}
	

	

}
