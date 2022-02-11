package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : DartGame
 * author         : letscombine
 * date           : 2022-02-10
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-10        letscombine       최초 생성
 */


public class DartGame {
      
      public static void main(String[] args) {
            
            solution("1S2D*3T");
            System.out.println("======================================================");
            solution("1D2S#10S");
            System.out.println("======================================================");
            solution("1D2S0T");
            System.out.println("======================================================");
            solution("1S*2T*3S");
            System.out.println("======================================================");
            solution("1D#2S*3S");
            System.out.println("======================================================");
            solution("1T2D3D#");
            System.out.println("======================================================");
            solution("1D2S3T*");
            
      }
      
      public static int solution(String dartResult) {
            
            System.out.println("dartResult = " + dartResult);
            String[] strArr;
            ArrayList<String> strList = new ArrayList<>();
            
            strArr = dartResult.split("");
            for (int count = 0; count < strArr.length; count += 1) {
                  strList.add(strArr[count]);
            }
            
            System.out.println("strList = " + strList);
            
            for (int count = 0; count < strList.size() - 1; count += 1) {
                  if (strList.get(count).equals("1") && strList.get(count + 1).equals("0")) {
                        strList.set(count, "10");
                        strList.remove(count + 1);
                  }
            }
            
            System.out.println("strList = " + strList);
            ArrayList<ArrayList<String>> splitList = new ArrayList<>();
            ArrayList<String> splitInnerList = new ArrayList<>();
            ArrayList<String> splitInnerListLoopList = new ArrayList<>();
            
            //1 D 2 S 3 T *
            for (int splitCount = 0; splitCount < strList.size(); splitCount += 1) {
                  splitInnerList.add(strList.get(splitCount));
                  
                  System.out.println("splitInnerList = " + splitInnerList);
                  
                  if (splitCount == strList.size() - 1) {
                        splitList.add(splitInnerList);
                        System.out.println("splitList = " + splitList);
                  }
                  
                  if (splitCount != 0 && in(strList.get(splitCount), "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10")) {
                        System.out.println();
                        System.out.println("이거 정확하게 타는거 맞습니까????");
                        System.out.println();
                        
                        String tempStr = splitInnerList.get(splitInnerList.size() - 1);
                        
                        splitInnerList.remove(splitInnerList.size() - 1);
                        
                        splitList.add(splitInnerList);
                        
                        System.out.println("splitInnerList = " + splitInnerList);
                        
                        splitInnerList = new ArrayList<>();
                        
                        splitInnerList.add(tempStr);
                        
                  }
                  
            }
            
            ArrayList<Integer> answerList = new ArrayList<>(); //점수를 담는 배열입니다.
            
            //여기서 부터는 연산해야합니다
            for (int splitListIdx = 0; splitListIdx < splitList.size(); splitListIdx += 1) {
                  
                  int powMe = Integer.parseInt(splitList.get(splitListIdx).get(0));
                  String powHowStr = splitList.get(splitListIdx).get(1);
                  
                  System.out.println("splitListIdx = " + splitListIdx);
                  
                  int powHow = 0;
                  
                  switch (powHowStr) {
                        case "S":
                              powHow = 1;
                              System.out.println("1 선택됨");
                              break;
                        
                        case "D":
                              powHow = 2;
                              System.out.println("2 선택됨");
                              break;
                        
                        case "T":
                              powHow = 3;
                              System.out.println("3 선택됨");
                              break;
                        
                        default:
                              System.out.println("무언가 오류가 있습니다");
                              break;
                  }
                  int option = 1;
                  
                  
                  System.out.println("powMe = " + powMe);
                  System.out.println("powHow = " + powHow);
                  
                  int result = pow(powMe, powHow);
                  System.out.println("result = " + result);
                  
                  if (splitList.get(splitListIdx).size() >= 3) {
                        if (splitListIdx == 0) { //첫번쨰 * 라면 점수를 내 배열만
                              if (splitList.get(splitListIdx).get(2).equals("*")) {
                                    result *= 2;
                              } else if (splitList.get(splitListIdx).get(2).equals("#")) {
                                    option = -1;
                              }
                        } else { // 첫 번째의 idx 가 아니라면 전 배열과 내 배열의 값을 2배씩합니다.
                              if (splitList.get(splitListIdx).get(2).equals("*")) {
                                    answerList.set(splitListIdx - 1, answerList.get(splitListIdx - 1) * 2);
                                    result *= 2;
                              } else if (splitList.get(splitListIdx).get(2).equals("#")) {
                                    option = -1;
                              }
                              
                        }
                  }
                  
                  result = result * option;
                  answerList.add(result);
            }
            System.out.println("answerList = " + answerList);
            int answer = 0;
            for (int ansIdx = 0; ansIdx < answerList.size(); ansIdx += 1) {
                  answer += answerList.get(ansIdx);
            }
            return answer;
      }
      
      public static int pow(int num1, int num2) {
            
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            
            int result = 1;
            
            for (int count = 0; count < num2; count += 1) {
                  result *= num1;
            }
            
            System.out.println("result = " + result);
            
            return result;
            
      }
      
      public static boolean in(String value, String... values) {
            
            System.out.println("values = " + Arrays.toString(values));
            for (String v : values) {
                  System.out.println("v = " + v);
                  if (v.equals(value)) {
                        return true;
                  }
            }
            return false;
            
      }
      
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    