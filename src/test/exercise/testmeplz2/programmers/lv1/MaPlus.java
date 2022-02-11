package test.exercise.testmeplz2.programmers.lv1;

/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : MaPlus
 * author         : psj
 * date           : 2022-02-05
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-05        psj       최초 생성
 */
public class MaPlus {
      public static void main(String[] args) {
            int[] absolutes = {4, 7, 12};
            boolean[] signs = {true, false, true};

            Solution8 solution8 = new Solution8();
            solution8.solution(absolutes, signs);
      }

}

class Solution8 {
      public int solution(int[] absolutes, boolean[] signs) {
            int sum = 0;

            for (int absIndex = 0; absIndex < absolutes.length; absIndex++) {
                  int absolute = absolutes[absIndex];
                  for (int signIndex = 0; signIndex < signs.length; signIndex++) {
                        boolean sign = signs[signIndex];
                        if (absIndex==signIndex) {
                              if (sign) {
                                    sum += absolute;
                              } else {
                                    sum -= absolute;
                              }
                        }
                  }
            }
            System.out.println("sum = " + sum);

            return sum;
      }
}

























