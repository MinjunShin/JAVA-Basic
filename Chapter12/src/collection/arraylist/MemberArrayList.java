package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;
//MemberŬ������ collection ��Ű���� �����Ƿ� ����Ϸ��� import�Ѵ�.

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
		//Member������ ������ ArrayList ����
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public void insertMember(Member member, int index) {
		arrayList.add(index, member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = arrayList.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(member);
				return true;			}			
		}
		System.out.println(memberID + "�� �������� �ʽ��ϴ�.");
		return false;

	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
}
