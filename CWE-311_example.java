// File: CWE311_NoEncryption.java
import javax.net.ssl.*;
import java.io.*;
import java.net.*;

public class CWE311_NoEncryption {
    public static void main(String[] args) throws Exception {
        // 與一個 HTTP 服務器通信而非 HTTPS
        URL url = new URL("http://example.com/secret");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        System.out.println("Secret: " + br.readLine());
        br.close();
    }
}
