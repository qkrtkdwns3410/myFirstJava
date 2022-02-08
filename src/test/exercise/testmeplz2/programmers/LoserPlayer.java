package test.exercise.testmeplz2.programmers;

import test.doit.Queue;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : LoserPlayer
 * author         : letscombine
 * date           : 2022-02-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-07        letscombine       최초 생성
 */


public class LoserPlayer {
      public static void main(String[] args) {
            solution(new String[]{"leo", "kiki", "eden" }, new String[]{"eden", "kiki" });
            solution(new String[]{"marina", "josipa", "nikola", "vinko", "filipa" }, new String[]{"josipa", "filipa", "marina", "nikola" });
            solution(new String[]{"mislav", "stanko", "mislav", "ana" }, new String[]{"stanko", "ana", "mislav" });
      }

      public static String solution(String[] participant, String[] completion) {
            //            ArrayList<String> participantList = new ArrayList<>();
            //            ArrayList<String> completionList = new ArrayList<>();
            //
            //            for (String participantOne : participant) {
            //                  participantList.add(participantOne);
            //            }
            //            for (String completionOne : completion) {
            //                  completionList.add(completionOne);
            //            }

            String answer = "";
            for (int partIndex = 0; partIndex < participant.length; partIndex++) {
                  
            }

            return answer;
      }

      public static int compareStrings(String str, String str2) {
            int returnValue = 0;
            int lengthCount = 0;

            if (str.length() >= str2.length()) {
                  lengthCount = str.length();
            } else {
                  lengthCount = str2.length();
            }

            while (lengthCount>0) {
                  for (int charIdx = 0; charIdx < str.length(); charIdx++) {
                        for (int charIdx2 = 0; charIdx2 < str2.length(); charIdx2++) {
                              if (charIdx == charIdx2) {
                                    if (str.charAt(charIdx) > str2.charAt(charIdx2)) {
                                          returnValue = 1;
                                          return returnValue;

                                    } else if (str.charAt(charIdx) < str2.charAt(charIdx2)) {
                                          returnValue = -1;
                                          return returnValue;

                                    }
                              }
                        }
                        lengthCount--;
                  }
            }


            /*
             * 양수 값이 나온다면 str의 값이 더 큰 경우입니다.
             * 음수 값이 나온다면 str2의 값이 큰 경우입니다
             *  0 이라면 str 과 str2 의 값이 동일한 경우입ㄴ.
             * */
            return returnValue;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    