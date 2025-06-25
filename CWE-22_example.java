import java.io.*;

public class CWE22_PathTraversal {
    public static void main(String[] args) throws IOException {
        if (args.length < 1) { System.out.println("usage: java CWE22_PathTraversal <file>"); return; }
        String file = args[0];
        String path = "data/" + file;
        BufferedReader r = new BufferedReader(new FileReader(path));
        System.out.println("First line: " + r.readLine());
        r.close();
    }
}
