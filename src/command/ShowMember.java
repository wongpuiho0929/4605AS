package command;

import java.util.ArrayList;
import java.util.Scanner;
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
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter id(*999 to show all)");
		String temp = kb.nextLine();
		if(temp.equals("*999")){
			for(int i=0;i<memberList.size();i++){
					if(memberList.get(i) instanceof AJCS.CompanyMember||memberList.get(i) instanceof AJCS.PrimaryMember){
						member = new MemberAdapter((Member)memberList.get(i));
					}else if(memberList.get(i) instanceof WLTS.VIP||memberList.get(i) instanceof WLTS.VIP_Family){
						member = new ClientAdapter((Client)memberList.get(i));
						
					}
				System.out.print(member.toString()+"\n");
				
			}
		}else{
			for(int i=0;i<memberList.size();i++){
				if(memberList.get(i) instanceof AJCS.CompanyMember||memberList.get(i) instanceof AJCS.PrimaryMember){
					member = new MemberAdapter((Member)memberList.get(i));
				}else if(memberList.get(i) instanceof WLTS.VIP||memberList.get(i) instanceof WLTS.VIP_Family){
					member = new ClientAdapter((Client)memberList.get(i));
					
				}
				
				if(temp.equals(member.getid())){
					System.out.print(member.toString()+"\n");
				}
			}
			
		}
		
	}
	
}
