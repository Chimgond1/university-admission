package com.ty.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(value = "/adminlogin")
public class AdminLogIn extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("uname");
		String password = req.getParameter("psw");

		if (name.equals("admin@gmail.com") && password.equals("12345")) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("pass", name);
			req.getAttribute("filterapplicant");
			RequestDispatcher dispatcher = req.getRequestDispatcher("adminhome.jsp");
			dispatcher.forward(req, resp);
		} else {
			resp.sendRedirect("loginformforadmin.jsp");
		}
	}

}
