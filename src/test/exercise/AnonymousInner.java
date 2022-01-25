package test.exercise;

import java.io.InterruptedIOException;


/**
 * packageName    : test.exercise
 * fileName       : AnonymousInner
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class AnonymousInner {
      public static void main(String[] args) {
            Outer3 outer3 = new Outer3();
            Runnable runnable = outer3.getRunnable(10);
            runnable.run();
            outer3.runner.run();
      }
}

class Outer3 {

      Runnable getRunnable(int i) { //익명 내부 클래스 Runnable 인터페이스 생성 MyRunnable 클래스 이름을 뺴고 클래스를 바로 생성하는 방법입니다
            int num = 10;
            return new Runnable() {
                  @Override
                  public void run() {
                        System.out.println("i = " + i);
                        System.out.println("num = " + num);
                  }
            };
      }

      Runnable runner = new Runnable() { //익명 내부 클래스를 변수에 대입
            @Override
            public void run() {
                  System.out.println("Runnable 이 구현된 익명 클래스 변수");

            }
      };

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    