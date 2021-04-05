package collection;

public class Member implements Comparable<Member> {

	private int memberID;
	private String memberName;
	
	public Member(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		return memberName + "회원님의 아이디는" + memberID + "입니다.";
	}
	
	
	@Override
	public int hashCode() {
		return memberID;
		//hashCode()가 memberID를 반환하도록 재정의한다.
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID) {
				//매개변수로 받은 회원ID가 자신의 회원ID와 같다면 true반환
				return true;
			}
			else
				return false;
		}
		return false;
		
	}
	
	@Override
	public int compareTo(Member member) {
		int result =  this.memberName.compareTo(member.memberName);
		return result;
	}
	
	
}
