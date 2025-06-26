import java.io.*;
import java.net.*;
public class UnsafeDeserialization {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9000);
        Socket s = ss.accept();
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        Object o = ois.readObject(); 
        System.out.println("Got: " + o);
        ois.close();
        ss.close();
    }
}
