package test.doit;

/**
 * packageName    : test.doit
 * fileName       : GoldCustomer
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class GoldCustomer extends Customer{
      double saleRatio;

      public GoldCustomer(int customerID, String customerName) {
            super(customerID, customerName);
            customerGrade = "GOLD";
            bonusRatio = 0.02;
            saleRatio = 0.1;
      }

      @Override
      public int calcPrice(int price) {
            bonusPoint += price * bonusRatio;
            return price - (int) (price * saleRatio);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    