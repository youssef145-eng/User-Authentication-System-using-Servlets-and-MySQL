package org.example.loginproject;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
        System.out.println("Hello World!");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String fullname=request.getParameter("name");
        String phone=request.getParameter("phone");
        System.out.println(username+" "+password+" "+fullname+" "+phone);
        System.out.println("version2 to git");
        Employee emp = new Employee();
        emp.save_DB(new Employee(fullname,username,phone,password));
        response.sendRedirect("welcomepage.html");
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}