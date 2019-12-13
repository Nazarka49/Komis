package pl.altkom.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveCarDataServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Car car = new Car();
        car.setBrand(req.getParameter("brand"));
        car.setCarModel(req.getParameter("carModel"));
        String yearString = req.getParameter("year");
        car.setYear(Integer.parseInt(yearString));
        String mileageString = req.getParameter("brand");
        car.setMileage(Integer.parseInt(mileageString));

        CarDataDAO dao = new CarDataDAOImpl();
        try {
            dao.saveCarData(car, getServletContext().getInitParameter("dataSource"));
            req.setAttribute("addedCar", car);
        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintWriter out = resp.getWriter();
        out.println("<HTML><HEAD>");
        out.println("<TITLE>SUKCES</TITLE>");
        out.println("<meta charset=\"UTF-8\">");
        out.println("</HEAD><BODY>");
        out.println("<h1>Udało Ci się dodać samochód!!!</h1>");
        out.println("<a href=\"userForm.html\">Dodaj kolejny samochód</a>");
        out.println("</body></html>");


    }
}
