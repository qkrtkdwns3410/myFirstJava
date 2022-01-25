package test.doit;

/**
 * packageName    : test.doit
 * fileName       : VIPCustomer
 * author         : letscombine
 * date           : 2022-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-17        letscombine       최초 생성
 */


public class VIPCustomer extends Customer {
      private int agentID; //VIP 고객 상담원 아이디
      double saleRatio; //할인율

      public VIPCustomer(int customerID, String customerName, int agentID) {
            super(customerID, customerName);
            this.agentID = agentID;
            bonusRatio = 0.05; //5%
            saleRatio = 0.1; //10%
            System.out.println("VIPCustomer.VIPCustomer");

      }

      @Override
      public int calcPrice(int price) {
            bonusPoint += price * bonusRatio;
            return  price - (int)(price * saleRatio); //할인된 가격을 계산하여 반환
      } // 지불 가격 메서드 재정의

      public int getAgentID() {
            return agentID;
      }

      public String showCustomerInfo() {
            return super.showCustomerInfo() + "담당 상담원 번호는 " + agentID + "입니다";
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    