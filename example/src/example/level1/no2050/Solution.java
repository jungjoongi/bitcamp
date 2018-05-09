package example.level1.no2050;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in);

        String[] word = {"A", "B", "C", "D", "E", "F", "G", "H", "I",
                "J", "K", "L","M", "N", "O", "P", "Q", "R", "S", "T",
                "U", "V", "W", "X", "Y", "Z"};
        String[] input = keyScan.nextLine().split("");


        for (int i = 0; i < input.length ; i++) {

            if (input[i].equals(word[i])) {
                System.out.print(i+1+ " ");
            } 

        }
    }

}
