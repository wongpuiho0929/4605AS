package Memento;

import java.util.ArrayList;


import adapter.Xmember;

public class MemberMemento implements Memento{
	private ArrayList<Xmember> memberList;

	public MemberMemento(ArrayList<Xmember> memberList) {
		
		this.memberList = memberList;
	}

	@Override
	public void restore() {
		memberList.remove(memberList.size()-1);
		
	}

}
