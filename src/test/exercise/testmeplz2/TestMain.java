package test.exercise.testmeplz2;

import static test.exercise.testmeplz2.Util.sc;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : TestMain
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public class TestMain {
      School school = School.getInstance();
      GenerateGradeReport report = new GenerateGradeReport();

      Subject korean;
      Subject math;

      public static void main(String[] args) {
            TestMain test = new TestMain();
            String report = test.report.getReport();
            System.out.println("report = " + report);
            School.getInstance().mainLogic();
      }

      public void createSubject() {
            korean = new Subject("국어", korean.getSubjectId(), GradeType.AB_TYPE);
            math = new Subject("수학", math.getSubjectId(), GradeType.AB_TYPE);

            School.getInstance().addSubject(korean);
            School.getInstance().addSubject(math);
      }

      public void createStudent() {
            Student std1 = new Student("안성원", korean);
            Student std2 = new Student("김성원", math);
            Student std3 = new Student("박성원", korean);
            Student std4 = new Student("윤성원", math);
            Student std5 = new Student("빅성원", korean);

            School.getInstance().addStudent(std1);
            School.getInstance().addStudent(std2);
            School.getInstance().addStudent(std3);
            School.getInstance().addStudent(std4);
            School.getInstance().addStudent(std5);

            korean.register(std1);
            korean.register(std2);
            korean.register(std3);
            korean.register(std4);
            korean.register(std5);

            math.register(std1);
            math.register(std2);
            math.register(std3);
            math.register(std4);
            math.register(std5);

            School.getInstance().addScoreForStudent(std1, korean, 95);
            School.getInstance().addScoreForStudent(std1, math, 65);
            School.getInstance().addScoreForStudent(std2, korean, 95);
            School.getInstance().addScoreForStudent(std2, math, 70);
            School.getInstance().addScoreForStudent(std3, korean, 95);

            School.getInstance().addScoreForStudent(std3, math, 95);
            School.getInstance().addScoreForStudent(std4, korean, 95);
            School.getInstance().addScoreForStudent(std4, math, 95);
            School.getInstance().addScoreForStudent(std5, korean, 95);
            School.getInstance().addScoreForStudent(std5, math, 95);






      }

}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    