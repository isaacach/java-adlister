import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/count")
public class CountServlet extends HttpServlet {

    private int count;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        count++;
        PrintWriter out = res.getWriter();
        out.println("<h1>Number of page views: " + count + "/n");

        String reset = req.getParameter("reset");
        if (reset.equalsIgnoreCase("yes")){
            count = 0;
        }
    }
}
