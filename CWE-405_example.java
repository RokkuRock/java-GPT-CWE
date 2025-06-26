// File: XxeExample.java
import javax.xml.parsers.*;
import org.xml.sax.*;
import java.io.*;

public class XxeExample {
    public static void main(String[] args) throws Exception {
        DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = df.newDocumentBuilder();
        db.parse(new File("user.xml")); // CWE-405: 外部實體解析
        System.out.println("Parsed");
    }
}
