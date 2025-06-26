// File: WeakHash.java
import java.security.*;

public class WeakHash {
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5"); // CWE-327
        byte[] d = md.digest("sensitive-data".getBytes());
        System.out.println(javax.xml.bind.DatatypeConverter.printHexBinary(d));
    }
}
