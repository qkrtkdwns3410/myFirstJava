package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


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
            
            HashMap<String, String> optionMap = new HashMap<>();
            optionMap.put("S", "1");
            optionMap.put("D", "2");
            optionMap.put("T", "3");
            optionMap.put("#", "-");
            
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
            
            //여기서 부터는 연산해야합니다
            for (int splitListIdx = 0; splitListIdx < splitList.size(); splitListIdx += 1) {
                  int powMe = Integer.parseInt(splitList.get(splitListIdx).get(0));
                  String powHowStr = splitList.get(splitListIdx).get(1);
                  int powHow = 0;
      
                  switch (powHowStr) {
                        case "S":
                              powHow = 1;
                              break;
                        case "D":
                              powHow = 2;
                              break;
                        case "T":
                              powHow = 3;
                              break;
                        default:
                              System.out.println("무언가 오류가 있습니다");
                              break;
                  }
                  if (splitListIdx == 0) {
                  
                  }
                  
                  int result = pow(powMe, powHow);
                  System.out.println("result = " + result);
                  
            }
            
            return 0;
      }
      
      public static int pow(int num1, int num2) {
            
            System.out.println("num1 = " + num1);
            System.out.println("num2 = " + num2);
            
            int result = 0;
            
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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    