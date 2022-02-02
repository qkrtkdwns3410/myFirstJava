package test.exercise.testmeplz2.programmers;

import java.util.*;


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
            String[] id_list = {"con", "ryan"};
            String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
            int k = 3;

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
            report = Arrays.stream(report).distinct().toArray(String[]::new);
            System.out.println("report = " + Arrays.toString(report));
            ArrayList<String> reporter = new ArrayList<>();
            ArrayList<String> reported = new ArrayList<>();
            ArrayList<Integer> answer = new ArrayList<>();

            LinkedHashMap<String, HashMap<String, Integer>> reportOverviewMap = new LinkedHashMap<>();


            for (String value : id_list) {
                  LinkedHashMap<String, Integer> reportedCountMap = new LinkedHashMap<>();
                  answer.add(0);
                  for (String s : id_list) {
                        reportedCountMap.put(s, 0);
                  }
                  reportOverviewMap.put(value, reportedCountMap);
            }
            System.out.println("reportOverviewMap = " + reportOverviewMap);

            for (String s : report) {
                  reporter.add(s.split(" ")[0]);
                  reported.add(s.split(" ")[1]);
            }
            System.out.println("reporter = " + reporter);
            System.out.println("reported = " + reported);

            System.out.println("reportOverviewMap = " + reportOverviewMap);

            ArrayList<Integer> reportCount = new ArrayList<>();
            int count = 0;
            for (Map.Entry<String, HashMap<String, Integer>> entry : reportOverviewMap.entrySet()) {
                  System.out.println("entry = " + entry);
                  System.out.println("뭐냐구");
                  for (int index4 = 0; index4 < reported.size(); index4++) {
                        System.out.println("index4 = " + index4);
                        System.out.println("몬데");

                        if (entry.getKey().equals(reported.get(index4))) {
                              System.out.println("======================================================");
                              System.out.println("entry = " + entry);
                              System.out.println("reported = " + reported.get(index4));

                              //신고당한사람존재한다면 해당 신고한 사람의 값을 1로 변경해야합니다
                              for (Map.Entry<String, Integer> stringIntegerEntry : entry.getValue().entrySet()) {
                                    System.out.println(stringIntegerEntry);
                                    System.out.println("뭐지");
                                    System.out.println("반복됩니다");
                                    if (stringIntegerEntry.getKey().equals(reporter.get(index4))) {
                                          System.out.println("======================================================");
                                          System.out.println("stringIntegerEntry = " + stringIntegerEntry);
                                          System.out.println("reporter = " + reporter.get(index4));
                                          stringIntegerEntry.setValue(1);
                                          count++;
                                          System.out.println("count = " + count);
                                    }
                              }

                        }
                  }
                  reportCount.add(count);
                  count = 0;
                  System.out.println("reportCount = " + reportCount);

            }

            for (int index = 0; index < reportCount.size(); index++) {
                  System.out.println();
                  if (reportCount.get(index) >= k) { // 신고 횟수가 K 회 이상이라면
                        int index1 = 0;
                        for (Map.Entry<String, HashMap<String, Integer>> entry : reportOverviewMap.entrySet()) { //map의 값 중에서 신고자들에게는 +
                              if (index1 == index) {
                                    System.out.println("index1 = " + index1);
                                    System.out.println("index = " + index);
                                    int index2 = 0;
                                    for (Map.Entry<String, Integer> stringIntegerEntry : entry.getValue().entrySet()) {
                                          if (stringIntegerEntry.getValue() == 1) {
                                                int answerOf = answer.get(index2);
                                                answer.set(index2, answerOf + 1);
                                          }
                                          index2++;
                                          System.out.println("answer = " + answer);
                                    }
                              }
                              index1++;
                              System.out.println("======================================================");
                        }
                        System.out.println("index1 = " + index1);


                  }
                  System.out.println("answer = " + answer);
                  System.out.println();
            }

            System.out.println("reportOverviewMap = " + reportOverviewMap);
            return answer;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    