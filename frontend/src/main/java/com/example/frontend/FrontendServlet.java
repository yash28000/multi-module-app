package com.example.frontend;

import javax.servlet.http.*;
import java.io.IOException;

public class FrontendServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello from Frontend!");
    }
}
