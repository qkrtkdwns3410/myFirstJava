package test.exercise.testmeplz2.programmers;

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
            String new_id = "abcdefghijklmn.p";
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
            new_id = new_id.replaceAll("[^a-z\\s0-9\\-_.]", "");
            System.out.println("new_id = " + new_id);
            //3단계 ....을 . 으로
            new_id = new_id.replaceAll("[.]{2,}", ".");
            System.out.println("new_id = " + new_id);
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
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    