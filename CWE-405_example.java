// File: Cwe405_XXE.java
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class Cwe405_XXE {
    public static void main(String[] args) throws Exception {
        File f = new File("user.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        db.parse(f); // CWE-405
        System.out.println("Root: " + db.parse(f).getDocumentElement().getNodeName());
    }
}
