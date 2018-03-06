package step02.assignment;

class Test05 {
    public static void main(String[] args) {
        // 배열을 사용하여 5명의 국영수 점수와 합계 평균을 구하라.

        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(keyboard);

        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] average = new float[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.print("이름? ");
            name[i] = keyScan.next();
            System.out.print("국어점수? ");
            kor[i] = keyScan.nextInt();
            System.out.print("영어점수? ");
            eng[i] = keyScan.nextInt();
            System.out.print("수학점수? ");
            math[i] = keyScan.nextInt();
       
            sum[i] = kor[i] + eng[i] + math[i];           
            average[i] = sum[i] / 3.0f; 
        }

        
        for (int i = 0; i < 5; i++) {
            if(average[i] < 80 ){
                System.out.println("당신의 점수에 대해서 알려드립니다.");
                System.out.printf("이름 :%s 국어점수 :%d 영어점수 :%d 수학점수 :%d 합산 :%d 평균 %.2f 이므로.\n"
                    , name[i], kor[i], eng[i], math[i], sum[i], average[i]);
                System.out.println("당신은 불합격입니다.");
            }else{
                System.out.println("당신의 점수에 대해서 알려드립니다.");
                System.out.printf("이름 :%s 국어점수 :%d 영어점수 :%d 수학점수 :%d 합산 :%d 평균 %.2f 이므로.\n"
                    , name[i], kor[i], eng[i], math[i], sum[i], average[i]);
                System.out.println("당신은 합격입니다.");
            }
        }
    }
}

