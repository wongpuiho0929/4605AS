package AJCS;

public class AdvanceMem {
	private Member[] members;
	private int typeMemberIndex;
		

	public Member[] getMembers() {
		return members;
	}

	public void setMembers(Member[] members) {
		this.members = members;
	}

	public int getTypeMemberIndex() {
		return typeMemberIndex;
	}

	public void setTypeMemberIndex(int typeMemberIndex) {
		this.typeMemberIndex = typeMemberIndex;
	}

	public Member createMem(){
		return members[typeMemberIndex];
		
	}
	
	public Member searchMem(String id){
		return null;
		
		
		
	}
	
	public void updateAddress(String id){
		
		
	}
	
	public void extendGoodTill(String id){
		
		
	}
	
	public boolean stillGood(String id){
		return false;
		
		
	}
}
