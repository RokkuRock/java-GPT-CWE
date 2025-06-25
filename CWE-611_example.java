// File: CWE611_XXE.java
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;

public class CWE611_XXE {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: java CWE611_XXE <xmlfile>");
            return;
        }
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        // 以下不禁用外部實體解析，所以會觸發 XXE
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(new File(args[0]));
        System.out.println("Root: " + doc.getDocumentElement().getNodeName());
    }
}
