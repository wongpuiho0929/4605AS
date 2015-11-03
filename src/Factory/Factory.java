package Factory;

import java.util.ArrayList;

import command.Command;

public interface Factory {
	public Command Create();
	public void setMemberList(ArrayList MemberList);
}
