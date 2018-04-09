// 애노테이션 유지 정책
// -> SOURCE : 소스파일에만 남긴다. 컴파일 후 제거된다.
// -> CLASS : .class파일에 남긴다. 그러나 실행시에 추출할 순 없다.
// -> RUMTIME : .class 파일에 남긴다.
package step20.ex3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
	String value() default "홍길동"; 
	// default값이 있으면 에노테이션을 사용할 때 값을 지정하지 않아도 된다.
}
