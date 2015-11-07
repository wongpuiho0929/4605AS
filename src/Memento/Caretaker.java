package Memento;

import java.util.ArrayList;
import java.util.Stack;
import adapter.Xmember;

public class Caretaker {
	private Stack<Memento> undoList;
	
	public Caretaker(){
		undoList = new Stack<Memento>();
		
	}
	
	public void saveMemento(Xmember xmem){
		Memento mmt = new DataMemento(xmem);
		undoList.push(mmt);
		
	}
	
	public void saveMember(ArrayList<Xmember> memberList){
		Memento mmt = new MemberMemento(memberList);
		undoList.push(mmt);
	}
	
	public void undo(){
		undoList.pop().restore();
		
	}
		
}
