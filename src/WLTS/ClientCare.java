package WLTS;

import java.util.Date;
import java.util.Scanner;



public class ClientCare {
	private Client[] clients ;
	
	
	public ClientCare(Client[] clients) {
		this.clients = clients;
	}

	public Client createClient(){
		String[] typeMember ={"VIP","VIPF"};
		Scanner kb = new Scanner(System.in);
		String statement =kb.next();
		String [] eachStatement=statement.split(";");
		int typeMemberIndex = 0;
		for(int i=0;i<typeMember.length;i++){
			if(eachStatement[1].equals(typeMember[i])){
				typeMemberIndex = i;
			}	
		}
		Client a = clients[typeMemberIndex];
		a.setCid(Integer.parseInt(eachStatement[0]));
		a.setFullName(eachStatement[2]);
		Date date= new Date();
		date.setYear(date.getYear()+1);
		a.setExpiryDate(date);
		a.setHomeAddress(eachStatement[3]); 
		return a;
		
	}
	
	public Client foundClient(int cid){
		return null;
		
		
	}
	
	public void amendAddress(int cid){
		
	}
	
	public void extendExpiryDate(int cid){
		
	}
	
	public boolean isExpired(int cid){
		return false;
		
	}
}
