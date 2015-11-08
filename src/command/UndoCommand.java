package command;


import Memento.Caretaker;


public class UndoCommand implements Command{

	private Caretaker ct;
	
	public UndoCommand(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public void execute() {
		ct.undo();
		System.out.println("undo");
	}

}
