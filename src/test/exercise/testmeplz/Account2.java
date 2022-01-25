package test.exercise.testmeplz;

import com.sun.corba.se.impl.orbutil.ORBUtility;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Account2
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Account2 {
      private int balance = 1000; //private으로 해야 동기화가 의미가 있음

      public int getBalance() {
            return balance;
      }

      public synchronized void withdraw(int money) {
            if (balance >= money) {
                  try {
                        Thread.sleep(1000);
                        //결과 보기 쉽게 하기위해
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                  }
                  this.balance -= money;

            } //임계 영역... 출금 스레드!
      } //withdraw
}

class RunnableEx22 implements Runnable {
      Account2 acc = new Account2();
      @Override
      public void run() {
            while (acc.getBalance() > 0) {
                  //100,200 ,300 중의 한 값을 임의로 선택해서 출금
                  int money = (int) (Math.random() * 3 + 1) * 100;
                  acc.withdraw(money);
                  System.out.println("acc = " + acc.getBalance());
            }
      }
}

class ThreadEx22 {
      public static void main(String[] args) {
            Runnable r = new RunnableEx22();
            new Thread(r).start();
            new Thread(r).start();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    