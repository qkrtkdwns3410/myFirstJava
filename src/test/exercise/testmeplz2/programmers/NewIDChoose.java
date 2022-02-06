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

            //4단계
            new_id = new_id.replaceFirst("^[.]|[.]$", "");
            System.out.println("new_id = " + new_id);

            //5단계
            new_id = (new_id.isEmpty()) ? "a" : new_id;
            System.out.println("new_id = " + new_id);

            //6단계
            new_id = (new_id.length() >= 16) ? new_id.substring(0, 15) : new_id;
            new_id = new_id.replaceAll("[.]$", "");
            System.out.println("new_id = " + new_id);

            //7단계
            while (new_id.length() < 3) {
                  new_id = new_id.concat(String.valueOf(new_id.charAt(new_id.length() - 1)));
            }

            System.out.println("new_id = " + new_id);
            return new_id;
      }

      public  String replaceAllU(String str, String a, String b) {
            String result = null;
            String tmpStr = str;

            do {
                  if (result != null) {
                        tmpStr = result;
                  }
                  result = replaceFirstU(tmpStr, a, b);
            } while (!result.equals(tmpStr));

            return result;
      }

      public  String replaceFirstU(String str, String a, String b) {
            String result = null;

            int idx = 0;
            int len = a.length();
            int len2 = b.length();

            int diffLens = len - len2;
            idx = str.indexOf(a);

            if (idx < 0) return str;

            result = str.substring(0, idx) + b + str.substring(idx + len2 + diffLens);

            return result;
      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    