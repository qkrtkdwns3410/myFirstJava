package test.exercise;

import com.sun.xml.internal.ws.developer.UsesJAXBContext;

import java.io.PipedReader;
import java.util.ArrayList;
import java.util.List;


/**
 * packageName    : test.exercise
 * fileName       : Book
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class Book {
      private String name;
      private int price;

      public Book(String name, int price) {
            this.name = name;
            this.price = price;
      }

      public String getName() {
            return name;
      }

      public int getPrice() {
            return price;
      }
}


class LibraryTest {
      public static void main(String[] args) {
            List<Book> bookList = new ArrayList<>();

            bookList.add(new Book("자바", 25000));
            bookList.add(new Book("파이썬", 15000));
            bookList.add(new Book("안드로이드", 30000));

            //스트림 생성 후 출력
            //
            int totalSum = bookList.stream()
                    .mapToInt(b -> b.getPrice())
                    .sum();
            System.out.println("totalSum = " + totalSum);


            bookList.stream()
                    .filter(b -> b.getPrice() >= 20000)
                    .map(b -> b.getName())
                    .sorted()
                    .forEach(b -> System.out.println(b));

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    