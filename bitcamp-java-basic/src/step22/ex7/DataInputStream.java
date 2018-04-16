package step22.ex7;

import java.io.InputStream;

public class DataInputStream {
    InputStream in;

    public DataInputStream(InputStream in) throws Exception {
        this.in = in;
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
    
    public void close() throws Exception {
        in.close();
    }


}