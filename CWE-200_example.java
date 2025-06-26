// File: InfoLeak.java
import java.nio.file.*;
import java.io.*;

public class InfoLeak {
    public static void main(String[] args) {
        try {
            String c = Files.readString(Paths.get(args[0])); // 未驗證 path
            System.out.println(c);
        } catch (Exception e) {
            e.printStackTrace(); // CWE-200
        }
    }
}
