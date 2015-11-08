package command;

import Memento.Caretaker;

public class ListCommand implements Command {

	private Caretaker ct;
	
	public ListCommand(Caretaker ct) {
		this.ct = ct;
	}

	@Override
	public void execute() {
		System.out.println(ct.toString());
		
	}

}
