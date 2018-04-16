package step21.ex5;

public class BoardException extends RuntimeException {
    
    // 이 클래스의 생성자를 호출하면 그와 대응하는 수퍼클래스의 생성자를 호출하는
    // 일 외에는 다른 작업을 수행하지 않는다.

    public BoardException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public BoardException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        // TODO Auto-generated constructor stub
    }

    public BoardException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public BoardException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public BoardException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }
    
}
