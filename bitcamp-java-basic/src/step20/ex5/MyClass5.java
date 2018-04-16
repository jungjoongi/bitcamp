// 에노테이션 사용
// @에노테이션이름(프로퍼티명="값")
package step20.ex5;

//@MyAnnotation // 필수 프로퍼티 값을 지정하징 ㅏㄶ으면 컴파일 오류!
//@MyAnnotation(value="홍길동") // 필수 프로퍼티가 없으면 지정하지 않아도 된다.
@MyAnnotation3(
        // 배열값이 한 개일 경우 중괄호를 생략할 수 있다.
        v1 = "임꺽정",
        v2 = 1111,
        v3 = 1.11f
        ) // 필수 프로퍼티가 없으면 지정하지 않아도 된다.
public class MyClass5 {
	

}
