package com.example.frontend2;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class Frontend2Application {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8082); // Change the port if needed
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Register your servlet here
        context.addServlet(Frontend2Servlet.class, "/hello2"); // Specify the endpoint

        server.start();
        server.join();
    }
}
