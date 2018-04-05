// 응용 - 자바 CLASSPATH에 있는 파일의 절대 경로를 알아내는 방법
package step18.ex6;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;

public class Exam03 {
    public static void main(String[] args) throws Exception {

        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        URL url = classLoader.getResource("step18/ex6");
        
        File file = new File(url.getPath());
        System.out.println(file.getCanonicalPath());
        File[] list = file.listFiles(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".class") && !name.contains("$"))
                    return true;
                return false;
            }
        });
        System.out.println(list);
        for (File f : list) {
            System.out.println(f.getName());
        }

    }
}






