import java.util.Scanner;
import java.util.Vector;

import command.*;

import AJCS.*;

public class Main extends Thread {

	public static void main(String[] arg) throws Exception {
		
		Vector<Member> memberList = new Vector<Member>();
		
		while (true) {
			System.out
					.println("X Mem Management System\nPlease Enter Command [c|s|a|e|u|r|l|X]\n"
							+ "c = create membership, s = show membership details, a = update address, e = extend membership, u\n"
							+ "= undo, r = redo, l = list undo/redo,	X = eXit system");
			Scanner kb = new Scanner(System.in);
			String temp = kb.next();
			if (temp.equals("c")) {
				Command a = new CreateMember(memberList);
				a.execute();
			}else if(temp.equals("s")){
				Command a = new ShowMember(memberList);
			}else if(temp.equals("s")){
				System.out.print("ss");
				
			}
			
		}
	}

}
