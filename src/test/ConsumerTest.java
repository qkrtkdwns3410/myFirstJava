package test;

import java.util.function.BiConsumer;
import java.util.function.Consumer;


/*
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * */
public class ConsumerTest {
      public static void main(String[] args) {
            Consumer<String> printer = s -> { //매개값  o 리턴값 x 오직 값을 소비하기 위해 사용됩니다.
                  System.out.println("s = " + s);
            };

            printer.accept("printerTest");

            Consumer<Number> printerForNumber = arg -> {
                  System.out.println("arg = " + arg);
            };

            printerForNumber.accept(123123);

            BiConsumer<String, Number> printerStringNumberPair = (s, n) -> {
                  System.out.println("s = " + s);
                  System.out.println("n = " + n);
            };

            printerStringNumberPair.accept("지금 몇분이야?", 51);
      }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    