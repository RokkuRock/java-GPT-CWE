// File: ImproperAuth.java
public class ImproperAuth {
    static boolean isAuth = false;

    public static void main(String[] args){
        if (args.length>0 && args[0].equals("pass123")) isAuth=true;
        performSensitive();
    }
    static void performSensitive(){
        if (!isAuth) System.out.println("Warning: no auth, but proceeding"); // CWE-287
        System.out.println("Sensitive operation executed");
    }
}
