package test.doit;

/**
 * packageName    : test.doit
 * fileName       : OverridingTest2
 * author         : letscombine
 * date           : 2022-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-17        letscombine       최초 생성
 */


public class OverridingTest2 {
      public static void main(String[] args) {
            Customer vc = new VIPCustomer(10030, "나몰라", 2000); //VIP 고객 생성
            vc.bonusPoint = 1000;

            System.out.println(vc.getCustomerName() + " 님이 지불해야 하는 금액은 " + vc.calcPrice(10000) + "원 입니다.");
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    