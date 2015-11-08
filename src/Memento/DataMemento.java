package Memento;


import java.util.ArrayList;
import java.util.Stack;

import adapter.Xmember;

public class DataMemento implements Memento{
	private Xmember xmem;
	private String name,address,date;
	private Stack<DataCopy> redo;
	private String id;
	
	public DataMemento(Xmember xmem){
		redo = new Stack<DataCopy>();
		this.xmem = xmem;
		id = xmem.getid();
		name = xmem.getName();
		address = xmem.getAddress();
		date = xmem.getExpireDate();
	}
	
	public void restore(){
	
		DataCopy temp = new DataCopy(xmem.getName(),xmem.getAddress(),xmem.getExpireDate());
		redo.push(temp);
		xmem.setName(name);
		xmem.setAddress(address);
		xmem.setExpireDate(date);
	}

	@Override
	public void reRestore() {
		DataCopy temp = redo.pop();
		xmem.setName(temp.getName());
		xmem.setAddress(temp.getAddress());
		xmem.setExpireDate(temp.getDate());
		
		
	}

	@Override
	public String getId() {
		return id;
	}
	
}
