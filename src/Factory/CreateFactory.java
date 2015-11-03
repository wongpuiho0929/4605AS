package Factory;

import java.util.ArrayList;
import java.util.Scanner;

import command.Command;

public class CreateFactory implements Factory {

	private ArrayList MemberList;
	
	@Override
	public Command Create() {
		String [] Xfactory = {"CreateClientFactory","CreateMemberFactory"};
		CreateXMemberFactory [] Xfacts = new CreateXMemberFactory[Xfactory.length] ;
		String [] CommandIndex = {"wlts","ajcs"};
		try{
			for(int i=0;i<Xfacts.length;i++){
				Xfacts[i] = (CreateXMemberFactory) Class.forName("Factory."+Xfactory[i]).newInstance();
				Xfacts[i].setMemberList(MemberList);
			
			}
		}catch(Exception c){
			c.printStackTrace();
		}
			Scanner kb = new Scanner(System.in);
			System.out.println("Enter Company Code (AJCS/WLTS):");
			String temp = kb.next();
			int index=-1;
			for(int i=0;i<CommandIndex.length;i++){
				if(temp.equals(CommandIndex[i])){
					index = i;
				}				
			}	
			Command a = Xfacts[index].Create();
			return a;
	}

	@Override
	public void setMemberList(ArrayList MemberList) {
		this.MemberList = MemberList;
		
	}

}
