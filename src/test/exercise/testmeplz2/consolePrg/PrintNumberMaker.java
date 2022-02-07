package test.exercise.testmeplz2.consolePrg;

import com.sun.corba.se.impl.encoding.CodeSetConversion;

import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.consolePrg
 * fileName       : PrintNumberMaker
 * author         : letscombine
 * date           : 2022-02-07
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-07        letscombine       최초 생성
 */


public class PrintNumberMaker {
      public static void main(String[] args) {
            solution(new int[]{1, 2, 3, 4});
            solution(new int[]{1, 2, 7, 6, 4});

      }

      public static int solution(int[] nums) {
            System.out.println("======================================================");
            System.out.println("nums = " + Arrays.toString(nums));

            int sum = 0;
            int count = 0;
            for (int numsIndex = 0; numsIndex < nums.length - 1; numsIndex++) {
                  if (numsIndex == nums.length - 2) {
                        break;
                  }

                  int num1 = nums[numsIndex];
                  System.out.println("num = " + num1);

                  for (int numsIndex2 = numsIndex + 1; numsIndex2 < nums.length; numsIndex2++) {
                        if (numsIndex2 == nums.length - 1) {
                              break;
                        }

                        int num2 = nums[numsIndex2];
                        System.out.println("num2 = " + num2);

                        for (int numsIndex3 = numsIndex2 + 1; numsIndex3 < nums.length; numsIndex3++) {
                              int num3 = nums[numsIndex3];
                              System.out.println("num3 = " + num3);
                              sum = num1 + num2 + num3;
                              System.out.println("sum = " + sum);

                              if (sum < 3) {
                                    break;
                              }

                              if (checkPrimeNumber(sum)) {
                                    count++;
                                    System.out.println("count = " + count);
                              }

                        }

                  }
            }
            System.out.println("count = " + count);
            return count;
      }

      // Math없이 제곱근 구현이 너무 힘듬. > 제곱근만 구현이 가능하다면
      public static boolean checkPrimeNumber(int sum) {
            double sqrtSum = sqrt(sum);
            System.out.println("sqrtSum = " + sqrtSum);

            //시간복잡도 절반으로 줄어듦
            for (int num = 2; num <= sqrtSum; num++) {
                  if (sum % num == 0) {
                        return false;
                  }
            }
            return true;
      }

      //정확도
      private static final int PRECISION = 30;

      public static double sqrt(int sum) {

            double x = PRECISION;

            for (int index = 0; index < PRECISION; index++) {
                  x = 0.5 * (sum / x + x);
            }
            return x;
      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    