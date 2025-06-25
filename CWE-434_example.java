// File: UnrestrictedUpload.java
import java.io.*;
import java.nio.file.*;

public class UnrestrictedUpload {
    public static void main(String[] args) throws Exception {
        if (args.length<2) {
            System.out.println("Usage: java UnrestrictedUpload <src> <dstFilename>");
            return;
        }
        Path src = Paths.get(args[0]);
        Files.createDirectories(Paths.get("uploads"));
        Files.copy(src, Paths.get("uploads").resolve(args[1]), StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Uploaded to uploads/" + args[1]); // CWE-434: no content/type validation
    }
}
