package test.collection;

/**
 * packageName    : test.collection
 * fileName       : Member
 * author         : letscombine
 * date           : 2022-01-19
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-19        letscombine       최초 생성
 */


public class Member implements Comparable<Member> {
      private int memberId; //회원 아이디
      private String memberName;

      public Member(int memberId, String memberName) {
            this.memberId = memberId;
            this.memberName = memberName;
      }

      public int getMemberId() {
            return memberId;
      }

      public void setMemberId(int memberId) {
            this.memberId = memberId;
      }

      public String getMemberName() {
            return memberName;
      }

      public void setMemberName(String memberName) {
            this.memberName = memberName;
      }

      @Override
      public int hashCode() {
            return memberId; //hashCode() 메서드가 회원 아이디를 반환하도록 재정의
      }

      @Override
      public boolean equals(Object o) {
            if (o instanceof Member) {
                  Member member = (Member) o;
                  // 매개변수로 받은 회원 아이디가 자신의 회원 아이디와 같다면 true 반환
                  return this.memberId == member.memberId;

            }
            return false;
      }

      @Override
      public String toString() {
            final StringBuilder sb = new StringBuilder("Member{");
            sb.append("memberId=")
                    .append(memberId);
            sb.append(", memberName='")
                    .append(memberName)
                    .append('\'');
            sb.append('}');
            return sb.toString();
      }

      @Override
      public int compareTo(Member member) {
            return (this.memberName.compareTo(member.memberName));
      }
      //Id 가 양수라면  오름차순 정렬
      //음수라면 내림차순
      // 내림차순.. (this.memberId - member.memberId) *(-1)
}


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    