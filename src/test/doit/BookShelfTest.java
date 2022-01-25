package test.doit;

/**
 * packageName    : test.doit
 * fileName       : BookShelfTest
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class BookShelfTest {
      public static void main(String[] args) {

            Queue shelfQueue = new BookShelf();
            shelfQueue.enQueue("1");
            shelfQueue.enQueue("2");
            shelfQueue.enQueue("3");

            System.out.println(shelfQueue.deQueue());//1
            System.out.println(shelfQueue.deQueue());//2
            System.out.println(shelfQueue.deQueue());//3



      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    