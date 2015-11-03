package command;

import java.util.ArrayList;
import java.util.Vector;

import AJCS.*;
import WLTS.*;
import adapter.*;

public class ShowMember implements Command{

	private ArrayList memberList;
	
	
	public ShowMember(ArrayList memberList) {
		this.memberList = memberList;
	}

	public void execute() {
		Xmember member= null;
		for(int i=0;i<memberList.size();i++){
				if(memberList.get(i) instanceof AJCS.CompanyMember||memberList.get(i) instanceof AJCS.PrimaryMember){
					member = new MemberAdapter((Member)memberList.get(i));
				}else if(memberList.get(i) instanceof WLTS.VIP||memberList.get(i) instanceof WLTS.VIP_Family){
					member = new ClientAdapter((Client)memberList.get(i));
					
				}
			System.out.print(member.toString()+"\n");
			
		}		
	}	
}