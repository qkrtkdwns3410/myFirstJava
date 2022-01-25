package test.collection;

import java.util.Objects;


/**
 * packageName    : test.collection
 * fileName       : Student
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class Student {
      private String studentId;
      private String studentName;

      public Student(String studentId, String studentName) {
            this.studentId = studentId;
            this.studentName = studentName;
      }

      public String getStudentId() {
            return studentId;
      }

      public void setStudentId(String studentId) {
            this.studentId = studentId;
      }

      public String getStudentName() {
            return studentName;
      }

      public void setStudentName(String studentName) {
            this.studentName = studentName;
      }

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Student{");
            sb.append("studentId='")
                    .append(studentId)
                    .append('\'');
            sb.append(", studentName='")
                    .append(studentName)
                    .append('\'');
            sb.append('}');
            return sb.toString();
      }

      @Override
      public boolean equals(Object obj) {
            if (obj instanceof Student) {
                  Student student = (Student) obj;
                  if (Objects.equals(this.studentId, student.studentId)) {
                        return true;
                  }

            }
            return false;
      }

      @Override
      public int hashCode() {
            return Integer.parseInt(studentId);
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    