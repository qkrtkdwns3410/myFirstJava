package test;

public class WorkObject {
      public synchronized void methodA() {
            notify();
            System.out.println("WorkObject.methodA");

            try {
                  wait();
            } catch (Exception e) {
                  e.printStackTrace();

            }
      }

      public synchronized void methodB() {
            notify();
            System.out.println("WorkObject.methodB");

            try {
                  wait();
            } catch (Exception e) {
                  e.printStackTrace();

            }
      }

}

class WorkThreadA extends Thread {
      WorkObject workObject;

      public WorkThreadA(WorkObject workObject) {
            this.workObject = workObject;
      }

      @Override
      public void run() {
            for (int i = 0; i < 10; i++) {
                  workObject.methodA();
            }
      }
}

class WorkThreadB extends Thread {
      WorkObject workObject;

      public WorkThreadB(WorkObject workObject) {
            this.workObject = workObject;
      }

      @Override
      public void run() {
            for (int i = 0; i < 10; i++) {
                  workObject.methodB();
            }
      }
}

class Main {
      public static void main(String[] args) throws InterruptedException {
            DataStorage dataStorage = new DataStorage();

            dataStorage.consumData();
            dataStorage.produceData("datadata");

      }
}

/*workObejct ,  workThreadA workThreadB 클래스 정의 > 객체 생성 .notify() wait () 이용해서 출력메서드를 번갈아가며 출력*/
/*notify 호출 > WorkThreadA는 WorkObejct.methodA 호출 ..프린트후 wait 만나서
 WorkThreadB가 WorkObject.methodB를 출력하지 않는다면 notify가 호출 X*/













































