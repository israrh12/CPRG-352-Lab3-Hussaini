package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String first = "";
        String second = "";
        
        first = request.getParameter("first");
        second = request.getParameter("second");
        
        request.setAttribute("first", first);
        request.setAttribute("second", second);
        
        if (first == null || first.equals("") || first.matches("[a-zA-z_]+") && second == null || second.equals("") || second.matches("[a-zA-z_]+")){
            request.setAttribute("message", "Invalid");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (request.getParameter("plus") != null ){
            int add = Integer.parseInt(first) + Integer.parseInt(second);
            request.setAttribute("message", add);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (request.getParameter("minus") != null){
            int minus = Integer.parseInt(first) - Integer.parseInt(second);
            request.setAttribute("message", minus);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (request.getParameter("times") != null){
            int times = Integer.parseInt(first) * Integer.parseInt(second);
            request.setAttribute("message", times);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }else if (request.getParameter("divisor") != null){
            int divisor = Integer.parseInt(first) % Integer.parseInt(second);
            request.setAttribute("message", divisor);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
        }else{
            request.setAttribute("message", "---");
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
            return;
        }
        
    }

}