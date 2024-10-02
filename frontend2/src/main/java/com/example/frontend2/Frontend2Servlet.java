package com.example.frontend2;

import javax.servlet.http.*;
import java.io.IOException;

public class Frontend2Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().println("Hello from Frontend2!");
    }
}
