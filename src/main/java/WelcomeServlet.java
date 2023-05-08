import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String username = req.getParameter("username");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        if (username != null){
            out.println("<h2>Welcome, " + username + "!<h2>");
        } else {
            out.println("<h2>Welcome!<h2>");
        }
    }
}