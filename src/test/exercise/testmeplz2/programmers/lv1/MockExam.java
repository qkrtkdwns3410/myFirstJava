package test.exercise.testmeplz2.programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : MockExam
 * author         : letscombine
 * date           : 2022-02-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-08        letscombine       최초 생성
 */


public class MockExam {
      public static void main(String[] args) {
            //            System.out.println(solution(new int[]{1,2,3,4,5,1,2,3,4,5,1,2,3,4,5}));
            System.out.println("======================================================");
            //            System.out.println(solution(new int[]{1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5}));
            System.out.println("======================================================");
            System.out.println(solution(new int[]{2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5,}));

      }

      public static ArrayList<Integer> solution(int[] answers) {
            ArrayList<Integer> maxRank;

            System.out.println("answers = " + Arrays.toString(answers));
            int[] scoreArr = new int[3];

            int[][] mathArr = {{1, 2, 3, 4, 5}, {2, 1, 2, 3, 2, 4, 2, 5}, {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

            for (int repeat = 0; repeat < 3; repeat++) {

                  for (int index = 0; index < answers.length; index++) {

                        System.out.println("index = " + index);
                        int answerIndexRe = index;

                        for (int answerIndex = 0; answerIndex < mathArr[repeat].length; answerIndex++) {
                              if (answerIndexRe >= mathArr[repeat].length) {
                                    answerIndexRe = 0;
                              }
                              System.out.println("answerIndexRe = " + answerIndexRe);

                              int indexChanged = 0;

                              if (index >= mathArr[repeat].length) {
                                    indexChanged = index % mathArr[repeat].length;
                              } else {
                                    indexChanged = index;
                              }

                              System.out.println("indexChanged = " + indexChanged);

                              if (indexChanged == answerIndexRe && answers[index] == mathArr[repeat][answerIndexRe]) {
                                    System.out.println("같음");
                                    System.out.println(answers[index]);
                                    System.out.println(mathArr[repeat][answerIndexRe]);
                                    System.out.println("======================================================");

                                    scoreArr[repeat]++;
                                    break;
                              }
                              answerIndexRe++;
                              System.out.println();

                        }

                  }


            }
            System.out.println("scoreArr = " + Arrays.toString(scoreArr));
            int maxValue = 0;

            maxRank = new ArrayList<>();
            for (int index = 0; index < scoreArr.length; index++) {
                  if (scoreArr[index] > maxValue) {
                        maxValue = scoreArr[index];
                  }
            }

            System.out.println("maxValue = " + maxValue);

            for (int index = 0; index < scoreArr.length; index++) {
                  if (maxValue == scoreArr[index]) {
                        maxRank.add(index + 1);
                  }
            }

            System.out.println("maxRank = " + maxRank);


            return maxRank;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    