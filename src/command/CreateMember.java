package command;

import java.util.Vector;

import AJCS.AdvanceMem;
import AJCS.Member;

public class CreateMember implements Command{

	private Vector<Member> memberList;

	public CreateMember(Vector<Member> memberList) {
			this.memberList = memberList;
		}

	public void execute() {
		AdvanceMem m1 = new AdvanceMem();
		Member a = m1.createMem();
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
