package com.prime;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/PrimeServlet")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        int num = Integer.parseInt(req.getParameter("num"));
        boolean prime = true;

        if (num <= 1) prime = false;

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        out.println("<html><body>");

        if (prime)
            out.println("<h2 style='color:green;'>" + num + " is Prime</h2>");
        else
            out.println("<h2 style='color:red;'>" + num + " is Not Prime</h2>");

        out.println("<a href='index.html'>Go Back</a>");
        out.println("</body></html>");
    }
}