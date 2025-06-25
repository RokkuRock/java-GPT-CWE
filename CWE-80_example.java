// File: CWE80_XSS.java
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class CWE80_XSS extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String msg = req.getParameter("msg"); // 直接輸出至 HTML
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><body>");
        out.println("Message: <b>" + msg + "</b>");
        out.println("</body></html>");
    }
}
