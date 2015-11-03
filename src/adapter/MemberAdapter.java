package adapter;

import java.text.SimpleDateFormat;

import AJCS.Member;

public class MemberAdapter extends Xmember{
	private Member member;
	private SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");
	
	public MemberAdapter(Member member) {
		this.member = member;
	}

	@Override
	public String getid() {
		return member.getId();
	}

	@Override
	public String getType() {
		return member.getClass().getName();
	}

	@Override
	public String getName() {
		return member.getName();
	}

	@Override
	public String getAddress() {
		return member.getPostal();
	}

	@Override
	public String getExpireDate() {
		return date.format(member.getGoodTill());
	}

	@Override
	public void setAddress(String address) {
		member.setPostal(address);
		
	}

}
