package bitcamp.java106.pms.util;


public class LinkedList {

    Bucket head;
    Bucket tail;

    class Bucket {

        Object value;
        Bucket next;
        Bucket prev;
    }

    public void LinkedList() {
        Bucket head = new Bucket(); 
        tail = head;
    }

    public void add (Object value) {
        tail.value = value;
        Bucket bucket = new Bucket();
        tail.next = bucket;
        bucket.prev = tail;
        tail = bucket;
    }

    public Object get (int index) {
        int count = 0;
        Bucket cursor = head;

        while(cursor != tail) {
            if (count == index) {
                return cursor.value; 
            }
            cursor = cursor.next;
            count++;
        }
        return null;
    }

    public int size() {
        int count = 0;
        Bucket cursor = head;

        while(cursor != tail) {
            cursor = cursor.next;
            count++;
        }
        return count;
    }

    public Object remove(int index) {
        Bucket cursor = head;

        if (head == tail) {
            return null;
        } else if (cursor.prev == null) {
            head = head.next;
            head.prev = null;
            return cursor.value;
        }


        int count = 0;
        while(cursor != tail) {
            if (count == index) {
                cursor.prev.next = cursor.next;
                cursor.next.prev = cursor.prev;
                return cursor.value; 
            }
            cursor = cursor.next;
            count++;
        }
        return null;
    }

    public void add (int index, Object value) {
        Bucket cursor = head;
        int count = 0;

        while(cursor != tail) {
            if (count == index) {
                Bucket bucket = new Bucket();
                bucket.value = value;
                bucket.prev = cursor.prev;
                cursor.prev = bucket;
                bucket.next = cursor;
                if (cursor.prev != null) {
                    cursor.prev.next = bucket;
                }else {
                    head = bucket;
                }
                return;

            }
            cursor = cursor.next;
            count++;
        }
        if (count == index)
            add(value);
    }



}
