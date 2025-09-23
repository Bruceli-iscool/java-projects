import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class HelloWorldServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // set writer output type.
        response.setContentTime("text/html");
        // get writer.
        PrintWriter writer = response.getWriter();
        // write
        writer.write("<h1>Hello, World!</h1>");
    }
}