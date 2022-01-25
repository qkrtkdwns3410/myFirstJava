package test.doit;

/**
 * packageName    : test.doit
 * fileName       : ToStringEX
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class ToStringEX {
      public static void main(String[] args) {
            Book book1 = new Book(200, "개미");
            System.out.println("book1 = " + book1);
            System.out.println("book1.toString() = " + book1.toString());

      }
}

class Book {
      int bookNumber;
      String bookTitle;

      public Book(int bookNumber, String bookTitle) {
            this.bookNumber = bookNumber;
            this.bookTitle = bookTitle;
      }



      @Override

      public String toString() {
            return "Book{" +
                    "bookNumber=" + bookNumber +
                    ", bookTitle='" + bookTitle + '\'' +
                    '}';
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    