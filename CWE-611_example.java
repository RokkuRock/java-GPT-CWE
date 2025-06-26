// File: XxeVuln.java
import javax.xml.parsers.*;
import org.w3c.dom.Document;
import java.io.File;

public class XxeVuln {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
        DocumentBuilder b = f.newDocumentBuilder();
        Document doc = b.parse(new File("user-input.xml")); // CWE‑611: XXE
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
    }
}
