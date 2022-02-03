package test.exercise.testmeplz2.programmers;

import java.util.Arrays;
import java.util.Stack;


/**
 * packageName    : test.exercise.testmeplz2.programmers
 * fileName       : CraneDollPicker
 * author         : letscombine
 * date           : 2022-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-03        letscombine       최초 생성
 */


public class CraneDollPicker {
      public static void main(String[] args) {
            int[][] board = {{0, 0, 0, 0, 0}, {0, 0, 1, 0, 3}, {0, 2, 5, 0, 1}, {4, 2, 4, 4, 2}, {3, 5, 1, 3, 1}};
            int[] moves = {1, 5, 3, 5, 1, 2, 1, 4};

            Solution6 solution6 = new Solution6();
            solution6.solution(board, moves);

      }
}

class Solution6 {
      public int solution(int[][] board, int[] moves) {
            int answer = 0;
            System.out.println("board = " + Arrays.deepToString(board));
            System.out.println("moves = " + Arrays.toString(moves));
            System.out.println("======================================================");
            int movesCount = 0;
            Stack<Integer> resultStack = new Stack<>();

            for (int repeat = 0; repeat < moves.length; repeat++) { //반복횟수입니다.
                  int moveNum = moves[repeat] - 1;
                  loop1 : for (int index = 0; index < board.length; index++) { // 보드의 층
                        for (int index2 = 0; index2 < board[index].length; index2++) { //보드의 칸!
                              int boardNum = board[index][index2];

                              if (index2 == moveNum && boardNum != 0) {
                                    System.out.print(board[index][index2]);
                                    System.out.println("index = " + index);
                                    System.out.println("index2 = " + index2);
                                    System.out.println("boardNum = " + boardNum);
                                    resultStack.push(boardNum);

                                    board[index][index2] = 0;
                                    System.out.println("resultStack = " + resultStack);
                                    if (resultStack.size() >= 2) {
                                          if (resultStack.peek() == resultStack.get(resultStack.size() - 2)) {
                                                System.out.println(resultStack.peek());
                                                System.out.println(resultStack.get(resultStack.size() - 2));
                                                resultStack.pop();
                                                resultStack.pop();
                                                answer += 2;
                                          }

                                    }
                                    break loop1;

                              }
                        }
                        System.out.println("======================================================");
                  }
            }
            System.out.println("answer = " + answer);
            return answer;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    