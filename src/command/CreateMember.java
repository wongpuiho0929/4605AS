package command;

import java.util.ArrayList;
import AJCS.AdvanceMem;
import AJCS.CompanyMember;
import AJCS.Member;
import AJCS.PrimaryMember;
import adapter.MemberAdapter;
import adapter.Xmember;

public class CreateMember implements Command{

	private ArrayList<Xmember> memberList;

	public CreateMember(ArrayList<Xmember> memberList) {
		this.memberList = memberList;
		}

	public void execute() {
		System.out.println("Enter id;type;name;address:");
		Member [] members={new PrimaryMember(),new CompanyMember()};
		AdvanceMem m1 = new AdvanceMem(members);
		Member a = m1.createMem();
		Xmember xmem = new MemberAdapter(a);
		memberList.add(xmem);
		System.out.print("New a record successfully"+"\n");
	}
	

	

}
