package command;

import java.util.ArrayList;
import java.util.Scanner;

import Memento.Caretaker;
import adapter.Xmember;

public class UpdateAddress implements Command{

	private ArrayList<Xmember> memberList;
	private Scanner kb;
	private Caretaker ct;
	
	
	public UpdateAddress(ArrayList<Xmember> memberList,Caretaker ct) {
		this.memberList = memberList;
		this.ct = ct;
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
				ct.saveMemento(member);
				member.setAddress(address);
				System.out.println("Member address updated.");
				break;
			}
		}
		
	}

}
