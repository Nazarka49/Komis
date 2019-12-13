package pl.altkom.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        HttpSession session = req.getSession();
        String name = req.getParameter("name");
        pw.println("<HTML><HEAD>");
        pw.println("<TITLE>Hello</TITLE>");
        pw.println("<meta charset=\"UTF-8\">");
        pw.println("</HEAD><BODY>");
        pw.println("<H3>Hello ");
        if(name != null) {
            pw.print(name);
        } else {
            pw.print("world");
        }
        pw.print("!</H3>");
        pw.println("<a href=\"makeForm.html\">Marka</a><br><br>");
        pw.println("<a href=\"carForm.html\">Dodaj Samochód</a><br><br>");
        pw.println("<a href=\"userForm.html\">Utwórz Użytkownika</a><br><br>");
        pw.println("<a href=\"database\">Wyświetlić użytkowników</a><br><br>");
        pw.println("<h3>Użytkowników na stronie:" + SessionCounter.getCounter() + "</h3>");
        pw.println("</BODY></HTML>");
    }
}
