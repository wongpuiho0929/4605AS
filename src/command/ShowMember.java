package command;

import java.util.Vector;

import AJCS.Member;

public class ShowMember implements Command{

	private Vector<Member> memberList;
	
	
	public ShowMember(Vector<Member> memberList) {
		this.memberList = memberList;
	}

	public void execute() {
		
		
	}

	public void undo() {
		// TODO Auto-generated method stub
		
	}
	
}
