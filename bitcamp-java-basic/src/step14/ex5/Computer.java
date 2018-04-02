
package step14.ex5;

public interface Computer {
    // 초창기 컴퓨터는 계산하는 기능이 중요했다.
    void compute();
    
    default void touch() {
        
    }
    
}
