import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import command.*;

import AJCS.*;
import Factory.*;

public class Main{

	public static void main(String[] arg) throws Exception {
		
		ArrayList memberList = new ArrayList(); 
		String [] factory ={"CreateFactory","ShowMemberFactory",
				"UpdateAddressFactory","ExtendMembershipFactory"};
		Factory [] facts = new Factory[factory.length]; 
		String [] CommandIndex = {"c","s","a","e","u","l"};
		try{
			for(int i=0;i<facts.length;i++){
				facts[i] = (Factory) Class.forName("Factory."+factory[i]).newInstance();
				facts[i].setMemberList(memberList);
			}
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
		while (true) {
			System.out
					.println("\nX Mem Management System\nPlease Enter Command [c|s|a|e|u|r|l|X]\n"
							+ "c = create membership, s = show membership details, a = update address, e = extend membership, \n"
							+ "u = undo, r = redo, l = list undo/redo,	X = eXit system");
			
			Scanner kb = new Scanner(System.in);
			String temp = kb.next();
			int index=-1;
			for(int i=0;i<CommandIndex.length;i++){
				if(temp.equals(CommandIndex[i])){
					index = i;
				}
				
			}
			if(temp.equals("X")){
				System.exit(0);
			}else{
				Command a = facts[index].Create();
				a.execute();
			}
			
		}
	}

}
