package test;

@FunctionalInterface
public interface MyFunctionalInterface {
      void method();
}

class UsingThis {
      public int outerField = 10;

      class Inner {
            int innerField = 20;

            void method() {
                  int localFieldVariable = 11;
                        Runnable runnable = () -> {
                              for (int i = 0; i < 10; i++) {
                                    try {
                                          Thread.sleep(1000);
                                          System.out.println("thread implemented by lambda expression is running");
                                          System.out.println("localFieldVariable = " + localFieldVariable);
                                          System.out.println("========================");

                                    } catch (Exception e) {
                                          e.printStackTrace();

                                    }
                              }

                  };

                  Thread thread = new Thread(runnable);
                  thread.start();

                  System.out.println("Method is already over");

            }

      }

}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    