package command;

import java.util.ArrayList;
import java.util.Scanner;
import adapter.Xmember;

public class UpdateAddress implements Command{

	private ArrayList<Xmember> memberList;
	private Scanner kb;
	
	
	public UpdateAddress(ArrayList<Xmember> memberList) {
		this.memberList = memberList;
	}


	@Override
	public void execute() {
		kb = new Scanner(System.in);
		System.out.println("Enter id");
		String temp = kb.nextLine();
		for(int i=0;i<memberList.size();i++){
			Xmember member = memberList.get(i);
			if(temp.equals(member.getid())){
				System.out.println("Enter address:");
				String address = kb.nextLine(); 
				member.setAddress(address);
				System.out.println("Member address updated.");
				break;
			}
		}
		
	}

}
