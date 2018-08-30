package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import models.User;

public class HomeServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, javax.servlet.http.HttpServletResponse resp)
			throws ServletException, IOException {
		Long userId=Long.parseLong(req.getSession().getAttribute("userId").toString());
		User user=User.getUser(userId);
		List<String>columns=new ArrayList<>(Arrays.asList(
				"#",
				"UserName",
				"Password",
				"Favorite Movie"
				));
		req.setAttribute("user", user);
		req.setAttribute("columns", columns);
		req.setAttribute("users", User.getUsers());
		req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
	}
	
	

	
	
}
