package Factory;

import java.util.ArrayList;

import command.Command;
import command.CreateClient;

public class CreateClientFactory implements CreateXMemberFactory{
	private ArrayList MemberList;


	@Override
	public Command Create() {
		Command a = new CreateClient(MemberList);
		return a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
		
	}


}
