package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : KeypadPush
 * author         : letscombine
 * date           : 2022-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-03        letscombine       최초 생성
 */


public class KeypadPush {
      public static void main(String[] args) {
            int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
            String hands = "left";

            Solution7 solution7 = new Solution7();
            solution7.solution(numbers, hands);
      }
}

class Solution7 {
      public StringBuilder solution(int[] numbers, String hand) {
            System.out.println("numbers = " + Arrays.toString(numbers));
            System.out.println("hand = " + hand);
            System.out.println("======================================================");

            ArrayList<String> data1 = new ArrayList<>();
            data1.add("1");
            data1.add("2");
            data1.add("3");

            ArrayList<String> data2 = new ArrayList<>();
            data2.add("4");
            data2.add("5");
            data2.add("6");

            ArrayList<String> data3 = new ArrayList<>();
            data3.add("7");
            data3.add("8");
            data3.add("9");

            ArrayList<String> data4 = new ArrayList<>();
            data4.add("10");
            data4.add("11");
            data4.add("12");

            ArrayList<ArrayList<String>> keypad = new ArrayList<>();

            keypad.add(data1);
            keypad.add(data2);
            keypad.add(data3);
            keypad.add(data4);

            System.out.println("keypad = " + keypad);
            System.out.println("======================================================");

            ArrayList<Integer> leftArr = new ArrayList<>();
            ArrayList<Integer> rightArr = new ArrayList<>();

            ArrayList<String> resultArr = new ArrayList<>();

            String leftPos = "10"; // 왼손의 위치

            String rightPos = "12"; // 오른손의 위치

            leftArr.add(1);
            leftArr.add(4);
            leftArr.add(7);

            rightArr.add(3);
            rightArr.add(6);
            rightArr.add(9);


            for (int number : numbers) { // 반복해야하는 횟수
                  if (leftArr.contains(number)) { //무조건 왼손으로 사용하는 경우 제거
                        leftPos = String.valueOf(number);
                        resultArr.add("L");
                        System.out.println("무조건 왼손");
                        System.out.println("resultArr = " + resultArr);
                        System.out.println();
                  } else if (rightArr.contains(number)) { // 무조건 오른손으로 사용하는 경우 제거
                        rightPos = String.valueOf(number);
                        resultArr.add("R");
                        System.out.println("무조건 오른손");
                        System.out.println("resultArr = " + resultArr);
                        System.out.println();
                  } else {
                        for (int index = 0; index < keypad.size(); index++) {
                              ArrayList<String> strArr = keypad.get(index);
                              for (int index2 = 0; index2 < strArr.size(); index2++) {
                                    String str = strArr.get(index2);
                                    if (str .equals("11") ) {
                                          str = "0";
                                    }
                                    System.out.println("leftPos = " + leftPos); //8
                                    System.out.println("rightPos = " + rightPos); //0
                                    System.out.println("검증전");
                                    System.out.println("resultArr = " + resultArr);
                                    System.out.println();
                                    if (str.equals(Integer.toString(number))) { //숫자를 문자로 변환하고 해당 키패드의 값이 number값과 동일한 지 검증.
                                          System.out.println("검증 후");
                                          System.out.println("str = " + str); //8
                                          System.out.println("leftPos = " + leftPos);
                                          System.out.println();
                                          System.out.println("rightPos = " + rightPos);
                                          if (number == 0) {
                                                number = 11;
                                          }
                                          int leftDis = Math.abs((Integer.parseInt(leftPos) - 1) / 3 - ((number-1)/3)) + Math.abs((Integer.parseInt(leftPos) - 1) % 3 - ((number-1)%3));
                                          int rightDis = Math.abs((Integer.parseInt(rightPos) - 1) / 3 - ((number-1)/3)) + Math.abs((Integer.parseInt(rightPos) - 1) % 3 - ((number-1)%3));
                                          System.out.println("leftDis = " + leftDis);
                                          System.out.println("rightDis = " + rightDis);

                                          if (leftDis > rightDis) {
                                                rightPos = String.valueOf(number);
                                                resultArr.add("R");
                                                System.out.println("오른손으로");
                                                System.out.println("resultArr = " + resultArr);
                                          } else if (leftDis < rightDis) {
                                                leftPos = String.valueOf(number);
                                                resultArr.add("L");
                                                System.out.println("왼손으로");
                                                System.out.println("resultArr = " + resultArr);

                                          } else {
                                                System.out.println("주손 체크");
                                                if (hand.equals("left")) {
                                                      //주 손이 왼손이라면
                                                      resultArr.add("L");
                                                      leftPos = String.valueOf(number);
                                                      System.out.println("leftPos = " + leftPos);
                                                } else {
                                                      // 주손이 오른손이라면
                                                      resultArr.add("R");
                                                      rightPos = String.valueOf(number);
                                                      System.out.println("rightPos = " + rightPos);
                                                }
                                          }
                                    }



                              }
                              System.out.println();
                              System.out.println("======================================================");
                              System.out.println("resultArr = " + resultArr);
                        }
                  }


            }

            StringBuilder sb = new StringBuilder();
            for (String str : resultArr) {
                  sb.append(str);
            }
            System.out.println("sb = " + sb);
            return sb;
      }


}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    