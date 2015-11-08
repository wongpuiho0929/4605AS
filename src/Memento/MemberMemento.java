package Memento;

import java.util.ArrayList;
import java.util.Stack;

import adapter.Xmember;

public class MemberMemento implements Memento{
	private ArrayList<Xmember> memberList;
	private Stack<Xmember> redo;

	public MemberMemento(ArrayList<Xmember> memberList) {
		
		this.memberList = memberList;
		redo = new Stack<Xmember>();
	}

	@Override
	public void restore() {
		redo.push(memberList.get(memberList.size()-1));
		memberList.remove(memberList.size()-1);
		
	}

	@Override
	public void reRestore() {
		memberList.add(redo.pop());
		
	}
	


}
