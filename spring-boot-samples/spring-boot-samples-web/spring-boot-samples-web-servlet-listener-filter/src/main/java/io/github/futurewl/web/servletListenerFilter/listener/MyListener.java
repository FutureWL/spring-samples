package io.github.futurewl.web.servletListenerFilter.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("context init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
