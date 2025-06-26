// File: WeakCrypto.java
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class WeakCrypto {
    public static void main(String[] args) throws Exception {
        byte[] key = "12345678".getBytes(); // 8-byte DES
        Cipher c = Cipher.getInstance("DES/ECB/PKCS5Padding"); // CWE-327
        c.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "DES"));
        byte[] out = c.doFinal("Sensitive".getBytes());
        System.out.println(Base64.getEncoder().encodeToString(out));
    }
}
