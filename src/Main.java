import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;

import command.*;

import AJCS.*;

public class Main{

	public static void main(String[] arg) throws Exception {
		
		ArrayList memberList = new ArrayList(); 
		
		while (true) {
			System.out
					.println("X Mem Management System\nPlease Enter Command [c|s|a|e|u|r|l|X]\n"
							+ "c = create membership, s = show membership details, a = update address, e = extend membership, u\n"
							+ "= undo, r = redo, l = list undo/redo,	X = eXit system");
			Scanner kb = new Scanner(System.in);
			String temp = kb.next();
			
			if (temp.equals("c")) {
				System.out.println("Which Company(AJCS/WLTS)");
				temp = kb.next();
				if(temp.equals("AJCS")){
					Command a = new CreateMember(memberList);
					a.execute();}
				else if(temp.equals("WLTS")){
					Command a = new CreateClient(memberList);
					a.execute();
				}
				
			}else if(temp.equals("s")){
				Command a = new ShowMember(memberList);
				a.execute();
			}
			
		}
	}

}
