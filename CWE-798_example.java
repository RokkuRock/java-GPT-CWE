// File: HardcodedCred.java
import java.util.*;

public class HardcodedCred {
    public static void main(String[] args) {
        String user = "admin"; // CWE‑798
        String pass = "P@ssw0rd";
        Scanner sc = new Scanner(System.in);
        System.out.print("User: ");
        if (sc.nextLine().equals(user)) {
            System.out.print("Pass: ");
            if (sc.nextLine().equals(pass)) {
                System.out.println("Logged in.");
            }
        }
    }
}
