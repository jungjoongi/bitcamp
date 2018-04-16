package step22.ex8;

import java.io.IOException;
import java.io.InputStream;

public class DataInputStream extends InputStream {
    InputStream in;

    public DataInputStream(InputStream in) throws Exception {
        this.in = in;
    }
    
    @Override
    public int read() throws IOException {
        // 상속받은 메서드가 read() 추상메서드이기 때문에 구현하였지만
        // 플러그인으로서 사용되는 이 클래스 입장에서는 아무런일을 하지 않는다.
        return in.read();
    }
    
    public String readUTF() throws Exception {
        int size = in.read();
        byte[] bytes = new byte[size];
        in.read(bytes);
        return new String(bytes,"UTF-8");
    }

    public int readInt() throws Exception{

        int value = 0;

        value = in.read() << 24;
        value += in.read() << 16;
        value += in.read() << 8;
        value += in.read();

        return value;

    }

    public long readLong() throws Exception{

        long value = 0;

        value = in.read() << 54;
        value += in.read() << 48;
        value += in.read() << 40;
        value += in.read() << 32;
        value += in.read() << 24;
        value += in.read() << 16;
        value += in.read() << 8;
        value += in.read();

        return value;
    }


    public boolean readBoolean() throws Exception{
        if(in.read() ==1)
            return true;
        else
            return false;

    }
    @Override
    public void close() throws IOException {
        in.close();
    }


}