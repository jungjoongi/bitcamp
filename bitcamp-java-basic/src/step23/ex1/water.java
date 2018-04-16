package step23.ex1;

import java.util.Scanner;

public class water {

    public static void subak (int n) {

        String[] su = {"수", "박"};

        for (int i = 0; i < n; i++) {
            if ( i %2 == 1) {
                System.out.printf("%s", su[0]);
            } else {
                System.out.printf("%s", su[1]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        subak(n);
    }
}
