import java.io.*;

public class CmdExec {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter directory to list: ");
        String dir = br.readLine();
        String cmd = "ls " + dir; 
        Process p = Runtime.getRuntime().exec(cmd);
        new BufferedReader(new InputStreamReader(p.getInputStream()))
            .lines().forEach(System.out::println);
    }
}
