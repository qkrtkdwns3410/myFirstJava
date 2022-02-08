package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : KNumber
 * author         : letscombine
 * date           : 2022-02-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-08        letscombine       최초 생성
 */


public class KNumber {
      public static void main(String[] args) {
            System.out.println((solution(new int[]{1, 5, 2, 6, 3, 7, 4}, new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}})));
      }

      public static ArrayList<Integer> solution(int[] array, int[][] commands) {
            System.out.println("array = " + Arrays.toString(array));
            System.out.println("commands = " + Arrays.deepToString(commands));
            System.out.println("======================================================");

            ArrayList<Integer> answer = new ArrayList<>();

            for (int[] command : commands) {
                  ArrayList<Integer> newList = new ArrayList<>();
                  System.out.println("newList = " + newList);

                  for (int startIndex = command[0] - 1; startIndex <= command[1] - 1; startIndex++) {
                        System.out.println("startIndex = " + startIndex);
                        newList.add(array[startIndex]);
                  }
                  System.out.println("newList = " + newList);
                  for (int newListIndex = 0; newListIndex < newList.size() - 1; newListIndex++) {
                        for (int newListIndex2 = newListIndex; newListIndex2 < newList.size(); newListIndex2++) {
                              if (newList.get(newListIndex) > newList.get(newListIndex2)) {
                                    int newListIndex2Value = newList.get(newListIndex2);
                                    int newListIndexValue = newList.get(newListIndex);

                                    newList.set(newListIndex2, newListIndexValue);
                                    newList.set(newListIndex, newListIndex2Value);
                                    System.out.println("newList = " + newList);
                              }
                        }
                  }

                  answer.add(newList.get(command[2] - 1));

            }
            System.out.println("answer = " + answer);

            return answer;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    