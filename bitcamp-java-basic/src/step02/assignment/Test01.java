package step02.assignment;

import java.util.Scanner;

class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int score1, score2, score3;

        System.out.println("이름? ");
        name = sc.nextLine();

        System.out.println("국어? ");
        score1 = sc.nextInt();

        System.out.println("영어? ");
        score2 = sc.nextInt();

        System.out.println("수학? ");
        score3 = sc.nextInt();

        int result;
        result = score1 + score2 + score3;
        float average;
        average = result/3.0f;

        System.out.printf("이름:%s 국어:%d점 영어:%d점 수학:%d점 합산:%d점 평균 %.2f점", name,score1,score2,score3,result,average);
        
        // System.out.printf("이름%s 국어:%d점 영어:%d점 수학:%d점 합산%d점
        // 평균 %d점", name score1 score2 score3 result average);


    }
}