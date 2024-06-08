package com.app;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class UserServlet1
 */
@WebServlet("/user")
public class UserServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		 PrintWriter pw = response.getWriter();
		String userId=request.getParameter("UserId");
		String firstName=request.getParameter("UserFname");
		String lastName=request.getParameter("UserLname");
		String mailId=request.getParameter("UserMailId");
		String phoneNo=request.getParameter("UserPhNo");
		   
		 pw.println("<html><body>");
	        pw.println("UserId: " + userId + "<br>");
	        pw.println("UserFname: " + firstName + "<br>");
	        pw.println("UserLname: " + lastName + "<br>");
	        pw.println("UserMailId: " + mailId + "<br>");
	        pw.println("UserPhNo: " + phoneNo + "<br>");
	        pw.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
