package collection;


import java.util.Comparator;

public class Member2 implements Comparator<Member2> {
	
	private int memberID;
	private String memberName;
	
	public Member2(int memberID, String memberName) {
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
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj;
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
	public int compare(Member2 mem1, Member2 mem2) {
		return mem1.getMemberID() - mem2.getMemberID();
	}
	

}
