package Memento;

import java.util.Stack;

import adapter.Xmember;

public class Caretaker {
	private Stack<Memento> undoList;
	
	public Caretaker(){
		undoList = new Stack<Memento>();
		
	}
	
	public void saveMemento(Xmember xmem){
		Memento mmt = new Memento(xmem);
		undoList.push(mmt);
		
	}
	
	public void undo(){
		undoList.pop().restore();
		
	}
		
}
