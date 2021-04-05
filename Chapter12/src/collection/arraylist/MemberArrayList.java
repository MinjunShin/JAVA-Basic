package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;
//Member클래스는 collection 패키지에 있으므로 사용하려면 import한다.

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<Member>();
		//Member형으로 선언한 ArrayList 생성
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
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;

	}
	
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
		
	}
	
}
