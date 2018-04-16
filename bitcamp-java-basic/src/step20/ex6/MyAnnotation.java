// 애노테이션 유지 정책
// -> SOURCE : 소스파일에만 남긴다. 컴파일 후 제거된다.
// -> CLASS : .class파일에 남긴다. 그러나 실행시에 추출할 순 없다.
// -> RUMTIME : .class 파일에 남긴다.
package step20.ex6;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Target(ElementType.METHOD, ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	String v1() default"가나다"; 
}
