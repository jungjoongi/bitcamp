package bitcamp.mylib;

import java.util.Map;

public interface MessageInitializer {
    void onStartup(Map<String,String> msgMap);
}
