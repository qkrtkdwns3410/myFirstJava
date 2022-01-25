package test.exercise.testmeplz2;

/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : BasicEvaluation
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class BasicEvaluation implements GradeEvaluation {
      @Override
      public String getGrade(int point) {
            String grade;

            if (point >= 95 && point <= 100) {
                  grade = "S";
            } else if (point >= 90) {
                  grade = "A";
            } else if (point >= 80) {
                  grade = "B";
            } else if (point >= 70) {
                  grade = "C";
            } else if (point >= 60) {
                  grade = "D";
            } else {
                  grade = "F";
            }
            return grade;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    