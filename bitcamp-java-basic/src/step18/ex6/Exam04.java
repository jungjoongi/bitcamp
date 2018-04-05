// 응용 - 자바 CLASSPATH에 있는 파일의 절대 경로를 알아내는 방법
package step18.ex6;

import java.io.File;
import java.io.FilenameFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Exam04 {
    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        URL url = classLoader.getResource("step18/ex6");
        
        List<File> files = findClasses(new File(url.getPath()));

        for (File f : files) {
            System.out.println(f.getName());
        }
    }
     
    static List<File> findClasses(File dir) throws Exception {
        File file = new File(dir.getPath());
        File[] files = dir.listFiles(new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if (name.endsWith(".class") && !name.contains("$"))
                    return true;
                return false;
            }
        });
        
        ArrayList<File> list = new ArrayList<>();
        for (File f : files) {
            list.add(f);
        }
        return list;
    }
}






