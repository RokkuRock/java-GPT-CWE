// File: HardcodedKey.java
import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;

public class HardcodedKey {
    public static void main(String[] args) throws Exception {
        byte[] key = "abcdefghijklmnop".getBytes(); // 16 bytes AES but hardcoded
        SecretKeySpec k = new SecretKeySpec(key, "AES"); // CWE‑321
        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, k);
        byte[] out = c.doFinal("data".getBytes());
        System.out.println(out.length);
    }
}
