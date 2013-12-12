package milka.milka;

import milka.milka.students.DefaultReplyGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    private static PrintWriter prepareAndGetWriter(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        return resp.getWriter();
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String q = req.getParameter("key");
        PrintWriter p = resp.getWriter();
        p.println("<html>");
        p.println("<body>");
        p.println("<form method=\"post\">");
        p.println("Can I <input type=\"text\" name=\"key\">");
        p.println("<p>");
        p.println("<input type=\"submit\" value=\"Ask\"></form>");
        p.println("<p>");
        p.println("Can you " + q + "?");
        p.println(new DefaultReplyGenerator().generate());
        p.println("</html>");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter p = resp.getWriter();
        p.println("<html>");
        p.println("<body>");
        p.println("<form method=\"post\">");
        p.println("Can I <input type=\"text\" name=\"key\">");
        p.println("<p>");
        p.println("<input type=\"submit\" value=\"Ask\"></form>");
        p.println("</html>");
    }
}