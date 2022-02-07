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
            System.out.println(solution(s));

      }
      public static int solution(String s) {
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
                  s = replaceAllU(s, map.getValue(), map.getKey());

            }
            answer = Integer.parseInt(s);
            return answer;
      }

      public static String replaceAllU(String str, String a, String b) {
            String result = null;
            String tmpStr = str;

            do {
                  if (result != null) {
                        tmpStr = result;
                  }
                  result = replaceFirstU(tmpStr, a, b); // 해당 치환과정이 tmpStr 과 동일하다면 반복문이 종료되는 것입니다.
            } while (!result.equals(tmpStr));

            return result;
      }

      public static String replaceFirstU(String str, String a, String b) {
            String result = "";

            int idx = 0;
            int len = a.length(); // .. 2
            int len2 = b.length();// . 1

            int diffLens = len - len2; //a 와 b간의 길이차
            idx = str.indexOf(a); // a위 위치

            if (idx < 0) return str;

            result = str.substring(0, idx) + b + str.substring(idx + len2 + diffLens); // a 위치만큼 제거.. b로 치환합니다.

            return result;
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    