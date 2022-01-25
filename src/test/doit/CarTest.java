package test.doit;

import java.lang.reflect.Array;
import java.util.ArrayList;


/**
 * packageName    : test.doit
 * fileName       : CarTest
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class CarTest {
      public static void main(String[] args) {
            ArrayList<Car> cars = new ArrayList<>();

            cars.add(new Sonata());
            cars.add(new Avante());
            cars.add(new Grandeur());
            cars.add(new Genesis());
            for (Car car : cars) {
                  car.run();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    