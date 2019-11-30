package pl.altkom.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class successfullSubmitServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String name = req.getParameter("name");
        pw.println("<HTML><HEAD>");
        pw.println("<TITLE>Success</TITLE>");
        pw.println("</HEAD><BODY>");
        pw.println("<H1> Success ");
        pw.print("!</H1>");
        pw.println("<a href=\"makeForm.html\">Marka</a><br><br>");
        pw.println("<a href=\"userForm.html\">Utwórz Użytkownika</a><br><br>");
        pw.println("<a href=\"database\">Wyświetlić użytkowników</a><br><br>");
        pw.println("</BODY></HTML>");
    }
}
