package command;

import Memento.Caretaker;

public class RedoCommand implements Command{

	private Caretaker ct;
	
	public RedoCommand(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public void execute() {
		ct.redo();
		System.out.println("redo");
		
	}

}
