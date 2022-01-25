package test.exercise.testmeplz2;

import java.util.ArrayList;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : GenerateGradeReport
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class GenerateGradeReport {
      public static final String TITLE = " 수강생 학점 \t\t\n";
      public static final String HEADER = "이름 | 학번 |필수과목| 점수 \n";
      public static final String LINE = "--------------------------------------\n";
      School school = School.getInstance();
      private StringBuffer buffer = new StringBuffer();

      public String getReport() {
            ArrayList<Subject> subjectList = school.getSubjectList();

            for (Subject subject : subjectList) {

            }
      }

      public void makeHeader(Subject subject) {
            buffer.append(GenerateGradeReport.LINE + "\t").append(subject.getSubjectName())
                    .append(GenerateGradeReport.TITLE).append(GenerateGradeReport.HEADER)
                    .append(GenerateGradeReport.LINE);
      }

      public void makeBody(Subject subject) {
            ArrayList<Student> studentList = new ArrayList<>();

            for (int i = 0; i < studentList.size(); i++) {
                  Student student = studentList.get(i);
                  buffer.append(student.getStudentName()).append(" | ").append(student.getStudentID()).append(" | ")
                          .append(student.getMajorSubject().getSubjectName()).append("\t").append(" | ");

                  getScoreGrade(student, subject.getSubjectId());

                  buffer.append("\n");
                  buffer.append(LINE);
            }
      }

      private void getScoreGrade(Student student, int subjectId) {
            ArrayList<Score> scoreList = student.getScoreList();
            int majorId=  student.getMajorSubject()
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    