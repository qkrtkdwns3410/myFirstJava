package test.doit;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.doit
 * fileName       : Dog
 * author         : letscombine
 * date           : 2022-01-17
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-17        letscombine       최초 생성
 */


public class Dog {
      private String name;
      private String type;

      public Dog(String name, String type) {
            this.name = name;
            this.type = type;
      }

      public String getName() {
            return name;
      }

      public void setName(String name) {
            this.name = name;
      }

      public String getType() {
            return type;
      }

      public void setType(String type) {
            this.type = type;
      }

      @Override
      public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", type='" + type + '\'' +
                    '}';
      }
}

class TestMe2 {
      public static void main(String[] args) {
            Dog[] dogs = new Dog[5];
            for (int i = 0; i < dogs.length; i++) {
                  dogs[i] = new Dog(i + "", i + "");
      }
            System.out.println("dogs = " + Arrays.toString(dogs));
      }
}

class DogTestArray {
      public static void main(String[] args) {
            ArrayList<Dog> dogs = new ArrayList<>();
            for (int i = 0; i < 5; i++) {

                  dogs.add(new Dog(i + "", i + ""));
            }
            System.out.println("dogs = " + dogs);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    