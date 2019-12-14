package pl.altkom.web.listeners;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class SavedClientListener implements ServletRequestAttributeListener {
    private static int savedClientsCounter = 0;
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        if ( servletRequestAttributeEvent.getName().equals("addedClient")) {
            Object counter = servletRequestAttributeEvent
                    .getServletContext()
                    .getAttribute("savedClientsCounter");
            int c;
            if (counter != null) {
                c = Integer.valueOf(counter.toString());
            } else {
                c = 0;
            }
            c++;
            servletRequestAttributeEvent
                    .getServletContext()
                    .setAttribute("savedClientsCounter", c);
        }
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent servletRequestAttributeEvent) {

    }

    public static int getSavedClientsCounter() {
        return savedClientsCounter;
    }
}
