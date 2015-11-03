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
		return "Xmember [id1=" + getid() + ", type=" + getType() + ", name=" + getName() + ", address=" + getAddress() + ", expireDate="
				+ getExpireDate() + "]";
	}
	
	


}
