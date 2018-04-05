package step16.ex1;

import java.io.File;

public class Exam05_1 {
    
    public static void main(String[] args) throws Exception {
        File dir = new File(".");
        String[] names = dir.list();
        
        for (String name : names) {
            System.out.println(name);
        }
    }

}
