package step17.ex3;

public class ArrayList {
    
    public class MyIterator {
        int index;
        public boolean hasNext() {
            if(index < ArrayList.this.cursor)
                return true;
            return false;
        }
        
        public Object next() {

            return ArrayList.this.list[this.index++];
        }
    }
    
    protected static final int DEFAULT_CAPACITY = 5;
    
    Object[] list;
    int cursor;
    
    public ArrayList() {
        this(DEFAULT_CAPACITY);
    }
    
    public ArrayList(int capacity) {
        if (capacity < DEFAULT_CAPACITY) {
            list = new Object[DEFAULT_CAPACITY];
        } else {
            list = new Object[capacity];
        }
    }
    
    public void add(Object value) {
        if (cursor >= list.length) {
            this.increaseArray();
        }
        list[cursor++] = value;
    }
    
    public Object get(int index) {
        return list[index];
    }
    
    public void set(int index, Object value) {
        list[index] = value;
    }
    
    public void remove(int index) {
        if (index < 0 || index >= cursor)
            return;
        
        for (int i = index + 1; i < cursor; i++) {
            list[i-1] = list[i];
        }
        cursor--;
    }
    
    public void add(int index, Object value) {
        if (index < 0 || index > cursor)
            return;
        
        if (cursor >= list.length) {
            this.increaseArray();
        }
        for (int i = cursor - 1; i >= index; i--) {
            list[i + 1] = list[i];
        }
        list[index] = value;
        cursor++;
    }
    
    private void increaseArray() {
            Object[] list2 = new Object[list.length + DEFAULT_CAPACITY];
            for (int i = 0; i < list.length; i++) {
                list2[i] = list[i];
            }
            list = list2;
        }
    
    public int size() {
        return cursor;
    }
    
    public boolean contains(Object value) { // 같은 객체 x 같은 내용검사 o
        for (Object obj : list ) {
            if (obj.equals(value))
                return true; 
        }
        return false;
    }
    
    public int indexOf(Object value) { // 같은 객체 x 같은 내용검사 o
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(value))
                return i;
        }
        return -1;
    }

    public MyIterator iterator() {
        return new MyIterator();
    }
    
}








