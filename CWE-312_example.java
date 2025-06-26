// File: CleartextStore.java
import java.io.FileWriter;

public class CleartextStore {
    public static void main(String[] args) throws Exception {
        String pwd = "superSecret123";
        FileWriter fw = new FileWriter("credentials.txt");
        fw.write("password=" + pwd); // CWE‑312
        fw.close();
        System.out.println("Stored credentials in cleartext.");
    }
}
