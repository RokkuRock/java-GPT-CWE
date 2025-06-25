// File: CWE502_UntrustedDeserialization.java
import java.io.*;

public class CWE502_UntrustedDeserialization {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java CWE502_UntrustedDeserialization <file.ser>");
            return;
        }
        FileInputStream fis = new FileInputStream(args[0]);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        System.out.println("Deserialized: " + obj);
        ois.close();
    }
}
