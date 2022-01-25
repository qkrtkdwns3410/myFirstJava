package test.collection;

/**
 * packageName    : test.collection
 * fileName       : MemberHashMapTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class MemberHashMapTest {
      public static void main(String[] args) {
            MemberHashMap memberHashMap = new MemberHashMap();

            Member memberLee = new Member(1001, "이지원");
            Member memberKim = new Member(1002, "손민국");
            Member memberPark = new Member(1003, "박서훤");
            Member memberHong = new Member(1004, "홍길동");

            memberHashMap.addMember(memberHong);
            memberHashMap.addMember(memberKim);
            memberHashMap.addMember(memberPark);
            memberHashMap.addMember(memberLee);

            memberHashMap.showAllMember();

            memberHashMap.removeMember(1004);
            memberHashMap.showAllMember();
            System.out.println("========================");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    