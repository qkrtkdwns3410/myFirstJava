package test.exercise.testmeplz2.programmers.lv1;

import java.util.ArrayList;


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
            //            solution(5, new int[]{3, 5}, new int[]{2, 4});
            System.out.println("======================================================");

            //            solution(5, new int[]{1, 2}, new int[]{2, 3});
            System.out.println("======================================================");

            solution(10, new int[]{5, 4, 3, 2, 1}, new int[]{3, 1, 2, 5, 4});

            System.out.println("======================================================");
            solution(5, new int[]{2, 4}, new int[]{3});

            System.out.println("======================================================");
            solution(5, new int[]{2, 4}, new int[]{1, 3, 5});
      }

      public static int solution(int n, int[] lost, int[] reserve) {

            ArrayList<Integer> people = new ArrayList<>();
            for (int num = 0; num < n; num++) {
                  people.add(0);
            }
            System.out.println("people = " + people);
            int answer = n;

            /*일단
             * people 배열을 만들고.. > n 크기만큼
             * lost 인덱스 위치에 값을 -- 시킵니다.
             *
             * reserve 인덱스의 위치 값을 ++ 시킵니다
             * people배열에 people이 -1 ( people의 친구가  )이라면 인덱스가 처음인지 검증! >
             *           1.처음인 경우
             *                 앞 인덱스의 값이 배열의 마지막에 위치하는 지 검증필요 || 뒤의 인덱스의 값이 1이라면 빌려줄수 있습니다.
             *            2. 마지막인 경우
             *                  인덱스가 0 미만인 경우 걸러야함
             *                   앞의 인덱스 값이 1이라면 빌려줄 수 있습니다.
             *              3. 기본 논리
             *                       앞 뒤의 인덱스 검증 || 인덱스의 값이 1 인가? 빌려줄수잇음.
             *                       앞 뒤의 인덱스값이 1이 아닌경우 answer의 값을 하나 제거해야함 ( 왜냐 ? 해당 인덱스의 친구는 주위의 친구들이 도와줄 수 없음
             *
             *
             *
             * */
            for (int lostIdx : lost) {
                  people.set(lostIdx - 1, -1);
            }
            
            System.out.println("people = " + people);
            for (int reserveIdx : reserve) {
                  int peopleValue = people.get(reserveIdx - 1);
                  people.set(reserveIdx - 1, peopleValue += 1);
            }
            
            System.out.println("people = " + people);

            for (int repeat = 0; repeat < people.size(); repeat++) {
                  if (people.get(repeat) == -1) {
                        int peopleValue = people.get(repeat);
                        
                        if (repeat - 1 >= 0 && people.get(repeat - 1) == 1) {

                              people.set(repeat, peopleValue += 1);// 옆에 도움받는거임 -1 이 0으로 둔갑?!
                              people.set(repeat - 1, 0);
                              
                        } else if (repeat + 1 < people.size() && people.get(repeat + 1) == 1) {
                              people.set(repeat, peopleValue += 1);// 옆에 도움받는거임 -1 이 0으로 둔갑?!
                              people.set(repeat + 1, 0);
                              
                        } else {
                              answer -= 1;
                        }
                  }
                  System.out.println("people = " + people);
            }
            
            System.out.println("answer = " + answer);
            return answer;
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    