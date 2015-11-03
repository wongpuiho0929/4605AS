package adapter;

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
				+ "ID: " + getid() + "\n"
						+ "Type: " + getType() + "\n"
								+ "Name: " + getName() + "\n"
										+ "Address: " + getAddress() + "\n"
												+ "Expire date(DD-MM-YYYY): " + getExpireDate();
	}
	
	public abstract void setAddress(String address);
	
	


}
