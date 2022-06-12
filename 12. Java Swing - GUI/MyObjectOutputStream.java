
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class MyObjectOutputStream extends ObjectOutputStream{
    public MyObjectOutputStream() throws IOException{
        super();
    }
    public MyObjectOutputStream(OutputStream o) throws IOException{
        super(o);
    }
    public void writeStreamHeader(){}
}