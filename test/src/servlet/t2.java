package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*Servlet输入参数 并判断是否为偶数 
 * 访问方法：http://localhost:8080/test/servlet/t2?num=200
 * 若输多个变量 访问方式为：http://localhost:8080/test/servlet/t2?num=200&high=1.7
 * */
public class t2 extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num=Integer.parseInt(request.getParameter("num"));
		String high=request.getParameter("high");
		PrintWriter out=response.getWriter();
		out.println("High:"+high);
		out.println("Num="+num);
		out.println("Num is "+(num%2==0?"Even":"Odd"));
		out.close();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
