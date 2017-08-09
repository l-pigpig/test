package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("gbk");//处理乱码，只适用于post，不适合get
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String path="";
		//避免空指针异常
		if("zhang".equals(username) && "12345".equals(password)){
			path="/SuccessServlet";
		}else{
			path="/ErrorServlet";
		}
		//Servlet转发
		
		//List list=Arrays.asList(new String[]{"Java","C#","C++"});
		//request.setAttribute("list", list);
		
		request.setAttribute("username", username);
		RequestDispatcher dispatcher=request.getRequestDispatcher(path);
		dispatcher.forward(request, response);
		
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
