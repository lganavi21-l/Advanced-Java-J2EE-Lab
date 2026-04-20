package com.userdata;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/UserDataServlet")
public class UserDataServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String u = request.getParameter("username");
        String e = request.getParameter("email");
        String d = request.getParameter("designation");

        String error = "";

        if(u==null || u.isEmpty()) error += "Username required<br>";
        if(e==null || !e.contains("@")) error += "Valid Email required<br>";
        if(d==null || d.isEmpty()) error += "Designation required<br>";

        if(!error.isEmpty()) {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<html><body>");
            out.println("<h2 style='color:red;'>" + error + "</h2>");
            out.println("<a href='index.jsp'>Go Back</a>");
            out.println("</body></html>");
            return;
        }

        request.setAttribute("username", u);
        request.setAttribute("email", e);
        request.setAttribute("designation", d);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}