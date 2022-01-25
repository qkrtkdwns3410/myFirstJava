package test;

import java.util.Map;


public class ThreadGroupExample {
      public static void main(String[] args) {
            Map<Thread, StackTraceElement[]> allStackTrace = Thread.getAllStackTraces();
            for (Thread thread : allStackTrace.keySet()) {
                  String thisThreadName = thread.getName();
                  System.out.println("thisThreadName = " + thisThreadName + (thread.isDaemon() ? "(데몬)" : "(주)"));

                  ThreadGroup thisThreadGroup = thread.getThreadGroup();
                  System.out.println("thisThreadGroup = " + thisThreadGroup);

                  System.out.println("========================");
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    