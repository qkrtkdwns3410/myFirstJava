package test.doit;

import java.util.ArrayList;


/**
 * packageName    : test.doit
 * fileName       : CustomerTest1
 * author         : letscombine
 * date           : 2022-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-17        letscombine       최초 생성
 */


public class CustomerTest1 {
      public static void main(String[] args) {

            ArrayList<Customer> customerList = new ArrayList<>();

            Customer customerLee = new Customer(10010, "이순신");
            Customer customerShin = new Customer(10020, "신사임당");

            Customer customerHong = new GoldCustomer(10030, "홍길동");
            Customer customerYoul = new GoldCustomer(10040, "이율곡");
            Customer customerKim = new VIPCustomer(10050, "김유신", 12345);

            customerList.add(customerLee);
            customerList.add(customerShin);
            customerList.add(customerHong);
            customerList.add(customerYoul);
            customerList.add(customerKim);


            System.out.println("===== 고객 정보 출력 =====");
            for (Customer customer : customerList) {
                  System.out.println("customer = " + customer);
            }

            System.out.println("===== 할인율과 보너스 포인트 계산 =====");
            int price = 10000;
            for (Customer customer : customerList) {
                  int cost = customer.calcPrice(price);
                  System.out.println("customer = " + customer.getCustomerName()+" 님이 "+cost+" 원을 지불하셨습니다");
                  System.out.println("customer = " + customer.getCustomerName() + " 님이 " + customer.bonusPoint + " 보너스 포인트 가짐");
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    