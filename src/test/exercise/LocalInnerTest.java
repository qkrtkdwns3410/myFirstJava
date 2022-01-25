package test.exercise;

/**
 * packageName    : test.exercise
 * fileName       : LocalInnerTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class LocalInnerTest {
      public static void main(String[] args) {
            Outer out = new Outer();
            Runnable runnable = out.getRunnable(10); //메서드 호출
            runnable.run();

      }
}

class Outer {
      int outNum = 100;
      static int sNum = 200;

      Runnable getRunnable(int i) { //Runnable 자바에서 스레드를 만들 때 사용하는 인터페이스
            int num = 100;    //지역 변수

            class MyRunnable implements Runnable { //지역 내부 클래스
                  int localNum = 10; // 지역 내부 클래스의 인스턴스 변수


                  @Override
                  public void run() {
                        //num =200 >> 지역 변수는 상수로 바뀜 > 값을 변경할 수 없어서 오류
                        // i =100 >> 매개변수도 지역 변수로 바뀌므로 값을 변경이 불가능합니다

                        System.out.println("i = " + i);
                        System.out.println("num = " + num);
                        System.out.println("localNum = " + localNum);
                        System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                        System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
                  }
            }
            return new MyRunnable();

      }

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Outer{");
            sb.append("outNum=")
                    .append(outNum);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    