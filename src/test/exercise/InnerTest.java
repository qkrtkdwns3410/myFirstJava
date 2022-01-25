package test.exercise;

import java.util.function.IntConsumer;


/**
 * packageName    : test.exercise
 * fileName       : InnerTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class InnerTest {
      public static void main(String[] args) {
            OutClass outClass = new OutClass();
            System.out.println("외부 클래스 이용하여 내부 클래스 기능을 호출");
            outClass.usingClass();
      }
}

class OutClass {
      private static int sNum = 20; // 외부 클래스 정적 변수
      private int num = 10;//외부 클래스 private 변수
      private InClass inClass; // 내부 클래스 자료형 변수를 먼저 선언

      public OutClass() {
            inClass = new InClass();
      } // 외부 클래스 디폴트 생성자. 외부 클래스가 생성된 후에 내부 클래스 생성가능

      public void usingClass() {
            inClass.inTest();
      }

      static class InStaticClass { //정적 내부 클래스
            static int sInNum = 200; //정적 내부 클래스의 정적 변수
            int inNum = 100; //정적 내부 클래스의 인스턴스 변수

            void inTest() {
//                  num += 10;  << 외부 클래스의 인스턴스 변수는 사용할 수 없습니다.
                  System.out.println("inNum = " + inNum + "내부 클래스의 인스턴스 변수 사용");
                  System.out.println("sInNum = " + sInNum + "내부 클래스의 정적 변수 사용");
                  System.out.println("sNum = " + sNum + "외부 클래스의 정적 변수 사용");
            }

            static void sTest() {
//                  num += 10;
//                  inNum+=10;
                  //외부 클래스와 내부 클래스의 인스턴스 변수는 사용 X 주석처리
                  System.out.println("sNum = " + sNum); //외부 클래스의 정적 변수 사용
                  System.out.println("sInNum = " + sInNum); //내부 클래스의 정적 변수 사용
            }
      }

      class InClass { // 인스턴스 내부 클래스
            int inNum = 100; // 내부 클래스의 인스턴스 변수
            //static int sInNum=200 //인스턴스 내부 클래스에 정적 변수 선언이 불가능합니다
            //오류가 발생하므로 주석 처리함

            void inTest() {
                  System.out.println("num = " + num + "(외부 클래스의 인스턴스 변수)");
                  System.out.println("sNum = " + sNum + "(외부 클래스의 정적 변수)");
            }


      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    