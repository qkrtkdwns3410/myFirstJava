package test.doit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;


/**
 * packageName    : test.doit
 * fileName       : QueueCoding
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class QueueCoding {
      public static void main(String[] args) {
            int[] prices = {1, 2, 3, 2, 3};
            Solution solution = new Solution();
            solution.solution(prices);
      }
}

class Solution {
      public int[] solution(int[] prices) {

            int[] answer = new int[prices.length];
            Stack<Integer> stack = new Stack<>();

            for (int i = 0; i < prices.length; i++) {
                  while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                        //prices 배열의 값이 스택에서 제일 위의 값보다 작다면 <- 주식 가격의 하락

                        System.out.println("prices = " + prices[stack.peek()]);
                        int idx = stack.pop(); //스택에 마지막 값을 제거하여 제일 마지막 주식 매수한 시점의 answer가 1이 되는 것
                        //answer인덱스에 얼마만에 찾았는지 기록
                        answer[idx] = i - idx;
                  }
                  stack.push(i); //0번 값부터 ~n-1까지 스택에 천천히 담는 역할
            }
            System.out.println("stack = " + stack);

            while (!stack.isEmpty()) {
                  int leftIdx = stack.pop();
                  answer[leftIdx] = prices.length - leftIdx - 1;

            }
            System.out.println("answer = " + Arrays.toString(answer));

            return answer;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    