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

        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie cookie = new Cookie("user", userName);
            cookie.setMaxAge(30);
            response.addCookie(cookie);
            response.sendRedirect("CookieServlet");
            return;
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        Cookie[] cookies = request.getCookies();
        String name = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    name = c.getValue();
                }
            }
        }

        out.println("<html><body>");

        if (name != null) {
            out.println("<h2 style='color:blue;'>Welcome back, " + name + "!</h2>");
        } else {
            out.println("<h2 style='color:red;'>Cookie Expired!</h2>");
        }

        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}