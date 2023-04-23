package com.register.servlet;

import com.register.conn.HibernateUtils;
import com.register.dao.EmployeeDao;
import com.register.entity.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String phone=req.getParameter("phone");
        String department=req.getParameter("department");
        String email=req.getParameter("email");
        String password=req.getParameter("password");
        Employee e=new Employee(1,name,phone,department,email,password);


        EmployeeDao employeeDao=new EmployeeDao(HibernateUtils.getSessionFactory());
        boolean a=employeeDao.saveEmp(e);
       HttpSession httpSession= req.getSession();
        if(a==true){
            httpSession.setAttribute("message","Registered Sucessfully...");
            System.out.println("Registered Sucessfully...");
        }
        else {
            httpSession.setAttribute("message","Registration Failed...");
            System.out.println("Registration Failed...");
        }
        resp.sendRedirect("index.jsp");
    }
}
