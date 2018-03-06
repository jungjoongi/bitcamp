package step02.assignment;

class Test06 {
    public static void main(String[] args) {
        // 배열을 사용하여 5명의 국영수 점수와 합계 평균을 구하고
        // 80점 이상 합격, 이하는 불합격을 통보하라


        String[] name = new String[5];
        int[] kor = new int[5];
        int[] eng = new int[5];
        int[] math = new int[5];
        int[] sum = new int[5];
        float[] average = new float[5];

        java.io.InputStream Keyboard = System.in;
        java.util.Scanner keyScan = new java.util.Scanner(Keyboard);

        
        for(int i = 0; i < 5; i++) {
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
        for(int i = 0; i < 5; i++ ){
            if(average[i] > 80) {
                System.out.println("***********************************");
                System.out.println("당신의 점수에 대해서 알려드리겠습니다.");
                System.out.printf("%s님은: 국어: %d점 영어: %d점 수학: %d점 총점: %d점 평균: %.2f점 이므로\n"
                , name[i], kor[i], eng[i], math[i], sum[i], average[i]);
                System.out.println("합격입니다.");
            }else{
                System.out.println("***********************************");
                System.out.println("당신의 점수에 대해서 알려드리겠습니다.");
                System.out.printf("%s님은: 국어: %d점 영어: %d점 수학: %d점 총점: %d점 평균: %.2f점 이므로\n"
                , name[i], kor[i], eng[i], math[i], sum[i], average[i]);
                System.out.println("불합격입니다.");
            }
        }
    }
}

