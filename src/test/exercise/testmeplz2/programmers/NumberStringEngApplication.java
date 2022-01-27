package test.exercise.testmeplz2.programmers;

import java.util.LinkedHashMap;
import java.util.Map;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : NumberStringEngApplicaiotn
 * author         : letscombine
 * date           : 2022-01-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-27        letscombine       최초 생성
 */


public class NumberStringEngApplication {
      public static void main(String[] args) {
            String s = "one4seveneight";
            Solution2 solution2 = new Solution2();
            solution2.solution(s);

      }
}

class Solution2 {
      public int solution(String s) {
            LinkedHashMap<String, String> numList = new LinkedHashMap<>();
            numList.put("0", "zero");
            numList.put("1", "one");
            numList.put("2", "two");
            numList.put("3", "three");
            numList.put("4", "four");
            numList.put("5", "five");
            numList.put("6", "six");
            numList.put("7", "seven");
            numList.put("8", "eight");
            numList.put("9", "nine");

            int answer = 0;
            for (Map.Entry<String, String> map : numList.entrySet()) {
                  System.out.println("map.getValue() = " + map.getValue());
                  System.out.println("map.getKey() = " + map.getKey());
                  s=s.replaceAll(map.getValue(), String.valueOf(map.getKey()));
            }
            answer = Integer.parseInt(s);
            return answer;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    