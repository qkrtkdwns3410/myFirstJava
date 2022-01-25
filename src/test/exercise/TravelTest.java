package test.exercise;

import java.util.ArrayList;
import java.util.List;


/**
 * packageName    : test.exercise
 * fileName       : TravelTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class TravelTest {
      public static void main(String[] args) {
            TravelCustomer customer1 = new TravelCustomer("이순신", 40, 100);
            TravelCustomer customer2 = new TravelCustomer("김순신", 20, 100);
            TravelCustomer customer3 = new TravelCustomer("박순신", 13, 50);


            List<TravelCustomer> customerList = new ArrayList<>();
            customerList.add(customer1);
            customerList.add(customer2);
            customerList.add(customer3);

            System.out.println("========================");
            customerList.stream()
                    .map(c -> c.getName())
                    .forEach(s -> System.out.println(s));

            int total = customerList.stream()
                    .mapToInt(c -> c.getPrice())
                    .sum();
            System.out.println("total = " + total);

            System.out.println("========================");

            customerList.stream()
                    .filter(c -> c.getAge() >= 20)
                    .map(c -> c.getName())
                    .sorted()
                    .forEach(s -> System.out.println(s));
            System.out.println("========================");
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    