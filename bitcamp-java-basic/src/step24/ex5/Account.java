package step24.ex5;

public class Account {
    String accountId;
    long balance;
    
    public Account(String accountId, long balance) {
        this.accountId = accountId;
        this.balance = balance;
    }
    
    
    // 한번에 한 스레드만이 호출할 수 있도록 접근을 제한하고싶다면
    // 메서드 전체를 분기화블럭으로 선언하라.
    // 어떻게??
    // 메서드앞에 synchronized를 붙인다.
    synchronized public long withdraw(long money) {
        long b = this.balance;
        for(int i = 0; i < 1000; i++) Math.asin(45.765);
        b -= money;
        for(int i = 0; i < 1000; i++) Math.asin(45.765);
        if(b < 0)
            return 0;
        for(int i = 0; i < 1000; i++) Math.asin(45.765);
        this.balance = b;
        for(int i = 0; i < 1000; i++) Math.asin(45.765);
        return money;
    }
}
