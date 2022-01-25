package test.collection.arraylist;

import test.collection.Member;


/**
 * packageName    : test.collection.arraylist
 * fileName       : MemberArrayListTest
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class MemberArrayListTest {
      public static void main(String[] args) {
            MemberArrayList memberArrayList = new MemberArrayList();

            Member memberLee = new Member(1001, "이지원");
            Member memberKim = new Member(1002, "김지원");
            Member memberBig = new Member(1003, "빅지원");
            Member memberSamuel = new Member(1004, "사무엘");

            memberArrayList.addMember(memberLee);
            memberArrayList.addMember(memberKim);
            memberArrayList.addMember(memberBig);
            memberArrayList.addMember(memberSamuel);

            memberArrayList.showAllMember(); //전체 회원 출력
            System.out.println("========================");
            memberArrayList.removeMember(memberKim.getMemberId());
            memberArrayList.showAllMember();
            System.out.println("========================");
            memberArrayList.insertMember(new Member(1005, "중간에 끼어든놈"), 2);
            memberArrayList.showAllMember();
            System.out.println("========================");;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    