// 클래스 사용 - 패키지 클래스 사용
package step03;

//패키지 맴버 클래스
// => 패키지에 직접 소속된 클래스이다.
// => 다른 클래스들도 A클래스를 사용할 수 있다.
class A {}

class Exam04_2 {
    //중첩 클래스
    //=> 다른 클래스 안에 정의된 클래스
    //=> 그 클래스 안에서만 사용됨
    class B {}

    public static void main(String[] args) {

        //로컬 클래스
        // =>오직 그 매서든 블록 안에서만 사용
        class C {}

        public void m1() {
            A ref1;
            B ref2;
            C fef3;
        }

    }
}

