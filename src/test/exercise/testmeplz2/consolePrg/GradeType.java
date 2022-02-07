package test.exercise.testmeplz2.consolePrg;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * packageName    : test.exercise.testmeplz2
 * fileName       : GradeType
 * author         : letscombine
 * date           : 2022-01-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-24        letscombine       최초 생성
 */


public enum GradeType {
      AB_TYPE(0), SAB_TYPE(1);

      private static final Map<Integer, GradeType> OPERATOR_MAP = Collections.unmodifiableMap(Stream.of(values())
                                                                                                      .collect(Collectors.toMap(GradeType::getRepresentation, Function.identity())));
      private final int representation;
      /*Function.identity > 값이 실제 요소여야 하는 경우 */
      /*.collect(Collectors.toMap(GradeType::getRepresentation,  맵으로 값을 모은다음 각각의 맵의 키와 값을 생산하는 두 함수 인자를 받습니다.*/
      /*해당 모아진 맵을 스트림으로 변환*/
      /*unmodifiableMap >> Map 이나 List의 변수의 내용을 `읽기만` 할때 */

      GradeType(final int representation) {
            this.representation = representation;
      }

      public static GradeType find(int representation) {
            if (OPERATOR_MAP.containsKey(representation)) {
                  return OPERATOR_MAP.get(representation);
            }
            throw new IllegalArgumentException("해당 값을 찾을 수 없습니다.");
      }

      public int getRepresentation() {
            return representation;
      }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    