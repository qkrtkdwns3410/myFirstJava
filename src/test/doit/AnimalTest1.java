package test.doit;

import java.util.ArrayList;


/**
 * packageName    : test.doit
 * fileName       : AnimalTesst1
 * author         : letscombine
 * date           : 2022-01-18
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-18        letscombine       최초 생성
 */


public class AnimalTest1 {

      ArrayList<Animal> aniList = new ArrayList<>();


      public static void main(String[] args) {
            AnimalTest1 aTest = new AnimalTest1();
            aTest.addAnimal();
            System.out.println("원래 형으로 다운 캐스팅");
            aTest.testCasting();
      }

      private void testCasting() {
            for (int i = 0; i < aniList.size(); i++) {
                  Animal ani = aniList.get(i);
                  if (ani instanceof Human) {
                        Human h = (Human) ani;
                        h.readBook();
                  } else if (ani instanceof Tiger) {
                        Tiger t = (Tiger) ani;
                        t.hunting();

                  } else if (ani instanceof Eagle) {
                        Eagle e = (Eagle) ani;
                        e.flying();
                  } else {
                        System.out.println("지워되지 않는 형입니다.");
                  }
            }
      }

      public void addAnimal() {
            System.out.println("AnimalTest1.addAnimal");

            //ArrayList에 추가되면서 Animal 형으로 형 변환
            aniList.add(new Human());
            aniList.add(new Eagle());
            aniList.add(new Tiger());

            for (Animal animal : aniList) { //배열 요소를 Animal형으로 꺼내서 move() 호출시 가상 메서드!! 실행 > 재정의된 함수가 호출됩니다.
                  animal.move();
            }
      }

      public void moveAnimal(Animal animal) {
            animal.move();

      }
}

class Animal {
      public void move() {
            System.out.println("동물이 움직입니다");

      }
}

class Human extends Animal {
      @Override
      public void move() {
            System.out.println("사람이 두 발로 걷습니다");

      }

      public void readBook() {
            System.out.println("사람이 책을 읽습니다");
      }
}

class Tiger extends Animal {
      @Override
      public void move() {
            System.out.println("호랑이가 네 발로 뜁니다");
      }

      public void hunting() {
            System.out.println("호랑이가 사냥을 합니다");
      }

}

class Eagle extends Animal {
      @Override
      public void move() {
            System.out.println("독수리가 하늘을 납니다");

      }

      public void flying() {
            System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다");

      }
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    