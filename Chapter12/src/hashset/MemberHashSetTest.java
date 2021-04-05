package hashset;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberPark = new Member(1001, "HY");
		Member memberShin = new Member(1002, "MJ");
		Member memberKim = new Member(1003, "AB");
		
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberShin);
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();
		
		Member memberHong = new Member(1003, "BC");
		memberHashSet.addMember(memberHong);
		
		memberHashSet.showAllMember();

	}

}
