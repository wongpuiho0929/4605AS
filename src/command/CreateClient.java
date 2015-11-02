package command;

import java.util.Vector;

import AJCS.AdvanceMem;
import AJCS.Member;
import WLTS.Client;
import WLTS.ClientCare;

public class CreateClient implements Command {

	private Vector<Client> clients;
	
	
	public CreateClient(Vector<Client> clients) {
		this.clients = clients;
	}

	@Override
	public void execute() {
		ClientCare m1 = new ClientCare();
		Client a = m1.createClient();
		clients.add(a);
		for (int i = 0; i < clients.size(); i++) {
			System.out.print(clients.get(i).toString() + "\n"
					+clients.get(i).getClass()+"\n");
		}
		
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
