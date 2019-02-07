package com.test;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class testDispatcher extends HttpServlet{

        public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            System.out.println("test print out"); //콘솔로그출력
            RequestDispatcher dispatcher = request.getRequestDispatcher("/test.jsp");
            dispatcher.include(request, response);
        }
}
