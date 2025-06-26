// File: CodeInject.java
import javax.script.*;
import java.util.*;

public class CodeInject {
    public static void main(String[] args) throws Exception {
        ScriptEngine eng = new ScriptEngineManager().getEngineByName("nashorn");
        Scanner sc = new Scanner(System.in);
        System.out.print("JS code: ");
        String code = sc.nextLine();
        eng.eval(code); // CWE-94
    }
}
