package command;

import java.util.ArrayList;
import AJCS.AdvanceMem;
import AJCS.CompanyMember;
import AJCS.Member;
import AJCS.PrimaryMember;
import Memento.Caretaker;
import adapter.MemberAdapter;
import adapter.Xmember;

public class CreateMember implements Command{

	private ArrayList<Xmember> memberList;
	private Caretaker ct;

	public CreateMember(ArrayList<Xmember> memberList,Caretaker ct) {
		this.memberList = memberList;
		this.ct =ct;
		}

	public void execute() {
		System.out.println("Enter id;type;name;address:");
		Member [] members={new PrimaryMember(),new CompanyMember()};
		AdvanceMem m1 = new AdvanceMem(members);
		Member a = m1.createMem();
		Xmember xmem = new MemberAdapter(a);
		ct.saveMember(memberList,xmem.getid(),"Create ");
		memberList.add(xmem);
		System.out.print("New a record successfully"+"\n");
	}
	

	

}
