package test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;


/**
 * packageName    : test
 * fileName       : MiddleSchoolStudent
 * author         : letscombine
 * date           : 2022-01-12
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-12        letscombine       최초 생성
 */


public class MiddleSchoolStudent {
      private String studentName;
      private String elementarySchoolName;
      private String middleSchoolName;

      public String getStudentName() {
            return studentName;
      }

      public void setStudentName(String studentName) {
            this.studentName = studentName;
      }

      public String getElementarySchoolName() {
            return elementarySchoolName;
      }

      public void setElementarySchoolName(String elementarySchoolName) {
            this.elementarySchoolName = elementarySchoolName;
      }

      public String getMiddleSchoolName() {
            return middleSchoolName;
      }

      public void setMiddleSchoolName(String middleSchoolName) {
            this.middleSchoolName = middleSchoolName;
      }
}

class HighSchoolStudent extends MiddleSchoolStudent {
      private String highSchoolName;

      public HighSchoolStudent(MiddleSchoolStudent middleSchoolStudent, String highSchoolName) {
            this.highSchoolName = highSchoolName;

      }

      public void setMiddleSchoolInfo(MiddleSchoolStudent middleSchoolStudent) {
            this.setMiddleSchoolName(middleSchoolStudent.getMiddleSchoolName());
            this.setStudentName(middleSchoolStudent.getStudentName());
            this.setElementarySchoolName(middleSchoolStudent.getElementarySchoolName());
      }

      public String getHighSchoolName() {
            return highSchoolName;
      }

      public void setHighSchoolName(String highSchoolName) {
            this.highSchoolName = highSchoolName;
      }
}

class FunctionTest1 {
      public static void main(String[] args) {
            List<String> highSchoolList = new ArrayList<>();

            highSchoolList.add("1 고등학교");
            highSchoolList.add("2 고등학교");
            highSchoolList.add("3 고등학교");
            highSchoolList.add("4 고등학교");

            Function<MiddleSchoolStudent, HighSchoolStudent> middleSchoolStudentToRamdomHighSchoolStudent = (middleSchoolStudent) ->
                    new HighSchoolStudent(middleSchoolStudent, highSchoolList.get((int) (Math.random() * highSchoolList.size()))); // 0~4 미만의 정수중에 랜덤으로 배정됩니다. >> 0 1 2 3

            MiddleSchoolStudent middleSchoolStudent1 = new MiddleSchoolStudent();
            middleSchoolStudent1.setStudentName("박상준");
            middleSchoolStudent1.setElementarySchoolName("상준초");
            middleSchoolStudent1.setMiddleSchoolName("상준중");

            MiddleSchoolStudent middleSchoolStudent2 = new MiddleSchoolStudent();
            middleSchoolStudent2.setStudentName("김상준");
            middleSchoolStudent2.setElementarySchoolName("준상초");
            middleSchoolStudent2.setMiddleSchoolName("준상중");

            MiddleSchoolStudent middleSchoolStudent3 = new MiddleSchoolStudent();
            middleSchoolStudent3.setStudentName("이상준");
            middleSchoolStudent3.setElementarySchoolName("준상상초");
            middleSchoolStudent3.setMiddleSchoolName("준상상중");


      }
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    