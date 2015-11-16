package command;

import java.util.ArrayList;
import java.util.Scanner;

import Memento.Caretaker;
import adapter.Xmember;

public class ExtendMembership implements Command {

	private ArrayList<Xmember> memberList;
	private Scanner kb;
	private Caretaker ct;
	private boolean found = false;

	public ExtendMembership(ArrayList<Xmember> memberList, Caretaker ct) {
		this.memberList = memberList;
		this.ct = ct;
	}

	@Override
	public void execute() {
		System.out.println("Enter id");
		kb = new Scanner(System.in);
		String temp = kb.nextLine();
		for (int i = 0; i < memberList.size(); i++) {
			Xmember member = memberList.get(i);
			if (temp.equals(member.getid())) {
				ct.saveMemento(member,"Extend Membership ");
				member.setExpireDate();
				found = true;
				System.out.println("\nMembership extended:");
				System.out.println(member.toStringExtend()+"\n");
				break;
			}
		}
		if (!found) {
			System.out.println("Cannot find any account");
		}

	}

}
