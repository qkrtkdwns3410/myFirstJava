package test.exercise.testmeplz2.FebEx;

import java.util.ArrayList;
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

            while (true) {
                  try {
                        System.out.println("\t\t\n\n종료는 백슬래시입니다!");
                        System.out.print("차수 입력 : ");

                        String chaNumStr = sc.nextLine();
                        checkBackSlash(chaNumStr);
                        int chaNum = Integer.parseInt(chaNumStr);

                        if (chaNum <= 2) {
                              System.out.println("\t\t 3이상의 차수를 입력해주세요!");
                              continue;
                        }

                        if (chaNum % 2 == 0) { //짝수인 경우
                              if (chaNum % 4 == 0) {
                                    evenMagicSquareByFour(chaNum);
                              } else {
                                    evenMagicSquareNotFour(chaNum);
                              }
                        } else {
                              int[][] magicSquare = oddMagicSquare(chaNum);
                              for (int[] rowArr : magicSquare) {
                                    for (int rowArrValue : rowArr) {
                                          System.out.print(rowArrValue + " ");
                                    }
                                    System.out.println();
                              }
                        }

                  } catch (NumberFormatException e) {
                        System.out.println("올바른 형식으로 입력해주세요");
                        System.out.println();
                  } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println();
                  }
            }
      }

      private static void checkBackSlash(String checkBack) {
            if (checkBack.equals("\\")) {
                  System.exit(0); //프로그램의 종료
            }
      }

      private static void evenMagicSquareByFour(int chaNum) {
            int[][] magicSquare = new int[chaNum][chaNum];
            int num = 1;
            int reverseNum = chaNum * chaNum;

            for (int row = 0; row < chaNum; row++) {
                  for (int line = 0; line < chaNum; line++) {

                        //마방진을 1:2:1 로 나누고 2부분에 해당하는 부분들만 원점 대칭으로 교환합니다

                        if ((chaNum / 4 > row && chaNum / 4 > line) || (chaNum / 4 > row && chaNum * 3 / 4 <= line) || (chaNum * 3 / 4 <= row && chaNum / 4 > line) || (chaNum * 3 / 4 <= row && chaNum * 3 / 4 <= line) || (chaNum / 4 <= row && chaNum * 3 / 4 > row && chaNum / 4 <= line && chaNum * 3 / 4 > line)) {
                              //정방향으로 숫자가 들어가는 영역입니다
                              magicSquare[row][line] = num;

                        } else {
                              magicSquare[row][line] = reverseNum;

                        }

                        System.out.print(magicSquare[row][line] + " ");

                        if (line == (chaNum - 1)) {
                              System.out.println();
                        }

                        num++;
                        reverseNum--;

                  }
            }
            //1. 1~16 까지의 숫자를 차례대로 배열에 넣어줍니다


      }

      private static void evenMagicSquareNotFour(int chaNum) {
            int[][] magicSquare = new int[chaNum][chaNum];

            //           1. 4의 배수가 아닌 짝수의 마방진을 만들때는 일단 size/2 차 마방진을 만들어야합니다
            //                14차 마방진을 만들고 싶다면, 이전에 7차 마방진을 만듭니다

            int halfSizeNum = chaNum / 2;
            //홀수의 마방진을 만듭니다. (원래의 마방진)
            //
            int[][] oddMsArr = oddMagicSquare(halfSizeNum);

            //4의 배수가아닌 짝수의 마방진을 만들기 위해서는 다음과 같은 4개의 공간으로 구분해야합니다
            int[][] leftUpArr = new int[halfSizeNum][halfSizeNum];
            int[][] leftDownArr = new int[halfSizeNum][halfSizeNum];
            int[][] rightUpArr = new int[halfSizeNum][halfSizeNum];
            int[][] rightDownArr = new int[halfSizeNum][halfSizeNum];

            //왼쪽 위의 마방진, 왼쪽 아래의 마방진
            for (int row = 0; row < halfSizeNum; row++) {
                  for (int line = 0; line < halfSizeNum; line++) {
                        if (row == halfSizeNum / 2) { // 해당 4분된 마방진의 중간 행의 경우 >>

                              if (line >= 1 && line <= (chaNum / 4)) { // 원사이즈의 4 나눈 열까지를 3으로 채우고 아래는 반대로 채웁니다
                                    leftUpArr[row][line] = 3 * chaNum * chaNum / 4;
                                    leftDownArr[row][line] = 0;
                              } else {
                                    leftUpArr[row][line] = 0;
                                    leftDownArr[row][line] = 3 * chaNum * chaNum / 4;
                              }

                        } else {
                              if (line < chaNum / 4) {
                                    leftUpArr[row][line] = 3 * chaNum * chaNum / 4;
                                    leftDownArr[row][line] = 0;
                              } else {
                                    leftUpArr[row][line] = 0;
                                    leftDownArr[row][line] = 3 * chaNum * chaNum / 4;
                              }
                        }
                  }
            }

            //오른쪽 위의 마방진, 오른쪽 아래의 마방진
            for (int row = 0; row < halfSizeNum; row++) {
                  for (int line = 0; line < halfSizeNum; line++) {
                        if (line >= halfSizeNum - (chaNum / 4 - 1)) {
                              rightUpArr[row][line] = (1 * chaNum * chaNum) / 4;
                              rightDownArr[row][line] = (2 * chaNum * chaNum) / 4;
                        } else {
                              rightUpArr[row][line] = (2 * chaNum * chaNum) / 4;
                              rightDownArr[row][line] = (1 * chaNum * chaNum) / 4;
                        }
                  }
            }

            //모든 int 2차원 배열을 해당 ArrayList안에 담습니다
            ArrayList<int[][]> intArrList = new ArrayList<>();
            intArrList.add(leftUpArr);
            intArrList.add(leftDownArr);
            intArrList.add(rightUpArr);
            intArrList.add(rightDownArr);

            //마방진의 값을 전부 합칩니다.
            for (int repeat = 0; repeat < 4; repeat++) { //4번 반복합니다
                  for (int row = 0; row < halfSizeNum; row++) {
                        for (int line = 0; line < halfSizeNum; line++) {
                              int quarterArrValue = intArrList.get(repeat)[row][line] + oddMsArr[row][line];
                              intArrList.get(repeat)[row][line] = quarterArrValue;
                        }
                  }

            }

            int leftUpRow = 0;
            int leftUpLine = 0;
            int leftDownRow = 0;
            int leftDownLine = 0;
            int rightUpRow = 0;
            int rightUpLine = 0;
            int rightDownRow = 0;
            int rightDownLine = 0;

            //4개의 마방진을 하나로 합칩니다
            for (int row = 0; row < chaNum; row++) {
                  for (int line = 0; line < chaNum; line++) {

                        if (row < chaNum / 2 && line < chaNum / 2) {
                              magicSquare[row][line] = intArrList.get(0)[leftUpRow][leftUpLine];

                              leftUpLine++;
                              if (leftUpLine >= chaNum / 2) {
                                    leftUpLine = 0;
                                    leftUpRow++;
                                    if (leftUpRow > chaNum / 2) {
                                          break;
                                    }
                              }

                        } else if (row < chaNum / 2 && line >= chaNum / 2) {
                              magicSquare[row][line] = intArrList.get(2)[rightUpRow][rightUpLine];
                              rightUpLine++;
                              if (rightUpLine >= chaNum / 2) {
                                    rightUpLine = 0;
                                    rightUpRow++;
                                    if (rightUpRow > chaNum / 2) {
                                          break;
                                    }
                              }

                        } else if (row >= chaNum / 2 && line < chaNum / 2) {

                              magicSquare[row][line] = intArrList.get(1)[leftDownRow][leftDownLine];
                              leftDownLine++;
                              if (leftDownLine >= chaNum / 2) {
                                    leftDownLine = 0;
                                    leftDownRow++;
                                    if (leftDownRow > chaNum / 2) {
                                          break;
                                    }
                              }

                        } else {

                              magicSquare[row][line] = intArrList.get(3)[rightDownRow][rightDownLine];
                              rightDownLine++;
                              if (rightDownLine >= chaNum / 2) {
                                    rightDownLine = 0;
                                    rightDownRow++;
                                    if (rightDownRow > chaNum / 2) {
                                          break;
                                    }
                              }

                        }
                  }
            }
            for (int[] ints : magicSquare) {

                  for (int anInt : ints) {
                        System.out.print(anInt + " ");
                  }
                  System.out.println();
            }


      }

      private static int[][] oddMagicSquare(int chaNum) {
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

                  if (magicSquare[row][line] == 0) {
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


            return magicSquare;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    