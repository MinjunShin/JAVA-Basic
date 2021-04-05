package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.Member;

public class MemberHashMap {

	private HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer, Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
		//HashMap에 회원을 추가하는 메서드
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)){
			hashMap.remove(memberID);
			//HashMap매개변수로 받은 키 값인 회원 아이디가 있다면
			//해당 회원 삭제
			return true;			
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) { //다음key가 있으면
			int key = ir.next(); //key값을 가져와서
			Member member = hashMap.get(key); //key로부터 value 가져오기
			System.out.println(member);
		}
		System.out.println();
	}
}
