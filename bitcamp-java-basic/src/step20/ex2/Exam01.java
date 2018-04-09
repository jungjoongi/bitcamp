package step20.ex2;


public class Exam01 {
	public static void main(String[] args) {
		Class clazz = MyClass.class;

		MyAnnotation obj = (MyAnnotation)clazz.getAnnotation(MyAnnotation.class);
		if (obj == null) {
			System.out.println("Myannotation을 추출할 수 없습니다.");
		}
		
		MyAnnotation2 obj2 = (MyAnnotation2)clazz.getAnnotation(MyAnnotation2.class);
		if (obj2 == null) {
			System.out.println("Myannotation2을 추출할 수 없습니다.");
		}
		MyAnnotation3 obj3 = (MyAnnotation3)clazz.getAnnotation(MyAnnotation3.class);
		if (obj3 == null) {
			System.out.println("Myannotation3을 추출할 수 없습니다.");
		} else {
			System.out.println("Myannotation3의 value" + obj3.value());
		}
	}
}
