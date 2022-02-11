package test.exercise.testmeplz2.programmers.lv1;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : InnerProduct
 * author         : psj
 * date           : 2022-02-06
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-06        psj       최초 생성
 */
public class InnerProduct {
      public static void main(String[] args) {
            int[] a = {1, 2, 3, 4};
            int[] b = {-3, -1, 0, 2};

            Solution9 solution9 = new Solution9();
            solution9.solution(a, b);
      }
}

class Solution9 {
      public int solution(int[] a, int[] b) {
            int productSum = 0;
            for (int aIndex = 0; aIndex < a.length; aIndex++) {
                  for (int bIndex = 0; bIndex < b.length; bIndex++) {
                        if (aIndex == bIndex) {
                              productSum += a[aIndex] * b[bIndex];
                        }
                  }
            }

            return productSum;
      }
}


























