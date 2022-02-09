package test.exercise.testmeplz2.programmers;

import java.util.Arrays;
import java.util.LinkedHashMap;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : TwoZeroOneSix
 * author         : letscombine
 * date           : 2022-02-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-09        letscombine       최초 생성
 */


public class TwoZeroOneSix {
      
      public static void main(String[] args) {
            
            solution(1, 1);
            System.out.println("======================================================");
            solution(12, 31);
            System.out.println("======================================================");
            solution(2, 29);
      }
      
      public static String solution(int a, int b) {
            
            String[] weekArr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
            
            System.out.println("weekArr = " + Arrays.toString(weekArr));
            
            LinkedHashMap<Integer, Integer> monthDay = new LinkedHashMap<>();
            monthDay.put(1, 31);
            monthDay.put(2, 29);
            monthDay.put(3, 31);
            monthDay.put(4, 30);
            monthDay.put(5, 31);
            monthDay.put(6, 30);
            monthDay.put(7, 31);
            monthDay.put(8, 31);
            monthDay.put(9, 30);
            monthDay.put(10, 31);
            monthDay.put(11, 30);
            monthDay.put(12, 31);
            /*
             * 해당 월의 시작점 요일 체크
             * */
            System.out.println("monthDay = " + monthDay);
            
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("======================================================");
            
            String answer = "";
            
            //일단 해당 날짜의 day 먼저 계산
            int day = 0;
            for (int startMonth = 1; startMonth < a; startMonth++) {
                  day += monthDay.get(startMonth);
            }
            
            day += b;
            
            day = day % 7;
            System.out.println("day = " + day);
      
            if (day == 0) {
                  day = 7;
            }
            System.out.println("weekArr = " + weekArr[day - 1]);
            return weekArr[day - 1];
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    