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
      public static final String TITLE = " 과목 수강생 학점 \t\t\n";
      public static final String TITLE_FOR_STUDENT = "' 학생 학점표\t\t\n";
      public static final String HEADER = "이름 | 학번 | 점수(등급) \n";
      public static final String HEADER_FOR_STUDENT = "과목명 | 과목번호 | 점수(등급) \n";
      public static final String LINE = "--------------------------------------\n";

      private ScoreManagementApplication school = ScoreManagementApplication.getInstance();

      private final StringBuffer buffer = new StringBuffer();

      public String getReport() {

            ArrayList<SubjectVO> subjectList = school.getSubjectList();

            if (subjectList.size() == 0) {
                  System.out.println("리스트에 자료가 없습니다");
                  return "";
            }

            for (SubjectVO subject : subjectList) {
                  makeHeader(subject);
                  makeBody(subject);
                  makeFooter();
            }
            return buffer.toString();
      }

      public void makeHeader(SubjectVO subject) {
            buffer.append(GenerateGradeReport.LINE + "\t").append(subject.getSubjectName())
                    .append(GenerateGradeReport.TITLE).append(GenerateGradeReport.HEADER)
                    .append(GenerateGradeReport.LINE);
      }

      public void makeBody(SubjectVO subject) {
            ArrayList<StudentVO> studentList = subject.getStudentList();

            for (int i = 0; i < studentList.size(); i++) {
                  StudentVO student = studentList.get(i);

                  System.out.println("========================");

                  buffer.append(student.getStudentName()).append(" | ").append(student.getStudentID()).append(" | ");

                  getScoreGrade(student, subject.getSubjectId());

                  buffer.append("\n");
                  buffer.append(LINE);
            }
      }

      private void getScoreGrade(StudentVO student, int subjectId) {
            ArrayList<ScoreVO> scoreList = student.getScoreList();
            int majorId = student.getMajorSubject().getSubjectId();

            GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation()};

            for (ScoreVO score : scoreList) {
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
            ArrayList<StudentVO> studentList = school.getStudentList();

            if (studentList.size() == 0) {
                  System.out.println("리스트에 자료가 없습니다");
                  return "";
            }

            for (StudentVO student : studentList) {
                  makeHeaderForStudent(student);
                  makeBodyForStudent(student);
                  makeFooter();
            }
            return buffer.toString();

      }

      private void makeHeaderForStudent(StudentVO student) {
            buffer.append(GenerateGradeReport.LINE + "\t").append(student.getStudentName())
                    .append(GenerateGradeReport.TITLE_FOR_STUDENT).append(GenerateGradeReport.HEADER_FOR_STUDENT)
                    .append(GenerateGradeReport.LINE);
      }

      private void makeBodyForStudent(StudentVO student) {
            ArrayList<ScoreVO> scoreList = student.getScoreList();

            for (int index = 0; index < scoreList.size(); index++) {
                  ScoreVO score = scoreList.get(index);

                  System.out.println("======================================================");

                  buffer.append(score.getSubject().getSubjectName()).append(" | ")
                          .append(score.getSubject().getSubjectId()).append(" | ");

                  getScoreGrade(student, score.getSubject().getSubjectId());

                  buffer.append("\n");
                  buffer.append(LINE);
            }
      }



}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    