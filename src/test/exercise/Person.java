package test.exercise;

import sun.rmi.runtime.Log;

import java.io.*;
import java.io.FileInputStream;


/**
 * packageName    : test.exercise
 * fileName       : Person
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class Person implements Serializable {


      private static final long serialVersionUID = -6538646947589664694L;

      String name;
      String job;

      public Person() {

      }

      public Person(String name, String job) {
            this.name = name;
            this.job = job;
      }


      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Person{");
            sb.append("name='")
                    .append(name)
                    .append('\'');
            sb.append(", job='")
                    .append(job)
                    .append('\'');
            sb.append('}');
            return sb.toString();
      }
}

class SerializationTest {
      public static void main(String[] args) throws ClassNotFoundException {
            Person personAhn = new Person("안재용", "대표이사");
            Person personKim = new Person("김철수", "상무이사");

            try (FileOutputStream fos = new FileOutputStream("serial.out");
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

                  oos.writeObject(personAhn);
                  oos.writeObject(personKim);
            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            } catch (IOException e) {
                  e.printStackTrace();
            }
            try (FileInputStream fis = new FileInputStream("serial.out");
                 ObjectInputStream ois = new ObjectInputStream(fis)) {

                  Person p1 = (Person) ois.readObject();
                  Person p2 = (Person) ois.readObject();
                  //personAhn Kim 의 값을 파일에서 읽어들임 (역직렬화)

                  System.out.println("p1 = " + p1);
                  System.out.println("p2 = " + p2);

            } catch (FileNotFoundException e) {
                  e.printStackTrace();
            } catch (IOException e) {
                  e.printStackTrace();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    