package test.exercise.testmeplz2.programmers;

/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : LeftAmountCalc
 * author         : letscombine
 * date           : 2022-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-10        letscombine       최초 생성
 */


public class LeftAmountCalc {
      
      public static void main(String[] args) {
      
            solution(3, 20, 4);
            System.out.println("======================================================");
            solution(2500, 1000000000, 2500);
      }
      
      public static long solution(int price, int money, int count) {
      
            System.out.println("price = " + price);
            System.out.println("money = " + money);
            System.out.println("count = " + count);
            System.out.println("======================================================");
      
            int priceFirst = price;
            long answer = -1;
      
            long totalPrice = 0;
            for (int repeat = 0; repeat < count; repeat += 1) {
                  totalPrice += price;
                  price +=priceFirst;
                  
            }
            System.out.println("totalPrice = " + totalPrice);
            long diff = totalPrice - money;
            answer = diff >= 0 ? diff : 0;
      
            System.out.println("answer = " + answer);
            return answer;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    