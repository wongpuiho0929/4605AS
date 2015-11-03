package command;

import java.util.ArrayList;
import java.util.Vector;

import AJCS.AdvanceMem;
import AJCS.Member;
import WLTS.Client;
import WLTS.ClientCare;
import WLTS.VIP;
import WLTS.VIP_Family;

public class CreateClient implements Command {

	private ArrayList clients;
	
	
	public CreateClient(ArrayList clients) {
		this.clients = clients;
	}
	

	@Override
	public void execute() {
		Client [] client = {new VIP(),new VIP_Family()};
		ClientCare m1 = new ClientCare(client);
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
