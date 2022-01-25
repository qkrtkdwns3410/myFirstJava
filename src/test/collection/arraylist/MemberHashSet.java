package test.collection.arraylist;

import test.collection.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TooManyListenersException;


/**
 * packageName    : test.collection.arraylist
 * fileName       : MemberHashSet
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class MemberHashSet {
      private HashSet<Member> hashSet;

      public MemberHashSet() {
            hashSet = new HashSet<>();
      }

      public void addMember(Member member) {
            hashSet.add(member);
      }//hashSet에 회원 추가


      public boolean removeMember(int memberId) {
            Iterator<Member> ir = hashSet.iterator();

            while (ir.hasNext()) {
                  Member member = ir.next(); // 회원을 하나씩 가져와서
                  int tempId = member.getMemberId(); //아이디를 비교합니다
                  if (tempId ==  memberId) {
                        hashSet.remove(member);
                        return true;
                  }
            }
            System.out.println(memberId + " 가 없음");
            return false;
      }

      public void showAllMember() {
            for (Member member : hashSet) {
                  System.out.println("member = " + member);
            }
            System.out.println();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    