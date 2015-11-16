package WLTS;

import java.util.Date;
import java.util.Scanner;

public class ClientCare {
	private Client[] clients;
	private int typeMemberIndex = -1;
	private String[] typeMember = { "VIP", "VIPF" };

	public ClientCare(Client[] clients) {
		this.clients = clients;
	}

	public Client createClient() {
		Scanner kb = new Scanner(System.in);
		while (true) {
			String statement = kb.nextLine();
			String[] eachStatement = statement.split(";");

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
				if (eachStatement.length == 4 && typeMemberIndex != -1) {
					Client a = clients[typeMemberIndex];
					if (validate(eachStatement[0])) {
						a.setCid(Integer.parseInt(eachStatement[0]));
						a.setFullName(eachStatement[2]);
						Date date = new Date();
						date.setYear(date.getYear() + 1);
						a.setExpiryDate(date);
						a.setHomeAddress(eachStatement[3]);
						return a;
					} else {
						System.out.println("Wrong ID");
					}
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

	public boolean validate(String id) {
		boolean chk = false;
		char[] temp = id.toCharArray();
		int total = 0;
		for (int i = 0; i < temp.length; i++) {
			total += Integer.parseInt(temp[i] + "");
		}
		if (typeMemberIndex == 0) {
			if (Integer.parseInt(temp[0] + "") == 3) {
				if (total % 6 == 0) {
					chk = true;
				}
			}

		} else if (typeMemberIndex == 1) {

			if (Integer.parseInt(id.substring(0,3)) == 303) {
				if (total % 6 == 0) {
					chk = true;
				}
			}

		}
		return chk;

	}
}
