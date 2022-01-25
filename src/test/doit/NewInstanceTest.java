package test.doit;

/**
 * packageName    : test.doit
 * fileName       : NewInstanceTest
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class NewInstanceTest {
      public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
            Person person = new Person();
            System.out.println("person = " + person);


            System.out.println("========================");

            Class pClass = Class.forName("test.doit.Person");
            Person person1 = (Person) pClass.newInstance(); // Class 클래스의  newInstance() 메서드로 생성
            System.out.println("person1 = " + person1);

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    