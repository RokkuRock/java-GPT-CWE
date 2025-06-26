// File: ImproperInput.java
import java.util.Scanner;

public class ImproperInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Array size: ");
        int size = sc.nextInt(); // CWE-20
        int[] arr = new int[size]; // 允許 size 為負或過大
        System.out.println("Created array with length " + arr.length);
    }
}
