// Stack : LIFO. push() /pop()
package step12.ex3;

import step12.ex2.LinkedList;

// 스택 사용의 예
// -> 웹브라우저 history 다룰 때
// -> 웹사이트에서 breadcrumb navigation을 구현할때
// -> 웹페이지 UI의 이벤트를 처리할 때
public class Stack extends LinkedList {

    public void push(Object value) {
        this.add(value);
    }

    public Object pop() {

        if (this.head == this.tail) 
            return null;

        Bucket removedBucket = this.tail.prev;
        if (this.tail.prev.prev != null) {
            this.tail.prev.prev.next = tail;
            this.tail.prev = this.tail.prev.prev;
        } else {
            
            this.head = this.tail;
            head.prev = null;
        }
        return removedBucket.value;


    }

}
