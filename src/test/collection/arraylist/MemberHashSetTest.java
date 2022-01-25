package test.collection.arraylist;

import test.collection.Member;

import javax.swing.*;


/**
 * packageName    : test.collection.arraylist
 * fileName       : MemberHashSetTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class MemberHashSetTest {
      public static void main(String[] args) {
            MemberHashSet memberHashSet = new MemberHashSet();

            memberHashSet.addMember(new Member(1001, "박상준"));
            memberHashSet.addMember(new Member(1002, "손민국"));
            memberHashSet.addMember(new Member(1003, "박서훤"));


            memberHashSet.showAllMember();

            memberHashSet.addMember(new Member(1003, "홍길동"));
            memberHashSet.showAllMember();
            System.out.println("========================");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    