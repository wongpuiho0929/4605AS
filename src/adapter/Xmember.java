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
		return "Xmember [id=" + id + ", type=" + type + ", name=" + name + ", address=" + address + ", expireDate="
				+ expireDate + "]";
	}
	
	


}