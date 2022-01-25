package test.doit;

/**
 * packageName    : test.doit
 * fileName       : Customer
 * author         : letscombine
 * date           : 2022-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-17        letscombine       최초 생성
 */


public class Customer {
      protected int customerID; //고객 아이디
      protected String customerName; //고객 이름
      protected String customerGrade; //고객 등급
      int bonusPoint; //보너스 포인트
      double bonusRatio; //적립 비율

      public Customer() {
            initCustomer();
      }

      public Customer(int customerID, String customerName) {
            this.customerID = customerID;
            this.customerName = customerName;
            initCustomer(); // 고객 등급과 보너스 포인트 적립률 지정 함수 호출
      }

      private void initCustomer() {
            customerGrade = "SILVER";
            bonusRatio = 0.01;
      } //멤버 변수의 초기화 부분

      public int getCustomerID() {
            return customerID;
      }

      public void setCustomerID(int customerID) {
            this.customerID = customerID;
      }

      public String getCustomerName() {
            return customerName;
      }

      public void setCustomerName(String customerName) {
            this.customerName = customerName;
      }

      public String getCustomerGrade() {
            return customerGrade;
      }

      public void setCustomerGrade(String customerGrade) {
            this.customerGrade = customerGrade;
      }

      public int calcPrice(int price) {
            bonusPoint += price * bonusRatio; //보너스 포인트 계산
            return price;
      } //보너스 포인트 적립, 지불 , 가격 계산 메서드

      @Override
      public String toString() {
            return "Customer{" + "bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + ", customerID=" + customerID + ", customerName='" + customerName + '\'' + ", customerGrade='" + customerGrade + '\'' + '}';
      }

      protected String showCustomerInfo() {

            return "Customer{" + "bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + ", customerID=" + customerID + ", customerName='" + customerName + '\'' + ", customerGrade='" + customerGrade + '\'' + '}';
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    