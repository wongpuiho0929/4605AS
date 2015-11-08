package WLTS;

import java.util.Date;
import java.util.Scanner;

public class ClientCare {
	private Client[] clients;

	public ClientCare(Client[] clients) {
		this.clients = clients;
	}

	public Client createClient() {
		String[] typeMember = { "VIP", "VIPF" };
		Scanner kb = new Scanner(System.in);
		while (true) {
			String statement = kb.nextLine();
			String[] eachStatement = statement.split(";");
			int typeMemberIndex = -1;
			if (!statement.isEmpty()) {
				try {
					for (int i = 0; i < typeMember.length; i++) {
						if (eachStatement[1].equals(typeMember[i])) {
							typeMemberIndex = i;
						}
					}
				} catch (ArrayIndexOutOfBoundsException ex) {
					System.out.println("Not MATCH");
				}
				if (eachStatement.length == 4) {
					Client a = clients[typeMemberIndex];
					a.setCid(Integer.parseInt(eachStatement[0]));
					a.setFullName(eachStatement[2]);
					Date date = new Date();
					date.setYear(date.getYear() + 1);
					a.setExpiryDate(date);
					a.setHomeAddress(eachStatement[3]);
					return a;
				} else {
					System.out.println("Please check the Input Data");
					System.out.println("Enter id;type;name;address:");
				}
			} else {
				System.out.println("Please Input data");
				System.out.println("Enter id;type;name;address:");
			}
		}

	}

	public Client foundClient(int cid) {
		return null;

	}

	public void amendAddress(int cid) {

	}

	public void extendExpiryDate(int cid) {

	}

	public boolean isExpired(int cid) {
		return false;

	}
}
