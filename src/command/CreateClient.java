package command;

import java.util.ArrayList;
import WLTS.Client;
import WLTS.ClientCare;
import WLTS.VIP;
import WLTS.VIP_Family;
import adapter.ClientAdapter;
import adapter.Xmember;

public class CreateClient implements Command {

	private ArrayList<Xmember> memberList;
	
	
	public CreateClient(ArrayList<Xmember> memberList) {
		this.memberList = memberList;
	}
	

	@Override
	public void execute() {
		System.out.println("Enter id;type;name;address:");
		Client [] client = {new VIP(),new VIP_Family()};
		ClientCare m1 = new ClientCare(client);
		Client a = m1.createClient();
		Xmember xmem = new ClientAdapter(a);
		memberList.add(xmem);
		System.out.print("New a record successfully"+"\n");
		
	}

	

}
