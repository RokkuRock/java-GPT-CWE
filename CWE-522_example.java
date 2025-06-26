// File: BasicAuth.java
import com.sun.net.httpserver.*;
import java.net.InetSocketAddress;
import java.io.IOException;
import java.util.Base64;

public class BasicAuth {
    public static void main(String[] args) throws Exception {
        HttpServer srv = HttpServer.create(new InetSocketAddress(8085), 0);
        srv.createContext("/data", exchange -> {
            String auth = exchange.getRequestHeaders().getFirst("Authorization");
            if (auth != null && auth.startsWith("Basic ")) {
                String cred = new String(Base64.getDecoder().decode(auth.substring(6)));
                exchange.sendResponseHeaders(200, 0);
                exchange.getResponseBody().write(("Hello " + cred).getBytes()); // CWE‑522
            } else {
                exchange.sendResponseHeaders(401, 0);
            }
            exchange.close();
        });
        srv.start();
    }
}
