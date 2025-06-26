// File: JndiInjection.java
import javax.naming.*;
import java.util.*;

public class JndiInjection {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter JNDI URL: "); // e.g. ldap://evil
        String url = sc.nextLine();
        new InitialContext().lookup(url); // CWE-74: 任意 JNDI lookup
        System.out.println("Lookup done");
    }
}
