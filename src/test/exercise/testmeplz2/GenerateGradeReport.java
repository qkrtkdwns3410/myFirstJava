package test.exercise.testmeplz2;

import test.exercise.testmeplz.Define;

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
            System.out.println("subjectList = " + subjectList);
            System.out.println("========================");
            for (Subject subject : subjectList) {
                  makeHeader(subject);
                  makeBody(subject);
                  makeFooter();
            }
            System.out.println("========================");
            return buffer.toString();
      }

      public void makeHeader(Subject subject) {
            buffer.append(GenerateGradeReport.LINE + "\t").append(subject.getSubjectName())
                    .append(GenerateGradeReport.TITLE).append(GenerateGradeReport.HEADER)
                    .append(GenerateGradeReport.LINE);
      }

      public void makeBody(Subject subject) {
            ArrayList<Student> studentList = subject.getStudentList();
            System.out.println("studentList = " + studentList);

            for (int i = 0; i < studentList.size(); i++) {
                  Student student = studentList.get(i);
                  System.out.println("student = " + student);
                  System.out.println("========================");
                  System.out.println("아 왜안됌???");
                  buffer.append(student.getStudentName()).append(" | ").append(student.getStudentID()).append(" | ")
                          .append(student.getMajorSubject().getSubjectName()).append("\t").append(" | ");

                  getScoreGrade(student, subject.getSubjectId());

                  buffer.append("\n");
                  buffer.append(LINE);
            }
      }

      private void getScoreGrade(Student student, int subjectId) {
            ArrayList<Score> scoreList = student.getScoreList();
            int majorId = student.getMajorSubject().getSubjectId();

            GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};

            for (int i = 0; i < scoreList.size(); i++) {
                  Score score = scoreList.get(i);

                  if (score.getSubject().getSubjectId() == subjectId) { // 학점 산출할 과목

                        String grade;

                        if (score.getSubject().getSubjectId() == majorId) {
                              grade = gradeEvaluations[Define.SAB_TYPE].getGrade(score.getPoint());
                        } else {
                              grade = gradeEvaluations[Define.AB_TYPE].getGrade(score.getPoint());
                        }

                        buffer.append(score.getPoint());
                        buffer.append(" : ");
                        buffer.append(grade);
                        buffer.append(" | ");
                  }
            }
      }

      public void makeFooter() {
            buffer.append("\n");
      }

}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    