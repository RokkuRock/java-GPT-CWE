// File: CodeInject.java
import javax.script.*;
import java.util.*;

public class CodeInject {
    public static void main(String[] args) throws Exception {
        ScriptEngine eng = new ScriptEngineManager().getEngineByName("nashorn");
        Scanner sc = new Scanner(System.in);
        System.out.print("JS expr: ");
        String expr = sc.nextLine();
        eng.eval(expr); // CWE-94: 未過濾
    }
}
