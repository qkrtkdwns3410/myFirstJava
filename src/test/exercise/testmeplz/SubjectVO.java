package test.exercise.testmeplz;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Subject
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class SubjectVO {
      private String subjectName;
      private int subjectID;
      private int gradeType;

      private ArrayList<StudentVO> studentList = new ArrayList<>();

      public SubjectVO(String subjectName, int subjectID) {
            this.subjectName = subjectName;
            this.subjectID = subjectID;
      }

      public String getSubjectName() {
            return subjectName;
      }

      public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
      }

      public int getSubjectID() {
            return subjectID;
      }

      public void setSubjectID(int subjectID) {
            this.subjectID = subjectID;
      }

      public int getGradeType() {
            return gradeType;
      }

      public void setGradeType(int gradeType) {
            this.gradeType = gradeType;
      }

      public ArrayList<StudentVO> getStudentList() {
            return studentList;
      }


      public void setStudentList(ArrayList<StudentVO> studentList) {
            this.studentList = studentList;
      }

      public void register(StudentVO student) {
            studentList.add(student);
      } // 수강 신청 메서드


      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Subject{");
            sb.append("subjectName='")
                    .append(subjectName)
                    .append('\'');
            sb.append(", subjectID=")
                    .append(subjectID);
            sb.append(", gradeType=")
                    .append(gradeType);
            sb.append(", studentList=")
                    .append(studentList);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    