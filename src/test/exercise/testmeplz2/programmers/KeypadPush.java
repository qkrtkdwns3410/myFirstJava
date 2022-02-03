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
            int[] numbers = {1, 3, 4, 5, 7, 2, 1, 4, 5, 9, 5,};
            String hands = "right";

            Solution7 solution7 = new Solution7();
            solution7.solution(numbers, hands);
      }
}

class Solution7 {
      public String solution(int[] numbers, String hand) {
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
            data4.add("0");
            data4.add("11");

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

            String leftPos = ""; // 왼손의 위치
            int leftPosX = 0;
            int leftPosY = 0;

            String rightPos = ""; // 오른손의 위치
            int rightPosX = 0;
            int rightPosY = 0;

            leftArr.add(1);
            leftArr.add(4);
            leftArr.add(7);

            rightArr.add(3);
            rightArr.add(6);
            rightArr.add(9);

            String answer = "";

            for (int number : numbers) { // 반복해야하는 횟수
                  if (leftArr.contains(number)) { //무조건 왼손으로 사용하는 경우 제거
                        leftPos = String.valueOf(number);
                        resultArr.add("L");
                  } else if (rightArr.contains(number)) { // 무조건 오른손으로 사용하는 경우 제거
                        rightPos = String.valueOf(number);
                        resultArr.add("R");
                  } else {
                        for (int index = 0; index < keypad.size(); index++) {
                              ArrayList<String> strArr = keypad.get(index);
                              for (int index2 = 0; index2 < strArr.size(); index2++) {
                                    String str = strArr.get(index2);

                                    if (leftPos.equals(str)) { //왼손의 자리의 index를 저장합니다.
                                          System.out.println("leftPos = " + leftPos);
                                          leftPosX = index;
                                          leftPosY = index2;
                                    }
                                    if (rightPos.equals(str)) { //오른손의 자리의 index를 저장합니다.
                                          System.out.println("rightPos = " + rightPos);
                                          rightPosX = index;
                                          rightPosY = index2;
                                    }

                                    if (str.equals(Integer.toString(number))) { //숫자를 문자로 변환하고 해당 키패드의 값이 number값과 동일한 지 검증.
                                          System.out.println("str = " + str);
                                          int leftDis = Math.abs(leftPosX - index) + Math.abs(leftPosY - index2);
                                          int rightDis = Math.abs(rightPosX - index) + Math.abs(rightPosY - index2);

                                          if (leftDis > rightDis) {

                                          } else if (leftDis < rightDis) {

                                          } else {
                                                if (hand.equals("left")) {
                                                      //주 손이 왼손이라면
                                                      resultArr.add("L");
                                                } else {
                                                      // 주손이 오른손이라면
                                                      resultArr.add("R");
                                                }
                                          }
                                    }



                              }
                              System.out.println();
                              System.out.println("======================================================");
                        }
                  }


                  //브레인스토뮝
                  /*
                   * 1. 현재 사용자의 손이 어떤 손인지!
                   *           어떤 손인지에 따라서 거리가 같은 경우 어떠한 손을 사용해야하는 지에 대한 사고
                   * 2. 현재 손의 위치를 기억해야합니다 (-1 만큼만)
                   * 3.
                   *
                   * */
            }


            return answer;
      }

      private void distanceCalc(int leftPos, int rightPos, String pushNum) {
            int distance = 0;
            System.out.println("leftPos = " + leftPos);
            System.out.println("rightPos = " + rightPos);
            System.out.println("pushNum = " + pushNum);
            System.out.println("======================================================");


      }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    