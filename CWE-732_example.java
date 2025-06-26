// File: InsecurePerm.java
import java.io.File;
import java.io.FileWriter;

public class InsecurePerm {
    public static void main(String[] args) throws Exception {
        File f = new File("public_log.txt");
        FileWriter fw = new FileWriter(f);
        fw.write("Log entry");
        fw.close();
        f.setReadable(true, false); // CWE‑732: 全球可讀
        System.out.println("Log created with insecure permissions.");
    }
}
