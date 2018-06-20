// 람다 (lambda)익명클래스와 람다 표현식
package step27;

public class exam02 {

    static interface Player {
        void play();
    }
    
    static void testplayer(Player player) {
        player.play();
    }
    
    public static void main(String[] args) {
        // 메서드가 한 개 짜리인 인터페이스를 익명클래스 문법을 이용하여 구현하기
        Player player = () -> System.out.println("실행~~~~~");
        
        testplayer(player);
                
    }
}
