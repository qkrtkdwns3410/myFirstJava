package test.exercise;

/**
 * packageName    : test.exercise
 * fileName       : TravelCustomer
 * author         : letscombine
 * date           : 2022-01-20
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-20        letscombine       최초 생성
 */


public class TravelCustomer {
      private String name;
      private int age;
      private int price;

      public TravelCustomer(String name, int age, int price) {
            this.name = name;
            this.age = age;
            this.price = price;
      }

      public String getName() {
            return name;
      }

      public int getAge() {
            return age;
      }

      public int getPrice() {
            return price;
      }

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("TravelCustomer{");
            sb.append("name='")
                    .append(name)
                    .append('\'');
            sb.append(", age=")
                    .append(age);
            sb.append(", price=")
                    .append(price);
            sb.append('}');
            return sb.toString();
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    