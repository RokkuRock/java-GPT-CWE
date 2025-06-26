import java.net.*;
import java.io.*;

public class Cwe502_Deserialize {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        ObjectInputStream ois = new ObjectInputStream(s.getInputStream());
        Object obj = ois.readObject(); 
        System.out.println("Got: " + obj);
        ois.close(); s.close(); ss.close();
    }
}
