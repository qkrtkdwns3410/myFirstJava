package test.collection;

import javax.swing.tree.TreeCellRenderer;
import java.util.Iterator;
import java.util.TreeMap;


/**
 * packageName    : test.collection
 * fileName       : MemberTreeMap
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class MemberTreeMap {
      private TreeMap<Integer, Member> treeMap;

      public MemberTreeMap() {
            treeMap = new TreeMap<>();
      }

      public void addMember(Member member) {
            treeMap.put(member.getMemberId(), member);
      }

      public boolean removeMembeer(int memberId) {
            if (treeMap.containsKey(memberId)) {
                  treeMap.remove(memberId);
                  return true;
            }
            System.out.println(memberId + "가 존재하지 않습니다");
            return false;
      }

      public void showAllMember() {
            Iterator<Integer> iterator = treeMap.keySet()
                    .iterator();
            while (iterator.hasNext()) {
                  int key = iterator.next();
                  Member member = treeMap.get(key);
                  System.out.println("member = " + member);

            }
            System.out.println();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    