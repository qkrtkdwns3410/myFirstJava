package test.exercise.testmeplz2.programmers.lv1;

import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : CenterOfWord
 * author         : letscombine
 * date           : 2022-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-10        letscombine       최초 생성
 */


public class CenterOfWord {
      
      public static void main(String[] args) {
            
            solution("abcde");
            System.out.println("======================================================");
            solution("qwer");
      }
      
      public static StringBuilder solution(String s) {
      
            String answer = "";
            System.out.println("s = " + s);
            
            int wordLength = s.length();
            char[] charStr = new char[s.length()];
            for (int chrIdx = 0; chrIdx < wordLength; chrIdx += 1) {
                  charStr[chrIdx] = s.charAt(chrIdx);
            }
            System.out.println("charStr = " + Arrays.toString(charStr));
      
            StringBuilder resultSB = new StringBuilder();
      
            if (wordLength % 2 == 0) {
                  resultSB.append(charStr[wordLength / 2 - 1]);
                  resultSB.append(charStr[wordLength / 2]);
            } else {
                  resultSB.append(charStr[wordLength / 2]);
            }
            System.out.println("resultSB = " + resultSB);
            
            return resultSB;
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    