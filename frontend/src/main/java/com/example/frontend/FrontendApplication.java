package com.example.frontend;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class FrontendApplication {
    public static void main(String[] args) throws Exception {
        Server server = new Server(8081); // Change the port if needed
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        // Register your servlet here
        context.addServlet(FrontendServlet.class, "/hello"); // Specify the endpoint

        server.start();
        server.join();
    }
}

