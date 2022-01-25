package test;

public class DataStorage {
      String data;

      public synchronized String consumData() throws  InterruptedException {
            if (data == null) {
                  System.out.println("[소비자] 데이터를 소비했습니다. 데이터가 생산되기를 기다리는중");
                  wait();
            }
            System.out.println("[소비자] 데이터가 있어서 데이터가 소비되었습니다. (데이터명 : " + data + ")");
            data = null;
            notify(); //Setter 완료된 순간에 notify 후 wait()

            return data;
      }
      public synchronized void produceData(String data) throws  InterruptedException {
            this.data = data;
            System.out.println("[생산자] 데이터가 없어서 데이터가 생산되었습니다. (데이터명  : " + data + ")");
            notify();

            if (data != null) {
                  System.out.println("[생산자] 데이터를 생산했습니다. 데이터가 소비되기를 기다리고 있습니다.");
                  wait();

            }
      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    