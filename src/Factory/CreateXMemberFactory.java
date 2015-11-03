package Factory;

import java.util.ArrayList;

import command.Command;

public interface CreateXMemberFactory {
	public Command Create();
	public void setMemberList(ArrayList MemberList);
}
