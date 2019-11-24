package pl.altkom.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ControllerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter pw = resp.getWriter();
        String name = req.getParameter("name");
        pw.println("<HTML><HEAD>");
        pw.println("<TITLE>Hello</TITLE>");
        pw.println("</HEAD><BODY>");
        pw.println("<H3>Hello ");
        if(name != null) {
            pw.print(name);
        } else {
            pw.print("world");
        }
        pw.print("!</H3>");
        pw.println("<a href=\"makeForm.html\">Formularz</a>");
        pw.println("</BODY></HTML>");
    }
}