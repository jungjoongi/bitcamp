// 레퍼런스와 인스턴스 - 가비지
package step03;

class Exam03_1 {
    public static void main(String[] args) {

        class Score {
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
    
        //score 레퍼런스 선언
        score s1;

        s1 = new Score(); // 기존 인스턴스 - 가비지가 됨

        s1 = new Score(); // 새로운 인스턴스
        



    }
}

