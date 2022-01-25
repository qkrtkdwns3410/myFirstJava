package test;

class AutoSaveDaemonThread extends Thread {
      public void save() {
            System.out.println("작업 내용을 저장");
      }

      @Override
      public void run() {
            while (true) {
                  try {
                        Thread.sleep(1000);
                  } catch (InterruptedException e) {
                        e.printStackTrace();
                        break;
                  }
                  save();

            }
      }
}


public class DaemonExample {
      public static void main(String[] args) {
            AutoSaveDaemonThread autoSaveDaemonThread = new AutoSaveDaemonThread();
            autoSaveDaemonThread.setDaemon(true); //주석처리시 .. 프로세스는 1개의 스레드라도 남아있으면 종료되지 않는 원칙..떄문에 종료 X

            autoSaveDaemonThread.start();

            try {
                  Thread.sleep(3000);
            } catch (Exception e) {
                  e.printStackTrace();
            }

            System.out.println("종료됩니다");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    