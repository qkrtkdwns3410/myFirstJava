package test.collection;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;
import java.util.HashMap;
import java.util.Iterator;


/**
 * packageName    : test.collection
 * fileName       : MemberHashMap
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class MemberHashMap {
      private HashMap<Integer, Member> hashMap;

      public MemberHashMap() {
            hashMap = new HashMap<>();
      }

      public void addMember(Member member) {
            hashMap.put(member.getMemberId(), member);
      }

      public boolean removeMember(int memberId) {
            if (hashMap.containsKey(memberId)) {
                  hashMap.remove(memberId);
                  return true;
            }
            System.out.println(memberId + " 가 존재 X");
            return false;
      }

      public void showAllMember() {
            Iterator<Integer> iterator = hashMap.keySet()
                    .iterator();
            while (iterator.hasNext()) {
                  int key = iterator.next(); //다음 key값을 가져와서
                  Member member = hashMap.get(key); //key 로부터 value 가져오기
                  System.out.println("member = " + member);
            }
            System.out.println();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    