package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : NewIDChoose
 * author         : letscombine
 * date           : 2022-01-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-27        letscombine       최초 생성
 */


public class NewIDChoose {

}

class Solution3 {
      public static void main(String[] args) {
            System.out.println(solution("....................."));

      }

      static String solution(String new_id) {

            //1단계 소문자 변경
            new_id = new_id.toLowerCase();
            System.out.println("new_id = " + new_id);


            //2단계 특문 제거
            //            new_id = new_id.replaceAll("[^a-z\\s0-9\\-_.]", "");
            //            System.out.println("new_id = " + new_id);

            ArrayList<Character> charArrList = new ArrayList<>();

            for (int idIndex = 0; idIndex < new_id.length(); idIndex++) {
                  char new_id_ch = new_id.charAt(idIndex);

                  if ((new_id_ch >= 97 && new_id_ch <= 122) || (new_id_ch >= 48 && new_id_ch <= 57) || new_id_ch == 45 || new_id_ch == 46 || new_id_ch == 95) { // 소문자 , 숫자 , 빼기, 밑줄 , 마침표
                        charArrList.add(new_id_ch);
                  }
            }

            StringBuilder new_idBuilder = new StringBuilder();

            for (Character character : charArrList) {
                  new_idBuilder.append(character);
            }

            new_id = new_idBuilder.toString();

            //3단계 ....을 . 으로
            //            new_id = new_id.replaceAll("[.]{2,}", ".");
            //            System.out.println("new_id = " + new_id);
            while (new_id.contains("..")) {
                  new_id=replaceAllU(new_id, "..", ".");
            }
            System.out.println("new_id = " + new_id);

//            int dotCount = 0;
//
//            int idIndexStart = 0;
//            int idIndexEnd = 0;
//
//            String new_id_start = "";
//            String new_id_end = "";
//
//            System.out.println("new_id = " + new_id);
//            for (int idIndex = 0; idIndex < new_id.length(); idIndex++) {
//                  char new_id_ch = new_id.charAt(idIndex);
//
//                  if (new_id_ch == '.') {
//                        dotCount++;
//
//                  } else {
//                        if (dotCount >= 2) {
//
//                              System.out.println("dotCount = " + dotCount);
//                              idIndexEnd = idIndex;
//                              System.out.println("idIndexStart = " + idIndexStart);
//                              System.out.println("idIndexEnd = " + idIndexEnd);
//
//                              if (dotCount == 2) {
//                                    new_id_start = new_id.substring(0, idIndexStart + 1);
//
//                                    new_id_end = new_id.substring(idIndexStart + dotCount);
//                              } else {
//                                    new_id_start = new_id.substring(0, idIndexStart);
//
//                                    new_id_end = new_id.substring(idIndexStart + dotCount - 1);
//
//                              }
//
//                              System.out.println("======================================================");
//                              System.out.println("new_id_start = " + new_id_start);
//                              System.out.println("new_id_end = " + new_id_end);
//
//                              new_id = new_id_start + new_id_end;
//                              System.out.println("new_id = " + new_id);
//                              System.out.println("======================================================");
//                              //초기화
//                              new_id_start = "";
//                              new_id_end = "";
//
//                        }
//                        dotCount = 0;
//                        idIndexStart = idIndex;
//                  }
//            }
//            //결과 .ba.y.abcdefghijklm


            //4단계 - 앞뒤의 점 제거
            //            new_id = new_id.replaceFirst("^[.]|[.]$", "");
            System.out.println("new_id = " + new_id);
            System.out.println("======================================================");

            while (new_id.length() > 0 && new_id.charAt(0) == '.' || new_id.charAt(new_id.length() - 1) == '.') {
                  System.out.println("new_id = " + new_id);
                  System.out.println(1);
                  if (new_id.length() == 1 && new_id.charAt(0) == '.') {
                        new_id = "";
                        break;
                  }
                  if (new_id.charAt(0) == '.') {

                        new_id = new_id.substring(1);
                  }
                  if (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.') {

                        new_id = new_id.substring(0, new_id.length() - 1);
                  }

            }
            System.out.println("======================================================");
            System.out.println("new_id = " + new_id);

            //5단계
            new_id = (new_id.isEmpty()) ? "a" : new_id;
            System.out.println("new_id = " + new_id);

            //6단계
            new_id = (new_id.length() >= 16) ? new_id.substring(0, 15) : new_id;
            //            new_id = new_id.replaceAll("[.]$", "");
            System.out.println("======================================================");
            System.out.println("new_id = " + new_id);

            while (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.') {

                  new_id = new_id.substring(0, new_id.length() - 1);
                  System.out.println("new_id = " + new_id);
            }

            System.out.println("new_id = " + new_id);

            //7단계
            while (new_id.length() < 3) {
                  new_id = new_id.concat(String.valueOf(new_id.charAt(new_id.length() - 1)));
            }

            System.out.println("new_id = " + new_id);
            return new_id;
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
            String result = null;

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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    