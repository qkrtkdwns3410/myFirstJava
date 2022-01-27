package test.exercise.testmeplz2.programmers;

import javax.print.attribute.HashAttributeSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : ReportResultApplication
 * author         : letscombine
 * date           : 2022-01-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-27        letscombine       최초 생성
 */


public class ReportResultApplication {
      public static void main(String[] args) {
            String[] id_list = {"muzi", "frodo", "apeach", "neo"};
            String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "apeach muzi"};
            int k = 2;

            Solution solution = new Solution();
            solution.solution(id_list, report, k);
      }
}

class Solution {
      public ArrayList<Integer> solution(String[] id_list, String[] report, int k) {
            System.out.println("id_list = " + Arrays.toString(id_list));
            System.out.println("report = " + Arrays.toString(report));
            System.out.println("k = " + k);
            System.out.println("======================================================");

            ArrayList<String> reporter = new ArrayList<>();
            ArrayList<String> reported = new ArrayList<>();

            HashMap<String, HashMap<String, Integer>> reportedMap = new HashMap<>();
            HashMap<String, Integer> reportedCountMap = new HashMap<>();

            for (int index = 0; index < id_list.length; index++) {

                  reportedCountMap.put(id_list[index],0);
                  reportedMap.put(id_list[index], reportedCountMap);

            }

            System.out.println("======================================================");

            for (String s : report) {
                  reporter.add(s.split(" ")[0]);
                  reported.add(s.split(" ")[1]);
            }

            System.out.println("reporter = " + reporter);
            System.out.println("reported = " + reported);
            System.out.println("======================================================");

            ArrayList<Integer> answer = new ArrayList<>();

            for (int index = 0; index < id_list.length; index++) {

            }
            return answer;

      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    