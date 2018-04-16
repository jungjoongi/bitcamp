// 애노테이션 유지 정책
// -> SOURCE : 소스파일에만 남긴다. 컴파일 후 제거된다.
// -> CLASS : .class파일에 남긴다. 그러나 실행시에 추출할 순 없다.
// -> RUMTIME : .class 파일에 남긴다.
package step20.ex5;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation3 {
	String[] v1() default {"가나다", "라마바"}; 
	int[] v2() default {100, 200}; 
	float[] v3() default {3.14f, 5.14f}; 
}
