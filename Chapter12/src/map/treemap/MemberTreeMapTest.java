package map.treemap;

import collection.Member;


public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap memberTreeMap = new MemberTreeMap();

		Member memberHong = new Member(1004, "Hong");
		Member memberShin = new Member(1002, "HY");
		Member memberPark = new Member(1001, "HY");
		Member memberKim = new Member(1003, "AB");

		
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberShin);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberHong);
		
		memberTreeMap.showAllMember();
		
		memberTreeMap.removeMember(1003);
		
		memberTreeMap.showAllMember();		
		
	}

}
