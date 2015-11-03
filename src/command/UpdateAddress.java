package command;

import java.util.ArrayList;
import java.util.Scanner;

import AJCS.Member;
import WLTS.Client;
import adapter.ClientAdapter;
import adapter.MemberAdapter;
import adapter.Xmember;

public class UpdateAddress implements Command{

	private ArrayList memberList;
	
	
	public UpdateAddress(ArrayList memberList) {
		this.memberList = memberList;
	}


	@Override
	public void execute() {
		Xmember member = null;
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter id");
		String temp = kb.nextLine();
		for(int i=0;i<memberList.size();i++){
			if(memberList.get(i) instanceof AJCS.CompanyMember||memberList.get(i) instanceof AJCS.PrimaryMember){
				member = new MemberAdapter((Member)memberList.get(i));
			}else if(memberList.get(i) instanceof WLTS.VIP||memberList.get(i) instanceof WLTS.VIP_Family){
				member = new ClientAdapter((Client)memberList.get(i));
				
			}
			
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
