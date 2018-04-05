package step16.ex1;

import java.io.File;

public class Exam05_2 {

    public static void main(String[] args) throws Exception {
        File dir = new File(".");
        File[] files = dir.listFiles();

        for (File file : files) {
            System.out.printf("%s %12d %s\n",
                    file.isDirectory() ? "d" : "-",
                    file.length(),
                    file.getName());
        }
    }

}
