import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
    static final private String CONTENT_TYPE = "text/html; charset=UTF-8";
    public void service(ServletRequest req, ServletResponse res) throws IOException {
        res.setContentType(CONTENT_TYPE);
        PrintWriter printWriter = res.getWriter();
        printWriter.println("<html>");
        printWriter.println("<head><title>Hello</title></head>");
        printWriter.println("<body>");
        printWriter.println("<p>hello ,这是servlet的例子.at : "+new Date()+"</p>");
        printWriter.println("</body></html>");
    }

}
