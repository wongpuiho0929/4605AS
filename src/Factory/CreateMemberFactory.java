package Factory;

import java.util.ArrayList;

import command.Command;
import command.CreateMember;

public class CreateMemberFactory implements CreateXMemberFactory {

	private ArrayList MemberList;

	@Override
	public Command Create() {
		Command a = new CreateMember(MemberList);
		return a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
		
	}

}
