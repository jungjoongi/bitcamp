package step17.ex1;

import java.io.File;
import java.io.FilenameFilter;

public class Exam01_2 {
    
       
    public static void main(String[] args) throws Exception {
        class JavaFilter implements FilenameFilter {
            
            public boolean accept(File dir, String name) {
                if(name.endsWith(".java"))
                    return true; // 조회결과에 포함시켜라
                return false; // 조회결과에 제외시켜라
            }
        }
            
        File dir = new File(".");  
        
        
        JavaFilter javafilter = new JavaFilter();
        
        
        String[] names = dir.list(javafilter);
        for (String name : names) {
            System.out.println(name);
        }
    }

}
