package map.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {

		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberPark = new Member(1001, "HY");
		Member memberShin = new Member(1002, "HY");
		Member memberKim = new Member(1003, "AB");
		Member memberHong = new Member(1004, "Hong");
		
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberShin);
		memberHashMap.addMember(memberKim);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1003);
		
		memberHashMap.showAllMember();
				
		
	}

}
