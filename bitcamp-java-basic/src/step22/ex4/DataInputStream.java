package step22.ex4;

import java.io.FileInputStream;

public class DataInputStream extends FileInputStream {
    public DataInputStream(String name) throws Exception{
        super(name);
    }
    
    public String readUTF() throws Exception{
        byte[] buf = new byte[100];
        int size = this.read(buf);
        
        return new String(buf,0,size,"UTF-8");
    }
    
    public int readInt() throws Exception{
        
        int value = 0;
        
        value = this.read() << 24;
        value += this.read() << 16;
        value += this.read() << 8;
        value += this.read();
        
        return value;
        
    }
    
    public long readLong() throws Exception{
        
        long value = 0;
        
        value = this.read() << 54;
        value += this.read() << 48;
        value += this.read() << 40;
        value += this.read() << 32;
        value += this.read() << 24;
        value += this.read() << 16;
        value += this.read() << 8;
        value += this.read();
        
        return value;
    }
    
    
    public boolean readBoolean() throws Exception{
        if(this.read() ==1)
            return true;
        else
            return false;
        
        
        
    }
    
    
}