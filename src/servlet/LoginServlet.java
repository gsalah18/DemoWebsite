package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.User;

public class LoginServlet extends HttpServlet{
	private HttpServletResponse response;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		response=resp;
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String rememberMe=req.getParameter("rememberMe");
		Long userCheck=User.checkUser(username, password);
		if(userCheck!=-1) {
			if(rememberMe.equals("on"))
				LoadCookies("Id", userCheck.toString());
			req.getSession().setAttribute("userId", userCheck.toString());
			req.getRequestDispatcher("/home").forward(req, resp);
			//out.println("Right and  Password");
		}else {
			req.setAttribute("error", "Wrong Id or Password");
			req.getRequestDispatcher("index.jsp").forward(req, resp);		
			}
		
	}

	private void LoadCookies(String name,String value) {
		Cookie cookie=new Cookie(name, value);
		response.addCookie(cookie);
	}
	
}
