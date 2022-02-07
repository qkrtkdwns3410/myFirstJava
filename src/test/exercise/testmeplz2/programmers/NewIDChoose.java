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
      public static void main(String[] args) {
            String new_id = "...!@BaT#*..y.abcdefghijklm";
            Solution3 solution3 = new Solution3();
            solution3.solution(new_id);
      }
}

class Solution3 {


      public String solution(String new_id) {

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
            int dotCount = 0;

            int idIndexStart = 0;
            int idIndexEnd = 0;

            String new_id_start = "";
            String new_id_end = "";

            for (int idIndex = 0; idIndex < new_id.length(); idIndex++) {
                  char new_id_ch = new_id.charAt(idIndex);
                  if (new_id_ch == '.') {
                        dotCount++;
                  } else {
                        if (dotCount >= 2) {
                              idIndexEnd = idIndex;
                              new_id_start = new_id.substring(0, idIndexStart);
                              new_id_end = new_id.substring(idIndexEnd - 1);

                              new_id = new_id_start + new_id_end;
                              //초기화
                              new_id_start = "";
                              new_id_end = "";

                        }
                        dotCount = 0;
                        idIndexStart = idIndex;
                  }
            }
            //결과 .ba.y.abcdefghijklm


            //4단계 - 앞뒤의 점 제거
            //            new_id = new_id.replaceFirst("^[.]|[.]$", "");

            while (new_id.charAt(0) == '.' || new_id.charAt(new_id.length() - 1) == '.') {
                  if (new_id.charAt(0) == '.') {
                        new_id = new_id.substring(1);
                  } else if (new_id.charAt(new_id.length() - 1) == '.') {
                        new_id = new_id;
                  }
            }
            System.out.println("new_id = " + new_id);

            //5단계
            new_id = (new_id.isEmpty()) ? "a" : new_id;
            System.out.println("new_id = " + new_id);

            //6단계
            new_id = (new_id.length() >= 16) ? new_id.substring(0, 15) : new_id;
            //            new_id = new_id.replaceAll("[.]$", "");
            while (new_id.charAt(new_id.length() - 1) == '.') {
                  new_id = new_id;
            }
            System.out.println("new_id = " + new_id);

            //7단계
            while (new_id.length() < 3) {
                  new_id = new_id.concat(String.valueOf(new_id.charAt(new_id.length() - 1)));
            }

            System.out.println("new_id = " + new_id);
            return new_id;
      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    