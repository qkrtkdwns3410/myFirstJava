package test.exercise;

import javax.management.AttributeValueExp;


/**
 * packageName    : test.exercise
 * fileName       : CarTest
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class CarTest {
      public static void main(String[] args) {
            CarFactory factory = CarFactory.getInstance();

            Car sonata1 = factory.createCar("연수 차");
            Car sonata2 = factory.createCar("연수 차");

            System.out.println(sonata1 == sonata2);

            Car avante1 = factory.createCar("승연 차");
            Car avante2 = factory.createCar("승연 차");
            System.out.println(avante1 == avante2);

            System.out.println(sonata1 == avante1);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    