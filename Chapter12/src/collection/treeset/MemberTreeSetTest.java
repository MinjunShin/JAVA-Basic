package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberPark = new Member(1001, "HY");
		Member memberShin = new Member(1002, "MJ");
		Member memberKim = new Member(1003, "AB");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberShin);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.showAllMember();
		
		//Member memberHong = new Member(1003, "BC");
		//memberTreeSet.addMember(memberHong);
		
		//memberTreeSet.showAllMember();

	}

}