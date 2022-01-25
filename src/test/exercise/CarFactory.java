package test.exercise;

import java.util.HashMap;


/**
 * packageName    : test.exercise
 * fileName       : CarFactory
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class CarFactory {
      private static CarFactory instance = new CarFactory();
      HashMap<String, Car> carMap = new HashMap<>();


      public static CarFactory getInstance() {
            if (instance == null) {
                  instance = new CarFactory();
            }
            return instance;
      }

      public Car createCar(String name) {
            if (carMap.containsKey(name)) {
                  return carMap.get(name);
            }

            Car car = new Car();
            carMap.put(name, car);
            return car;
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    