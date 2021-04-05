package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberPark = new Member(1001, "HY");
		Member memberShin = new Member(1002, "HY");
		Member memberKim = new Member(1003, "AB");
		
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberShin);
		memberArrayList.addMember(memberKim);
		//ArrayList에 회원 추가
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberKim.getMemberID());
		memberArrayList.showAllMember();	
		
		memberArrayList.insertMember(memberKim, 0);		
		memberArrayList.showAllMember();	
	}

}
