package test.forTest;

/**
 * packageName    : test.forTest
 * fileName       : GenericPrinter
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class GenericPrinter<T> {
      private T matherial; //T 자료형으로 선언한 변수입니다

      public T getMatherial() {
            return matherial;
      }

      public void setMatherial(T matherial) {
            this.matherial = matherial;
      }

      @Override
      public String toString() {
            return "GenericPrinter{" +
                    "matherial=" + matherial.toString() +
                    '}';
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    