package Memento;

import adapter.Xmember;

public class DataMemento implements Memento{
	private Xmember xmem;
	private String name,address,date;
	
	public DataMemento(Xmember xmem){
		this.xmem = xmem;
		name = xmem.getName();
		address = xmem.getAddress();
		date = xmem.getExpireDate();
		
	}
	
	public void restore(){
		xmem.setName(name);
		xmem.setAddress(address);
		xmem.setExpireDate(date);
		
	}
}
