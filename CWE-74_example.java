// File: Cwe74_JNDI.java
import javax.naming.*;
import java.util.*;

public class Cwe74_JNDI {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter JNDI lookup URL: ");
        String url = new Scanner(System.in).nextLine();
        new InitialContext().lookup(url); // CWE-74
        System.out.println("Lookup done");
    }
}
