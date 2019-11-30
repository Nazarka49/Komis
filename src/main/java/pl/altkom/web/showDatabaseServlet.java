package pl.altkom.web;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class showDatabaseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List clients = new ArrayList();
        ClientDataDAO dao = new ClientDataDAOImpl();
        InitialContext initCtx = null;
        PrintWriter pw = resp.getWriter();
        try {
            initCtx = new InitialContext();
        } catch (NamingException e) {
            e.printStackTrace();
        }
        Context context = null;
        try {
            context = (Context) initCtx.lookup("java:comp/env");
        } catch (NamingException e) {
            e.printStackTrace();
        }
        try {
            DataSource ds = (DataSource) context.lookup(getServletContext().getInitParameter("dataSource"));
            clients = dao.readClientsData(ds);
            for (Object o : clients) {
                Client c = (Client)o;
                pw.println("<li>");
                pw.println(c.getFirstName() + " " + c.getLastName());
                pw.println("</li>");
            }
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
