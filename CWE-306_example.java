// File: MissingAuth.java
public class MissingAuth {
    public static void main(String[] args) {
        // CWE-306: 缺少有效驗證
        resetSystem();
    }
    static void resetSystem(){
        System.out.println("System reset done"); // 即使未授權也執行
    }
}
