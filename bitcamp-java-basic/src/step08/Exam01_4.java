// 클래스 변수와 인스턴스 변수 생성 시점과 메모리 영역
package step08;

public class Exam01_4 {

    static class Student {
        static int count;
       
        
        String name;
        int age; 
    }
    
    public static void main(String[] args) {
        Student.count = 0;

        Student s1 = new Student();
        s1.name = "홍길동";
        s1.age = 10;
        Student.count++;
        
        Student s2 = new Student();
        s2.name = "임꺽정";
        s2.age = 20;
        Student.count++;
        
        Student s3 = new Student();
        s3.name = "유관순";
        s3.age = 30;
        Student.count++;
        
        
        
        System.out.printf("%d, %s, %d\n", Student.count, s1.name, s1.age);
        System.out.printf("%d, %s, %d\n", Student.count, s2.name, s2.age);
        System.out.printf("%d, %s, %d\n", Student.count, s3.name, s3.age);

    }
}

