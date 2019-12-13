package pl.altkom.web;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class SessionListener implements ServletRequestAttributeListener {
    private static int savedClientsCounter = 0;
    @Override
    public void attributeAdded(ServletRequestAttributeEvent servletRequestAttributeEvent) {
        servletRequestAttributeEvent.getServletContext();
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
