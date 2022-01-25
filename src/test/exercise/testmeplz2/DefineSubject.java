package test.exercise.testmeplz2;

import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


/**
 * packageName    : test.exercise.testmeplz
 * fileName       : Define
 * author         : letscombine
 * date           : 2022-01-21
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-01-21        letscombine       최초 생성
 */


public enum DefineSubject {
      KOREAN(1001), MATH(2001),;


      private static final Map<Integer, DefineSubject> OPERATOR_MAP =
              Collections.unmodifiableMap(Stream.of(values())
                                                  .collect(Collectors.toMap(DefineSubject::getRepresentation, Function.identity())));

      private final int representation;

      DefineSubject(final int representation) {
            this.representation = representation;

      }

      public static DefineSubject find(int representation) {
            if (OPERATOR_MAP.containsKey(representation)) {
                  return OPERATOR_MAP.get(representation);
            }
            throw new IllegalArgumentException("해당 값을 찾을 수 없습니다.");
      }

      public int getRepresentation() {
            return representation;
      }


}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    