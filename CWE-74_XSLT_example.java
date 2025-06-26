// File: XsltInjection.java
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.*;

public class XsltInjection {
    public static void main(String[] args) throws Exception {
        TransformerFactory tf = TransformerFactory.newInstance();
        // CWE-74: 使用外部用戶上傳 wslt.xsl
        Transformer t = tf.newTransformer(new StreamSource(new File("wslt.xsl")));
        t.transform(new StreamSource(new File("input.xml")), new StreamResult(System.out));
    }
}
