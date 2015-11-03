package adapter;

import java.sql.Date;
import java.text.SimpleDateFormat;

public abstract class Xmember {
	
	private String id,type,name,address,expireDate;
	
	
	public abstract String getid();
	public abstract String getType();
	public abstract String getName();
	public abstract String getAddress();
	public abstract String getExpireDate();
	
	@Override
	public String toString() {
		return "Member information\n"
				+ "Expire Date  ID			  Type		Name		Address 				\n" 
				+getExpireDate()+"  "+getid()+"			  "+getType()+"		"+getName()+"		"+getAddress();
		
	}
	
	public abstract void setAddress(String address);
	
	


}
