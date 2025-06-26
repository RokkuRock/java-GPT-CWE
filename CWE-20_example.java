// File: Cwe20_ArrayIndex.java
import java.util.*;

public class Cwe20_ArrayIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.print("index to read [0-4]: ");
        int idx = sc.nextInt(); // CWE-20
        System.out.println("Value: " + arr[idx]); // 可能越界
    }
}
