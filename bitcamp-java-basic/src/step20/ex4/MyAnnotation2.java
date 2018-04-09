// 애노테이션 유지 정책
// -> SOURCE : 소스파일에만 남긴다. 컴파일 후 제거된다.
// -> CLASS : .class파일에 남긴다. 그러나 실행시에 추출할 순 없다.
// -> RUMTIME : .class 파일에 남긴다.
package step20.ex4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
	String tel(); 
}
