package hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Member;

public class MemberHashSet {

	private HashSet<Member> hashSet;
	
	public MemberHashSet(){
		hashSet = new HashSet<Member>();
		//hashSet생성
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		Iterator<Member> ir = hashSet.iterator();
		//Iterator를 통해 순회
		
	    while(ir.hasNext()) {
	    	Member member = ir.next();
	    	int tempID = member.getMemberID();
	    	if(tempID == memberID) {
	    		hashSet.remove(member);
	    		return true;
	    	}	    		    	
	    }
    	System.out.println(memberID + "가 존재하지 않습니다.");
    	return false;
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}


