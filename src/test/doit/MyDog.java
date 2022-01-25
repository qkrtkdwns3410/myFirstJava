package test.doit;

/**
 * packageName    : test.doit
 * fileName       : MyDog
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class MyDog {
      String name;
      String type;

      public MyDog(String name, String type) {
            this.name = name;
            this.type = type;
      }

      @Override
      public String toString() {
            return type + " " + name;
      }
}

class Q4 {
      public static void main(String[] args) {
            MyDog dog = new MyDog("멈뭄미", "진돗개");
            System.out.println("dog = " + dog);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    