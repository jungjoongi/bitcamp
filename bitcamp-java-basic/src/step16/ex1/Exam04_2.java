package step16.ex1;

import java.io.File;

public class Exam04_2 {
    public static void main(String[] args) throws Exception{
        File file = new File("temp2/a/test.txt");
        if (file.createNewFile()) {
            System.out.println("test.txt 파일을 생성하였습니다.");
        } else {
            System.out.println("test.txt 파일을 생성할 수 없습니다.");
        }
    }
}
