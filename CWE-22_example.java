// File: Cwe22_ZipSlip.java
import java.io.*;
import java.util.zip.*;

public class Cwe22_ZipSlip {
    public static void main(String[] args) throws Exception {
        System.out.print("Zip file path: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        File zipFile = new File(br.readLine());
        ZipFile zf = new ZipFile(zipFile);
        zf.stream().forEach(e -> {
            try {
                File out = new File("out/", e.getName()); // CWE-22
                out.getParentFile().mkdirs();
                try (InputStream in = zf.getInputStream(e);
                     OutputStream os = new FileOutputStream(out)) {
                    in.transferTo(os);
                }
            } catch (Exception ignore) {}
        });
        System.out.println("Extraction complete");
    }
}
