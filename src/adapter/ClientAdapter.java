package adapter;

import java.text.SimpleDateFormat;

import WLTS.Client;

public class ClientAdapter extends Xmember{

	private Client client;
	private SimpleDateFormat date = new SimpleDateFormat();
	
	
	public ClientAdapter(Client client) {
		this.client = client;
	}

	@Override
	public String getid() {
		return client.getCid()+"";
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return client.getClass().getName();
	}

	@Override
	public String getName() {
		return client.getFullName();
	}

	@Override
	public String getAddress() {
		return client.getHomeAddress();
	}

	@Override
	public String getExpireDate() {
		return date.format(client.getExpiryDate());
	}

}