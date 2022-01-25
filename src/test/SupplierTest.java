package test;

import java.util.function.Supplier;


/**
 * packageName    : test
 * fileName       : SupplierTest
 * author         : letscombine
 * date           : 2022-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-12        letscombine       최초 생성
 */


public class SupplierTest {
      public static void main(String[] args) {
            Supplier<Integer> randomIntSupplier = () -> (int) Math.floor(Math.random() * 10);
            System.out.println("randomIntSupplier = " + randomIntSupplier.get()); //매개값 x 리턴 o
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    