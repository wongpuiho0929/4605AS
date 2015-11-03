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
		System.out.println("Enter id;type;name;address:");
		Client [] client = {new VIP(),new VIP_Family()};
		ClientCare m1 = new ClientCare(client);
		Client a = m1.createClient();
		clients.add(a);
		System.out.print("New a record successfully"+"\n");
		
	}e

	

}
