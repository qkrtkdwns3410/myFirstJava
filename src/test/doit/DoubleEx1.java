package test.doit;

import javax.imageio.stream.MemoryCacheImageOutputStream;
import javax.naming.BinaryRefAddr;
import javax.security.auth.Subject;
import javax.swing.text.DateFormatter;
import javax.swing.text.Style;
import java.lang.annotation.ElementType;
import java.lang.management.GarbageCollectorMXBean;
import java.net.SocketOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


/**
 * packageName    : test.doit
 * fileName       : DoubleEx1
 * author         : letscombine
 * date           : 2022-01-13
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-13        letscombine       최초 생성
 */


public class DoubleEx1 {
      public static void main(String[] args) {
            double dnum = 3.14;
            float fnum = 3.14F; //

            System.out.println("dnum = " + dnum);
            System.out.println("fnum = " + fnum);
      }
}

class DoubleEx2 {
      public static void main(String[] args) {
            double dnum = 1;

            for (int i = 0; i < 10000; i++) {
                  dnum += 0.1;

            }
            System.out.println("dnum = " + dnum);
      }
}

class BooleanEx {
      public static void main(String[] args) {
            boolean isMarried = true; //변수 선언 + 초기화
            System.out.println("isMarried = " + isMarried);
      }
}



class Constant {
      public static void main(String[] args) {
            final int MAX_NUM = 100; //선언과 동시 초기화
            final int MIN_NUM;

//            MAX_NUM = 0; //사용하기전에 초기화 > 초기화하지 않기에 에러가 발생합니다

//            System.out.println("MIN_NUM = " + MIN_NUM);
            System.out.println("MAX_NUM = " + MAX_NUM);

            //MAX_NUM =1000; << 에러 상수는 값의 변경이 불가능합니다
      }

}

class ImplicitConversion {
      public static void main(String[] args) {
            byte bNum = 10;
            int iNum = bNum; //정수형중 1바이트의 자료형보다 4바이트의 int 형이 더 넓은 범위이기에 자동 형변환

            System.out.println("iNum = " + iNum);
            System.out.println("bNum = " + bNum);
            System.out.println("========================");

            int iNum2 = 20;
            float fNum = iNum2; //

            System.out.println("iNum2 = " + iNum2);
            System.out.println("fNum = " + fNum);
            System.out.println("========================");

            double dNum;
            dNum = fNum + iNum;
            System.out.println("dNum = " + dNum);
            System.out.println("========================");
      }
}

class ExplicitConversion {
      public static void main(String[] args) {
            double dNum = 1.2;
            float fNum2 = 0.9f;

            int iNum3 = (int) (dNum + fNum2);
            System.out.println("iNum3 = " + iNum3);
      }
}

class OperationEx {
      public static void main(String[] args) {
            int num1 = 10;
            int num2 = 20;

            System.out.println("num1 = " + +num1);
            System.out.println("num2 = " + -num2);
            System.out.println("num2 = " + num2);

            num2 = -num2;
            System.out.println("num2 = " + num2);
      }
}

class OperationEx3 {
      public static void main(String[] args) {
            int num1 = 10;
            int i = 2;

            boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
            System.out.println("value = " + value);
            System.out.println("num1 = " + num1);
            System.out.println("i = " + i);
            System.out.println("========================");

            value = ((num1 = num1 + 10) > 10) || ((i = i + 2) < 10);
            System.out.println("value = " + value);
            System.out.println("i = " + i);
            System.out.println("num1 = " + num1);
            System.out.println("========================");
      }
}

class OperationEx4 {
      public static void main(String[] args) {
            int fatherAge = 45;
            int motherAge = 47;

            char ch;
            ch = (fatherAge > motherAge) ? 'T' : 'F';

            System.out.println("ch = " + ch);
      }
}

class AAA {
      public static void main(String[] args) {
            int num = 8;

            System.out.println("num = " + (num += 10));
            System.out.println("num = " + (num -= 8));
            System.out.println("num = " + (num >>= 2));
      }
}

class GradeSorting {
      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            char grade = ' ';
            int score = Integer.parseInt(sc.nextLine());

            if (score >= 90) {
                  grade = 'A';
            } else if (score >= 80) {
                  grade = 'B';
            } else if (score >= 70) {
                  grade = 'C';
            } else if (score >= 60) {
                  grade = 'D';
            } else {
                  grade = 'F';
            }
            System.out.println("grade = " + grade);

      }
}

class NestedLoop {
      public static void main(String[] args) {
            int dan;
            int times;

            for (dan = 2; dan < 10; dan++) {
                  System.out.println(dan + "단");
                  for (times = 1; times < 10; times++) {
                        System.out.println(dan + " * " + times + " = " + (dan * times));
                  }
                  System.out.println("========================");
            }
      }
}

class TestMe {
      public static void main(String[] args) {
            int num1 = 10;
            int num2 = 2;
            char operator = '-';

            switch (operator) {
                  case 43:
                        System.out.println("num1 + num2 = " + (num1 + num2));
                        break;
                  case 45:
                        System.out.println("num - num2 = " + (num1 - num2));
                        break;
                  case 42:
                        System.out.println("num * num2 = " + (num1 * num2));
                        break;
                  case 47:
                        System.out.println("num / num2 =" + (num1 / num2));
                        break;
                  default:
                        System.out.println("올바른 형태가 아닙니다");
                        break;
            }

            if (operator == 43) {
                  System.out.println("num1 + num2 = " + (num1 + num2));
            } else if (operator == 45) {
                  System.out.println("num - num2 = " + (num1 - num2));
            } else if (operator == 42) {
                  System.out.println("num * num2 = " + (num1 * num2));
            } else if (operator == 47) {
                  System.out.println("num / num2 =" + (num1 / num2));
            } else {
                  System.out.println("올바른 형태가 아닙니다");
            }

            System.out.println("========================");

            for (int i = 2; i < 10; i++) {

                  System.out.println("========================");
                  System.out.printf("%d단\n\n", i);
                  for (int j = 1; j < 10; j++) {
                        if (i < j) {
                              break;
                        }
                        System.out.printf("%d * %d = %d\n", i, j, i * j);
                  }
            }
            System.out.println("========================");

            int count = 1;
            int j = 0;
            for (int i = 0; i < 4; i++) {
                  for (j = 0; j < count; j++) {
                        System.out.print("*");
                  }
                  count += 2;
                  System.out.println();
            }
            for (int i = 0; i < 3; i++) {
                  for (j = count - 4; j > 0; j--) {
                        System.out.print("*");
                  }
                  count -= 2;
                  System.out.println();
            }


            System.out.println("========================");


      }
}

class Student {
      int studentID;
      int grade;
      String address;
      private String studentName;

      public static void main(String[] args) {
            Student studentPark = new Student();
            studentPark.setStudentName("박상준");

            System.out.println("studentPark = " + studentPark.getStudentName());
            System.out.println("========================");

      }

      public String getStudentName() {
            return studentName;
      }

      public void setStudentName(String studentName) {
            this.studentName = studentName;
      }

      @Override
      public boolean equals(Object obj) {
            if (obj instanceof Student) {
                  Student std = (Student) obj;
                  if (this.studentID == std.studentID) {
                        return true;
                  } //학번의 번호가 같다면! true 반환합니다
            }
            return false;

      }
}

class StudentTest1 {
      public static void main(String[] args) {
            Student student1 = new Student();
//            student1.studentName = "박상준"; //private으로 이름을 설정시 에러가 발생합니다
            System.out.println(student1.getStudentName());
            System.out.println("========================");
            Student student2 = new Student();
//            student2.studentName = "김상준";
            System.out.println(student2.getStudentName());
            System.out.println("========================");
      }
}

class StudentTest2 {
      public static void main(String[] args) {
            Student student1 = new Student();
//            student1.studentName = "박상준";

            Student student2 = new Student();
//            student2.studentName = "김상준";

            System.out.println("student1 = " + student1); //참조변수의 값이 출력됩니다! > 클래스이름@주소값(해시코드값)
            System.out.println("student2 = " + student2);
            System.out.println("========================");
      }
}

class Person {
      int age;
      String name;
      boolean isMarried;
      int kidCount;

      public Person() {

            this(29, "이름없음"); //this로 Person(String , int) 생성자의 호출
      } // 디폴트 생성자

      public Person(int age, String name) {
            this.age = age;
            this.name = name;
      } //매개변수 2

      public Person(int age, String name, boolean isMarried, int kidCount) {
            this.age = age;
            this.name = name;
            this.isMarried = isMarried;
            this.kidCount = kidCount;
      }

      @Override
      public String toString() {
            return "Person{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    ", isMarried=" + isMarried +
                    ", kidCount=" + kidCount +
                    '}';
      }
}

class TestMe1 {
      public static void main(String[] args) {
            Person person1 = new Person(27, "James", true, 2);
            System.out.println("person1 = " + person1);
      }

}

class Order {
      long orderNum;
      String id;
      String orderDate;
      String ordererName;
      String orderItemNum;
      String orderLocation;

      public long getOrderNum() {
            return orderNum;
      }

      public void setOrderNum(long orderNum) {
            this.orderNum = orderNum;
      }

      public String getId() {
            return id;
      }

      public void setId(String id) {
            this.id = id;
      }


      public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
      }

      public String getOrdererName() {
            return ordererName;
      }

      public void setOrdererName(String ordererName) {
            this.ordererName = ordererName;
      }

      public String getOrderItemNum() {
            return orderItemNum;
      }

      public void setOrderItemNum(String orderItemNum) {
            this.orderItemNum = orderItemNum;
      }

      public String getOrderLocation() {
            return orderLocation;
      }

      public void setOrderLocation(String orderLocation) {
            this.orderLocation = orderLocation;
      }

      @Override
      public String toString() {
            return "Order{" +
                    "orderNum=" + orderNum +
                    ", id='" + id + '\'' +
                    ", orderDate='" + orderDate + '\'' +
                    ", ordererName='" + ordererName + '\'' +
                    ", orderItemNum='" + orderItemNum + '\'' +
                    ", orderLocation='" + orderLocation + '\'' +
                    '}';
      }
}

class ShoppingMall {
      public static void main(String[] args) {
            Order order = new Order();
            order.setOrderDate("2018년 3월 12일"); //그냥 String 으로 했습니다.
            order.setId("abd123");

            //중략
            System.out.println("order = " + order);
            System.out.println("========================");
      }
}

class Student1 {
      int studentID;
      String studentName;
      int koreaScore;
      int mathScore;

      Subject koreaSubject;
      Subject mathSubject;

}

class MyDate {
      private int day;
      private int month;
      private int year;

      public MyDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
      }

      public int getMonth() {
            return month;
      }

      public void setMonth(int month) {
            this.month = month;
      }

      public int getYear() {
            return year;
      }

      public void setYear(int year) {
            this.year = year;
      }

      public int getDay() {
            return day;
      }

      public void setDay(int day) {

      }

      public boolean isValid() {
            boolean isOk = true;
            if (month == 2) {
                  if (day < 1 || day > 28) {
                        System.out.println("유효하지 않은 날짜입니다.");
                        isOk = false;
                  }
            } else if (month > 12 || month < 1) {
                  System.out.println("유효하지 않은 날짜입니다.");

            }
            return isOk;

      }

      @Override
      public boolean equals(Object obj) {
            if (obj instanceof MyDate) {
                  MyDate date = (MyDate) obj;
                  return this.month == date.month && this.year == date.year && this.day == date.day;
            }

            return false;
      }
}


class MyDateTest {
      public static void main(String[] args) {
            MyDate date = new MyDate(18, 9, 2004);
            System.out.println(date.isValid());

            MyDate date1 = new MyDate(18, 9, 2004);

            System.out.println(date1.equals(date));

            //해당 클래스의 멤버 변수에 직접적으로 접근이 가능해져버립니다!! > 2월은 31일이 존재할 수 없음!
      }
}

class BirthDay {
      int day;
      int month;
      int year;

      public void setYear(int year) {
            this.year = year;
      }

      public void printThis() {
            System.out.println(this);
      }
}

class ThisExample {
      public static void main(String[] args) {
            BirthDay bDay = new BirthDay();
            bDay.setYear(2000);
            System.out.println("bDay = " + bDay);

            bDay.printThis();
            System.out.println("========================");
      }
}





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    