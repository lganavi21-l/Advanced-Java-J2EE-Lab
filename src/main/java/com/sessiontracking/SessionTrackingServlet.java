package com.sessiontracking;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.util.Date;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(true);
        session.setMaxInactiveInterval(60);

        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());

        Integer count = (Integer) session.getAttribute("count");

        if (count == null)
            count = 1;
        else
            count++;

        session.setAttribute("count", count);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Session Tracking Info</h2>");
        out.println("<p><b>Session ID:</b> " + session.getId() + "</p>");
        out.println("<p><b>Created:</b> " + createTime + "</p>");
        out.println("<p><b>Last Accessed:</b> " + lastAccessTime + "</p>");
        out.println("<p><b>Visit Count:</b> " + count + "</p>");
        out.println("</body></html>");
    }
}