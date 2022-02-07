package test.exercise.testmeplz2.consolePrg;

import java.math.BigDecimal;


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
      public String getGrade(BigDecimal point) {
            String grade;
            float pointFloat = point.floatValue();

            if (pointFloat >= 95 && pointFloat <= 100) {
                  grade = "S";
            } else if (pointFloat >= 90) {
                  grade = "A";
            } else if (pointFloat >= 80) {
                  grade = "B";
            } else if (pointFloat >= 70) {
                  grade = "C";
            } else if (pointFloat >= 60) {
                  grade = "D";
            } else {
                  grade = "F";
            }
            return grade;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    