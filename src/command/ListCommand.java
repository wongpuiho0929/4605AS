package command;

import java.util.Stack;

import Memento.Caretaker;
import Memento.Memento;

public class ListCommand implements Command {

	private Caretaker ct;
	
	public ListCommand(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public void execute() {
		Stack<Memento> undo = ct.getUndoList();
		Stack<Memento> redo = ct.getRedoList();
		System.out.println("Undo List");
		for(int i=0;i<undo.size();i++){
			System.out.println(undo.get(i).getId());
		}
		System.out.println("Redo List");
		for(int i=0;i<redo.size();i++){
			System.out.println(redo.get(i).getId());
		}
		
	}

}
