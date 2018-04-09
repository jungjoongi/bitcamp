// 애노테이션 유지 정책
// -> SOURCE : 소스파일에만 남긴다. 컴파일 후 제거된다.
// -> CLASS : .class파일에 남긴다. 그러나 실행시에 추출할 순 없다.
// -> RUMTIME : .class 파일에 남긴다.
package step20.ex1;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// 에노테이션의 유지정책을 하지않으면 기본이다.
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {
	// 주석의 프로퍼티를 정의할 수 있다.
	// -> 인터페이스에서 메서드를 정의하는 것과 유사하다.
	// -> 메서드 이름은 프로퍼티(변수)처럼 작성한다.
	//    즉 일반적인 메서드는 보통 동사로 이름을 시작하지만,
	//    에노테이션은 명사로 이름을 짓는다.
	String value();
}
