package Factory;

import java.util.ArrayList;

import command.Command;
import command.ExtendMembership;

public class ExtendMembershipFactory implements Factory{

	private ArrayList MemberList;
	
	@Override
	public Command Create() {
		Command a = new ExtendMembership(MemberList);
		return a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
		
	}

}
