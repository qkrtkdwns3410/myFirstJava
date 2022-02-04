package test.exercise.testmeplz2.FebEx;

import java.util.Arrays;
import java.util.Scanner;


/**
 * packageName    : test.exercise.testmeplz2.FebEx
 * fileName       : MagicSquare
 * author         : letscombine
 * date           : 2022-02-03
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-02-03        letscombine       최초 생성
 */


public class MagicSquareApplication {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            try {

                  int chaNum = 2;

                  //                  System.out.print("차수를 입력해주세요 : ");
                  //                  int chaSrt = Integer.parseInt(sc.nextLine()); //차수를 입력받습니다

                  if (chaNum % 2 == 0) { //짝수인 경우
                        if (chaNum % 4 == 0) {
                              evenMagicSquareByFour(chaNum);

                        } else {
                              evenMagicSquareNotFour(chaNum);

                        }

                  } else {
                        oddMagicSquare(chaNum);

                  }

            } catch (Exception e) {
                  e.printStackTrace();
            }

      }

      private static void evenMagicSquareByFour(int chaNum) {
            int[][] magicSquare = new int[chaNum][chaNum];
            int number = 1;
            for (int row = 0; row <= magicSquare.length; row++) {
                  for (int line = 0; line <= magicSquare[row].length; line++) {
                        magicSquare[row][line] = number;
                        number++;
                  }
            }
            System.out.println("magicSquare = " + Arrays.deepToString(magicSquare));

      }

      private static void evenMagicSquareNotFour(int chaNum) {

      }

      private static void oddMagicSquare(int chaNum) {
            int[][] magicSquare = new int[chaNum][chaNum];


            //시작 값을 첫 행의 한 가운데 둡니다.
            int row = 0;
            int line = chaNum / 2;
            int squareNumber = 1;

            while (true) {
                  if (row < 0) {
                        row = chaNum - 1;
                  }

                  if (line == chaNum) {
                        line = 0;
                  }

                  if (magicSquare[row][line]==0) {
                        magicSquare[row][line] = squareNumber;
                  }

                  if (squareNumber % chaNum == 0) { //넣은 수가 배수라면 행만 증가시킵니다
                        row++;
                  } else {
                        row--;
                        line++;
                  }

                  squareNumber++;
                  if (squareNumber == chaNum * chaNum + 1) {
                        break; //숫자를 넘어가면 바로 종료됩니다
                  }
            }
            for (int[] rowArr : magicSquare) {
                  for (int rowArrValue : rowArr) {
                        System.out.print(rowArrValue + " ");
                  }
                  System.out.println();
            }
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    