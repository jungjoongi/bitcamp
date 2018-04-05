// 응용 - 자바 CLASSPATH에 있는 파일의 절대 경로를 알아내는 방법
package step18.ex6;

import java.io.File;
import java.net.URL;

public class Exam02 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource("step18/ex6");

        File file = new File(url.getPath());
        File[] list = file.listFiles();
        for (File f : list) {
            System.out.println(f.getName());
        }
    }
}






