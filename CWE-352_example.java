// File: CsrfDemo.java
import com.sun.net.httpserver.*;
import java.io.*;

public class CsrfDemo {
    public static void main(String[] args) throws Exception {
        HttpServer srv = HttpServer.create(new InetSocketAddress(8090), 0);
        srv.createContext("/transfer", exch -> {
            if (exch.getRequestMethod().equals("POST")) {
                // CWE-352: 未驗證 CSRF token
                exch.sendResponseHeaders(200, 0);
                OutputStream os = exch.getResponseBody();
                os.write("Transfer complete".getBytes());
                os.close();
            }
        });
        srv.start();
    }
}
