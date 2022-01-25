package test.collection.arraylist;

import test.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;


/**
 * packageName    : test.collection.arraylist
 * fileName       : MemberArrayList
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class MemberArrayList {
      private ArrayList<Member> arrayList;

      public MemberArrayList() {
            arrayList = new ArrayList<>();
      }

      public void addMember(Member member) {
            arrayList.add(member);
      }// 회원추가

      public boolean removeMember(int memberId) {
            Iterator<Member> iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                  Member member = iterator.next();
                  int tempId = member.getMemberId();
                  if (tempId == memberId) {
                        arrayList.remove(member);
                        return true;
                  }
            }
            System.out.println(memberId + " 가 존재하지 않습니다");
            return false;
      }

      public void insertMember(Member member, int index) {
            System.out.println("MemberArrayList.insertMember");

            arrayList.add(index, member);

      }

      public void showAllMember() {
            for (Member member : arrayList) {
                  System.out.println("member = " + member);
            }
            System.out.println();
      } // 전체 회원을 출력하는 메서드


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    