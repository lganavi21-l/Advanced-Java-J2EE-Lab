package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("userName");

        // create cookie and redirect
        if (name != null && !name.isEmpty()) {
            Cookie c = new Cookie("user", name);
            c.setMaxAge(30);
            response.addCookie(c);
            response.sendRedirect("CookieServlet");
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        String user = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    user = c.getValue();
                }
            }
        }

        out.println("<html><body>");

        if (user != null) {

            out.println("<h2 style='color:blue;'>Welcome back, " + user + "!</h2>");
            out.println("<h2 style='color:magenta;'>You have visited this page 1 times!</h2>");

            out.println("<h3>List of Cookies and their Set Values:</h3>");

            out.println("<table border='1'>");
            out.println("<tr><th>Cookie Name</th><th>Value</th><th>Max Age</th><th>Path</th><th>Version</th></tr>");

            if (cookies != null) {
                for (Cookie c : cookies) {
                    out.println("<tr>");
                    out.println("<td>" + c.getName() + "</td>");
                    out.println("<td>" + c.getValue() + "</td>");
                    out.println("<td>" + c.getMaxAge() + "</td>");
                    out.println("<td>" + c.getPath() + "</td>");
                    out.println("<td>" + c.getVersion() + "</td>");
                    out.println("</tr>");
                }
            }

            out.println("</table>");

        } else {
            out.println("<h2 style='color:red;'>Cookie Expired / First Visit!</h2>");
        }

        out.println("<br><a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}