// File: InsecureFile.java
import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class InsecureFile {
    public static void main(String[] args) throws Exception {
        Path p = Paths.get("secret.txt");
        Files.writeString(p, "confidential");
        // CWE-732: 沒有限制權限，預設允許所有人讀寫
        System.out.println("Written secret.txt");
    }
}
