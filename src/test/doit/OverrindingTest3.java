package test.doit;

import java.util.PrimitiveIterator;


/**
 * packageName    : test.doit
 * fileName       : OverrindingTest3
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class OverrindingTest3 {
      public static void main(String[] args) {

            int price = 10000;

            Customer customerLee = new Customer(10010, "이순신");
            //Customer 인스턴스의 생성
            System.out.println(customerLee.getCustomerName() + " 님이 지불해야 하는 금액은" + customerLee.calcPrice(price));

            VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
            //VIPCustomer 인스턴스의 생성
            System.out.println(customerKim.getCustomerName() + " 님이 지불해야 하는 금액은" + customerKim.calcPrice(price));

            Customer vc = new VIPCustomer(10030, "나몰라", 2000);
            //VIPCustomer 인스턴스를 Customer형으로 변환
            System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은" + vc.calcPrice(price));

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    