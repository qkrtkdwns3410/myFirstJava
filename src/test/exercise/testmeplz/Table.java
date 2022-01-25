package test.exercise.testmeplz;

import java.io.PipedReader;
import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Table
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Table {
      private static final int MAX_FOOD = 20;
      private ArrayList dishes = new ArrayList();

      public synchronized void add(String dish) {
            //테이블 가득 찼다면, 음식을 추가하지 않습니다
            if (dishes.size() >= MAX_FOOD) {
                  return;
            }
            dishes.add(dish);
            System.out.println("dishes = " + dishes);
      }

      public boolean remove(String dishName) {
            //지정된 요리와 일치하는 요리를 테이블에서 제거
            for (int i = 0; i < dishes.size(); i++) {
                  if (dishName.equals(dishes.get(i))) {
                        dishes.remove(i);
                        return true;
                  }
            }
            return false;

      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    