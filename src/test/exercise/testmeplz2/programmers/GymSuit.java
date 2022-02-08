package test.exercise.testmeplz2.programmers;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : GymSuit
 * author         : letscombine
 * date           : 2022-02-08
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-08        letscombine       최초 생성
 */


public class GymSuit {
      public static void main(String[] args) {
            solution(5, new int[]{3, 5}, new int[]{2, 4});
            System.out.println("======================================================");

            solution(5, new int[]{1, 2}, new int[]{2, 3});
            System.out.println("======================================================");

            solution(10, new int[]{5, 4, 3, 2, 1}, new int[]{3, 1, 2, 5, 4});

            System.out.println("======================================================");
            solution(5, new int[]{2, 4}, new int[]{3});

            System.out.println("======================================================");
            solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
      }

      public static int solution(int n, int[] lost, int[] reserve) {
            System.out.println("n = " + n);
            System.out.println("reserve = " + Arrays.toString(reserve));
            System.out.println("lost = " + Arrays.toString(lost));
            System.out.println("======================================================");
            int specialSum = 0;

            int answer = 0;

            ArrayList<Integer> lostList = new ArrayList<>();
            ArrayList<Integer> reserveList = new ArrayList<>();

            for (int k : lost) {
                  lostList.add(k);
            }
            for (int j : reserve) {
                  reserveList.add(j);
            }
            specialSum = lostList.size();

            for (int index = 0; index < lostList.size() - 1; index++) {
                  for (int index2 = index; index2 < lostList.size(); index2++) {
                        if (lostList.get(index) > lostList.get(index2)) {
                              int temp = lostList.get(index);
                              int temp2 = lostList.get(index2);
                              lostList.set(index, temp2);
                              lostList.set(index2, temp);
                        }
                  }
            }

            for (int index = 0; index < reserveList.size() - 1; index++) {
                  for (int index2 = index; index2 < reserveList.size(); index2++) {
                        if (reserveList.get(index) > reserveList.get(index2)) {
                              int temp = reserveList.get(index);
                              int temp2 = reserveList.get(index2);

                              reserveList.set(index, temp2);
                              reserveList.set(index2, temp);
                        }
                  }
            }
            System.out.println("lostList = " + lostList);
            System.out.println("reserveList = " + reserveList);

            int count = 0;
            int whileCount = 50;
            while (whileCount > 0) {
                  whileCount--;
                  for (int lostIndex = 0; lostIndex < lostList.size(); lostIndex++) {
                        int lostListValue = lostList.get(lostIndex);

                        for (int reserveIndex = 0; reserveIndex < reserveList.size(); reserveIndex++) {
                              int reserveListValue = reserveList.get(reserveIndex);

                              if (lostListValue == reserveListValue) {

                                    System.out.println("체육복 여분을 가진 친구가 또 잃어버림;;");
                                    count++;
                                    reserveList.remove(reserveIndex);
                                    lostList.remove(lostIndex);

                                    System.out.println("reserveList = " + reserveList);
                                    System.out.println("lostList = " + lostList);

                                    break;

                              }
                        }
                  }
            }


            for (int i = 0; i < lostList.size(); i++) {
                  int lostListValue = lostList.get(i);
                  for (int reserveIndex = 0; reserveIndex < reserveList.size(); reserveIndex++) {
                        int reserveListValue = reserveList.get(reserveIndex);

                        if ((lostListValue < n && lostListValue > 1) && (reserveListValue == lostListValue - 1 || reserveListValue == lostListValue + 1)) {// 해당 값을 n 보다 작고 1보다 커야 양옆이 자유로움.
                              System.out.println("lostListValue = " + lostListValue);
                              System.out.println("reserveListValue = " + reserveListValue);
                              System.out.println("양옆이 자유로운 친구들");
                              reserveList.remove(reserveIndex);
                              lostList.remove(i);
                              count++;


                              break;
                        } else if (lostListValue == n && reserveListValue == lostListValue - 1) {
                              reserveList.remove(reserveIndex);
                              lostList.remove(i);

                              count++;
                              break;

                        } else if (lostListValue == 1 && reserveListValue == lostListValue + 1) {
                              reserveList.remove(reserveIndex);
                              lostList.remove(i);

                              count++;
                              break;

                        }
                  }
            }

            System.out.println("count = " + count);
            System.out.println("lostList = " + lostList);
            System.out.println("reserveList = " + reserveList);

            answer = count + (n - specialSum) + lostList.size();

            System.out.println("answer = " + answer);

            return answer;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    