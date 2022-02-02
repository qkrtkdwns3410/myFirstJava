package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : LottoLowestRankAndHighestRank
 * author         : letscombine
 * date           : 2022-01-27
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-27        letscombine       최초 생성
 */


public class LottoLowestRankAndHighestRank {
      public static void main(String[] args) {
            int[] lottos = {44, 1, 0, 0, 31, 25};
            int[] win_nums = {31, 10, 45, 1, 6, 19};

            Solution4 solution4 = new Solution4();
            solution4.solution(lottos, win_nums);
      }
}

/*
* 로또 6/45 1부터 45까지의 숫자 중 6개를 찍어서 맞히는 대표적인 복권
* 1순위 6개 번호 일치
* 2순위 5개...
* 5순위 2개 번호
* 6순위 낙첨 그외.
*
* 당첨 시의 최고 순위 와 최저 순위?
*
*
*
* */

class Solution4 {
      public ArrayList<Integer> solution(int[] lottos, int[] win_nums) {
            ArrayList<Integer> answer = new ArrayList<>();
            int count = 0;
            int maxCount = 0;
            for (int lotto : lottos) {


                  for (int win_num : win_nums) {
                        if (lotto == 0) {
                              maxCount++;
                              break;
                        }
                        if (lotto == win_num) {
                              count++;
                        }
                  }

            }

            answer.add(lottoRank(count+maxCount));
            answer.add(lottoRank(count ));
            return answer;
      }

      /**
       * @param count  ** 번호가 얼마나 일치 했냐는 따지는 count입니다.
       * @return rank   ** 일치 여부에 따라 해당 rank를 반환합니다.
       */
       private int lottoRank(int count) {
            int rank = 0;
            if (count == 6) {
                  rank = 1;
            } else if (count == 5) {
                  rank = 2;
            } else if (count == 4) {
                  rank = 3;
            } else if (count == 3) {
                  rank = 4;
            } else if (count == 2) {
                  rank = 5;
            } else {
                  rank = 6;
            }
            return rank;
      }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    