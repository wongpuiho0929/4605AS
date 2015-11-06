package adapter;



public abstract class Xmember {
	
	
	public abstract String getid();
	public abstract String getType();
	public abstract String getName();
	public abstract String getAddress();
	public abstract String getExpireDate();
	
	@Override
	public String toString() {
		
		return String.format("%12s %-14s %-10s %-15s %s",getExpireDate(),getid(),getType(),getName(),getAddress());
				
		
	}
	
	public String toStringOne(){
		return "ID: "+getid()+"\n"
					+ "Type: "+getType()+"\n"
					+ "Name: "+getName()+"\n"
					+ "Address: "+getAddress()+"\n"
					+ "Expire date(DD-MM-YYYY): "+getExpireDate();
	}
	
	public abstract void setAddress(String address);
	public abstract void setExpireDate();
	


}
