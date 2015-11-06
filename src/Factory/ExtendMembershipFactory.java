package Factory;

import java.util.ArrayList;

import Memento.Caretaker;
import command.Command;
import command.ExtendMembership;

public class ExtendMembershipFactory implements Factory{

	private ArrayList MemberList;
	private Caretaker ct;
	@Override
	public Command Create() {
		Command a = new ExtendMembership(MemberList,ct);
		return a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
		
	}

	@Override
	public void setUndoList(Caretaker ct) {
		this.ct =ct;
		
	}

}
