package pl.altkom.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(urlPatterns = "/redirect")
public class RedirectServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String make = req.getParameter("marka");
        if(make.equals("Volvo")) {
            resp.sendRedirect("https://www.volvocars.com/pl");
        } else if ( make.equals("Mercedes")) {
            resp.sendRedirect("http://mercedes.pl");
        } else if ( make.equals("Saab")) {
            resp.sendRedirect("http://Saab.pl");
        } else if ( make.equals("Audi")) {
            resp.sendRedirect("http://Audi.pl");
        } else {
            PrintWriter pw = resp.getWriter();
            pw.println("ERROR");

        }
    }
}
