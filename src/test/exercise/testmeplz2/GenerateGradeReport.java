package test.exercise.testmeplz2;

import javafx.scene.shape.StrokeLineCap;
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
      public static final String TITLE = " 과목 수강생 학점 \t\t\n";
      public static final String TITLE_FOR_STUDENT = "' 학생 학점표\t\t\n";
      public static final String HEADER = "이름 | 학번 | 점수(등급) \n";
      public static final String HEADER_FOR_STUDENT = "과목명 | 과목번호 | 점수(등급) \n";
      public static final String LINE = "--------------------------------------\n";

      private School school = School.getInstance();

      private final StringBuffer buffer = new StringBuffer();

      public String getReport() {

            ArrayList<Subject> subjectList = school.getSubjectList();

            if (subjectList.size() == 0) {
                  System.out.println("리스트에 자료가 없습니다");
                  return "";
            }

            for (Subject subject : subjectList) {
                  makeHeader(subject);
                  makeBody(subject);
                  makeFooter();
            }
            return buffer.toString();
      }

      public void makeHeader(Subject subject) {
            buffer.append(GenerateGradeReport.LINE + "\t").append(subject.getSubjectName())
                    .append(GenerateGradeReport.TITLE).append(GenerateGradeReport.HEADER)
                    .append(GenerateGradeReport.LINE);
      }

      public void makeBody(Subject subject) {
            ArrayList<Student> studentList = subject.getStudentList();

            for (int i = 0; i < studentList.size(); i++) {
                  Student student = studentList.get(i);

                  System.out.println("========================");

                  buffer.append(student.getStudentName()).append(" | ").append(student.getStudentID()).append(" | ");

                  getScoreGrade(student, subject.getSubjectId());

                  buffer.append("\n");
                  buffer.append(LINE);
            }
      }

      private void getScoreGrade(Student student, int subjectId) {
            ArrayList<Score> scoreList = student.getScoreList();
            int majorId = student.getMajorSubject().getSubjectId();

            GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};

            for (Score score : scoreList) {
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

      public String getReportGroupbyStudent() {
            ArrayList<Student> studentList = school.getStudentList();

            if (studentList.size() == 0) {
                  System.out.println("리스트에 자료가 없습니다");
                  return "";
            }

            for (Student student : studentList) {
                  makeHeaderForStudent(student);
                  makeBodyForStudent(student);
                  makeFooter();
            }
            return buffer.toString();

      }

      private void makeHeaderForStudent(Student student) {
            buffer.append(GenerateGradeReport.LINE + "\t").append(student.getStudentName())
                    .append(GenerateGradeReport.TITLE_FOR_STUDENT).append(GenerateGradeReport.HEADER_FOR_STUDENT)
                    .append(GenerateGradeReport.LINE);
      }

      private void makeBodyForStudent(Student student) {
            ArrayList<Score> scoreList = student.getScoreList();

            for (int index = 0; index < scoreList.size(); index++) {
                  Score score = scoreList.get(index);

                  System.out.println("======================================================");

                  buffer.append(score.getSubject().getSubjectName()).append(" | ")
                          .append(score.getSubject().getSubjectId()).append(" | ");

                  getScoreGrade(student, score.getSubject().getSubjectId());

                  buffer.append("\n");
                  buffer.append(LINE);
            }
      }



}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    