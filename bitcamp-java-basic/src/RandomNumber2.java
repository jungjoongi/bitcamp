

import java.util.Random;

public class RandomNumber2 { 
    static String[] name;
    static int[] cnt;
    static Random ran = new Random();

    public static void main(String[] args) throws Exception { 
        // TODO Auto-generated method stub         
        for (int i = 0; i < 10; i++) { 
            System.out.print("."); 
            Thread.currentThread().sleep(1000);   
        }

        for (int a = 0; a < ran.nextInt(1000); a++) {
            for (int a2 = 0; a2 < ran.nextInt(1000); a2++) {

                initVars();
                initArray();

                Random r = new Random();
                int size = name.length;


                for(int i = 0; i< 27; i++) {
                    int num = r.nextInt(size);

                    if(isExist(num)) {
                        i = i-1;
                        continue;
                    }
                    cnt[i] = num;
                }
                sort(size);
            }
        }
        System.out.println();
        print();
        //namePrint();
    }

    public static void initVars() {
        name = new String[] { "강동현", "경명수", "김가람", "김관희", "김기남", "김범수",  
                "김복진", "김소영", "문선민", "박서경", 
                "박수현", "박현기", "서도경", "성현동", "오현주", "이동현", 
                "이상경", "이왕로", "이정호", "임현식", "장하은", "정준기", 
                "차진호", "최보람", "한돈희", "홍정호", "황재천"}; 
        cnt = new int[27];
    }

    public static void initArray() {
        for(int i = 0; i < name.length; i++)
            cnt[i] = -1;
    }

    public static boolean isExist(int num) {
        for(int i = 0; i < name.length; i++) {
            if(cnt[i] == num)
                return true;
        }
        return false;
    }

    public static void sort(int size) {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - (i+1); j++) {
                if( cnt[j] > cnt[j+1] ) {
                    int tmp = cnt[j+1];
                    String tmp2 = name[cnt[j+1]];

                    name[cnt[j+1]] = name[cnt[j]];
                    cnt[j+1] = cnt[j];

                    name[cnt[j]] = tmp2;
                    cnt[j] = tmp;
                }
            }
        }
    }

    public static void print() {
        for(int i = 0; i < name.length; i++)
            System.out.println( (cnt[i]+1) + "번 : " + name[cnt[i]]);
    }

    public static void namePrint() {
        for(int i = 0; i < name.length; i++)
            System.out.println(name[i]);
    }
} 