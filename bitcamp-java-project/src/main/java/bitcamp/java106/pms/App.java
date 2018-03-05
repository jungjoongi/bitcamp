package bitcamp.java106.pms;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        Scanner sc = new Scanner(System.in);
        int a;

        String name, what, many, start, end;

        System.out.print("팀명?");
        name = sc.nextLine();

        System.out.print("설명?");
        what = sc.nextLine();
        
        System.out.print("최대인원?");
        many = sc.nextLine();

        System.out.print("시작일?");
        start = sc.nextLine();

        System.out.print("종료일?");
        end = sc.nextLine();

        System.out.println("=================");
        System.out.printf("팀명: %s", name);
        System.out.printf("설명: %s", what);
        System.out.printf("최대인원: %s명", many);
        System.out.printf("일자: %s~%s", start,end);



    }
}