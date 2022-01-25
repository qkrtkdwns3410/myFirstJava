package test.exercise.testmeplz;

import javax.swing.*;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Ex13_9
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Ex13_9 {
      public static void main(String[] args) {
            ThreadEx9_1 th1 = new ThreadEx9_1();
            th1.start();

            System.out.println("th1 = " + th1.isInterrupted());
            String input = JOptionPane.showInputDialog("아무 값이나 입력하세요");
            System.out.println("input = " + input);
            th1.interrupt(); //interrupt()을 호출하면, interrupted 상태가 true
            System.out.println("th1 = " + th1.isInterrupted());

            //main 스레드가 interrupt되었는지 확인
            System.out.println(Thread.interrupted()); //false

      }
}

class ThreadEx9_1 extends Thread { // 카운트 다운하는 스레드입니다
      @Override
      public void run() {
            int i = 10;
            while (i != 0 && !isInterrupted()) {
                  System.out.println(i--);
                  for (long x = 0; x < 25000000000L; x++) {
                        //시간 지연
                  }
                  System.out.println("카운트가 종료되었습니다");

                  System.out.println("========================");
                  System.out.println("this.isInterrupted() = " + this.isInterrupted()); // true
                  System.out.println("this.isInterrupted() = " + this.isInterrupted());
                  //true
                  System.out.println("========================");

                  //isInterrupted()와 달리 interrupted() 는 interrupted라는 상태변수를 false로 초기화합니다

                  System.out.println("this.interrupted() = " + Thread.interrupted());
                  //true
                  System.out.println("this.interrupted() = " + Thread.interrupted());
                  //false
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    