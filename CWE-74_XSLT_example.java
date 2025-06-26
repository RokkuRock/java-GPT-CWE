// File: Cwe74_Xslt.java
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class Cwe74_Xslt {
    public static void main(String[] args) throws Exception {
        System.out.print("XSLT path: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String xslt = br.readLine();
        Transformer t = TransformerFactory.newInstance()
            .newTransformer(new StreamSource(new File(xslt))); // CWE-74
        t.transform(new StreamSource(new File("in.xml")), new StreamResult(System.out));
    }
}
