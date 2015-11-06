package command;

import java.util.ArrayList;
import java.util.Scanner;
import adapter.Xmember;

public class ExtendMembership implements Command {
	
	private ArrayList<Xmember> memberList;
	private Scanner kb;
	
	public ExtendMembership(ArrayList<Xmember> memberList) {
		this.memberList = memberList;
	}

	@Override
	public void execute() {
		System.out.print("Enter id");
		kb = new Scanner(System.in);
		String temp = kb.nextLine();
		for(int i=0;i<memberList.size();i++){
			Xmember member = memberList.get(i);
			if(temp.equals(member.getid())){
				member.setExpireDate();
				break;
			}
		}
		
	}

}
