package test.exercise.testmeplz2;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;
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
      AB_TYPE(0),
      SAB_TYPE(1);



      private static final Map<Integer, GradeType> OPERATOR_MAP =
              Collections.unmodifiableMap(Stream.of(values())
                                                  .collect(Collectors.toMap(GradeType::getRepresentation, Function.identity())));

      private final int representation;

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

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    