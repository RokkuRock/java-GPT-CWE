// File: MissingAuthz.java
import java.nio.file.*;
import java.util.*;

public class MissingAuthz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Role (user/admin)? ");
        String role = sc.nextLine();
        System.out.print("Filename to read: ");
        String fn = sc.nextLine();
        String content = new String(Files.readAllBytes(Paths.get(fn))); // CWE-862: 無授權控管
        System.out.println("Content:\n" + content);
    }
}
