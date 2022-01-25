package test.doit;

/**
 * packageName    : test.doit
 * fileName       : OverridingTest1
 * author         : letscombine
 * date           : 2022-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-17        letscombine       최초 생성
 */


public class OverridingTest1 {
      public static void main(String[] args) {
            Customer customerLee = new Customer(10010, "이순신");
            customerLee.bonusPoint = 1000;

            VIPCustomer customerKim = new VIPCustomer(10020, "" +
                    "김유신", 12345);
            customerKim.bonusPoint = 10000;

            int price = 10000;
            System.out.println(customerKim.getCustomerName() + "님이 지불하셔야하는 금액은 " + customerKim.calcPrice(price));
            System.out.println(customerLee.getCustomerName() + "님이 지불하셔야하는 금액은 " + customerLee.calcPrice(price));

            /*김유신님이 지불하셔야하는 금액은 9000
            이순신님이 지불하셔야하는 금액은 10000*/
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    