package test.doit;

/**
 * packageName    : test.doit
 * fileName       : BookShelf
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class BookShelf extends Shelf implements Queue {
      @Override
      public void enQueue(String title) {
            shelf.add(title);
      }

      @Override
      public String deQueue() {
            return shelf.remove(0);
      }

      @Override
      public int getSize() {
            return getCount();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    