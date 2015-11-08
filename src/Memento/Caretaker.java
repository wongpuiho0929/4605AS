package Memento;

import java.util.ArrayList;
import java.util.Stack;
import adapter.Xmember;

public class Caretaker {
	private Stack<Memento> undoList;
	private Stack<Memento> redoList;
	
	public Caretaker(){
		undoList = new Stack<Memento>();
		redoList = new Stack<Memento>();
		
	}
	
	public void saveMemento(Xmember xmem){
		Memento mmt = new DataMemento(xmem);
		undoList.push(mmt);
		
	}
	
	public void saveMember(ArrayList<Xmember> memberList ,String id){
		Memento mmt = new MemberMemento(memberList,id);
		undoList.push(mmt);
	}
	
	public void undo(){
		redoList.push(undoList.pop());
		redoList.lastElement().restore();
		
	}
	
	public void redo(){
		undoList.push(redoList.pop());
		undoList.lastElement().reRestore();
		
	}

	public Stack<Memento> getUndoList() {
		return undoList;
	}

	public Stack<Memento> getRedoList() {
		return redoList;
	}
	

		
}
