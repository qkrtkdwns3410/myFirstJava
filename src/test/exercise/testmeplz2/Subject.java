package test.exercise.testmeplz2;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : Subject
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class Subject {
      private String subjectName; //과목이름
      private int subjectId; //과목의 고유 번호
      private GradeType gradeType; //학점 등급 산출

      ArrayList<Student> studentList = new ArrayList<>();

      public Subject(String subjectName, int subjectId, GradeType gradeType) {
            this.subjectName = subjectName;
            this.subjectId = subjectId;
            this.gradeType = GradeType.AB_TYPE;
      }

      public String getSubjectName() {
            return subjectName;
      }

      public void setSubjectName(String subjectName) {
            this.subjectName = subjectName;
      }

      public int getSubjectId() {
            return subjectId;
      }

      public void setSubjectId(int subjectId) {
            this.subjectId = subjectId;
      }

      public GradeType getGradeType() {
            return gradeType;
      }

      public void setGradeType(GradeType gradeType) {
            this.gradeType = gradeType;
      }

      public ArrayList<Student> getStudentList() {
            return studentList;
      }

      public void setStudentList(ArrayList<Student> studentList) {
            this.studentList = studentList;
      }

      public void register(Student student) {
            studentList.add(student);

      }

      public void removeOneStudent(int index) {
            studentList.remove(index);
            System.out.println("지웟음 ..");
      }

      @Override
      public String toString() {
            return "Subject{" + "subjectName='" + subjectName + '\'' + ", subjectId=" + subjectId + ", gradeType=" + gradeType + '}';
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    