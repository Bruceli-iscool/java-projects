import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Calculator extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // set writer output type.
        response.setContentType("text/html");
        // get writer.
        PrintWriter writer = response.getWriter();

    }
}