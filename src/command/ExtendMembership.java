package command;

import java.util.ArrayList;
import java.util.Scanner;

import AJCS.Member;
import WLTS.Client;
import adapter.ClientAdapter;
import adapter.MemberAdapter;
import adapter.Xmember;

public class ExtendMembership implements Command {
	
	private ArrayList memberList;
	
	public ExtendMembership(ArrayList memberList) {
		this.memberList = memberList;
	}

	@Override
	public void execute() {
		Xmember member = null;
		System.out.print("Enter id");
		Scanner kb = new Scanner(System.in);
		String temp = kb.nextLine();
		for(int i=0;i<memberList.size();i++){
			if(memberList.get(i) instanceof AJCS.CompanyMember||memberList.get(i) instanceof AJCS.PrimaryMember){
				member = new MemberAdapter((Member)memberList.get(i));
			}else if(memberList.get(i) instanceof WLTS.VIP||memberList.get(i) instanceof WLTS.VIP_Family){
				member = new ClientAdapter((Client)memberList.get(i));
				
			}
			
			if(temp.equals(member.getid())){
				member.setExpireDate();
				
				break;
			}
		}
		
	}

}
