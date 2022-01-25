package test.exercise.testmeplz2;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : School
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class School {
      private static School instance = new School();

      private static String SCHOOL_NAME = "combine School";

      private ArrayList<Student> studentList = new ArrayList<>();
      private ArrayList<Subject> subjectList = new ArrayList<>();

      public static School getInstance() {
            if (instance == null) {
                  instance = new School();

            }

            return instance;
      }

      public static String getSchoolName() {
            return SCHOOL_NAME;
      }

      public static void setSchoolName(String schoolName) {
            SCHOOL_NAME = schoolName;
      }

      public ArrayList<Student> getStudentList() {
            return studentList;
      }

      public void setStudentList(ArrayList<Student> studentList) {
            this.studentList = studentList;
      }

      public ArrayList<Subject> getSubjectList() {
            return subjectList;
      }

      public void setSubjectList(ArrayList<Subject> subjectList) {
            this.subjectList = subjectList;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    