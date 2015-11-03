package Factory;

import java.util.ArrayList;

import command.Command;
import command.UpdateAddress;

public class UpdateAddressFactory implements Factory{

	private ArrayList MemberList;
	@Override
	public Command Create() {
		
		Command a = new UpdateAddress(MemberList);
		return a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
		
	}

}
