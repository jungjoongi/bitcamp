// Internationalization(i18)구현
package step26;
 
import java.io.FileReader;
import java.util.Properties;

public class Exam01 {
    static String filename = "message";
    static String userCountry = "us";
    static String userLanguage = "en";
    static String country = "enUs";
    static Properties label;
    
    static void init() throws Exception {
        if (System.getProperty("user.country") != null)
                userCountry = System.getProperty("user.country");
        if (System.getProperty("user.language") != null)
            userLanguage = System.getProperty("user.language");
        
        label = new Properties();
        label.load(new FileReader(
                String.format("%s-%s%s.properties", filename, userLanguage, userCountry)));
    }
    
    public static void main(String[] args) throws Exception {
        init();
        System.out.println(label.get("welcome"));
    }
}
