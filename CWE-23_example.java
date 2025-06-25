// File: CWE23_PathTraversal.java
import java.io.*;

public class CWE23_PathTraversal {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.out.println("Usage: java CWE23_PathTraversal <filename>");
            return;
        }
        // 允許相對路徑逃逸
        File file = new File("data", args[0]);
        BufferedReader br = new BufferedReader(new FileReader(file));
        System.out.println("First line: " + br.readLine());
        br.close();
    }
}
