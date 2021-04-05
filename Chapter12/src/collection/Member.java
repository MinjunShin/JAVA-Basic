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
		return memberName + "ȸ������ ���̵��" + memberID + "�Դϴ�.";
	}
	
	
	@Override
	public int hashCode() {
		return memberID;
		//hashCode()�� memberID�� ��ȯ�ϵ��� �������Ѵ�.
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberID == member.memberID) {
				//�Ű������� ���� ȸ��ID�� �ڽ��� ȸ��ID�� ���ٸ� true��ȯ
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