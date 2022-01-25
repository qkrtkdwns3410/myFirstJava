package test.exercise;

/**
 * packageName    : test.exercise
 * fileName       : IDFormatTest
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public class IDFormatTest {
      private String userID;
      private String userPw;

      public String getUserPw() {
            return userPw;
      }

      public void setUserPw(String userPw) throws IDFormatException {
            if (userPw == null) {
                  throw new IDFormatException("비밀번호가 null 불가합니다");
            } else if (userPw.matches("[a-zA-Z]+")) {
                  throw new IDFormatException("문자열로만 이루어짐");
            } else if (userPw.length() < 5) {
                  throw new IDFormatException("5자 미만임");
            }
            this.userPw = userPw;
      }

      public static void main(String[] args) {
            IDFormatTest test = new IDFormatTest();

            String userID = null;
            String userPw = null;
            try {
                  test.setUserID(userID);

            } catch (IDFormatException e) {
                  System.out.println(e.getMessage());
            }
            try {
                  test.setUserPw(userPw);

            } catch (IDFormatException e) {
                  System.out.println(e.getMessage());
            }

            userID = "1234567";
            userPw = "Tk";
            try {
                  test.setUserID(userID);
            } catch (IDFormatException e) {
                  System.out.println(e.getMessage());
            }

            try {
                  test.setUserPw(userPw);
            } catch (IDFormatException e) {
                  System.out.println(e.getMessage());
            }
      }

      public String getUserID() {
            return userID;
      }

      public void setUserID(String userID) throws IDFormatException {
            if (userID == null) {
                  throw new IDFormatException("아이디를 null일 수 없습니다");
            } else if (userID.length() < 8 || userID.length() > 20) {
                  throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰시오");
            }
            this.userID = userID;


      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    