package com.ty.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dto.Administrator;
import com.ty.dto.Mac;
import com.ty.service.MacService;
//@WebServlet(value = "/maclogin")
public class SaveMac extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//String name = req.getParameter("name");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		////String gender = req.getParameter("gender");
		int age = Integer.parseInt(req.getParameter("age"));

		if(email.equals("nagurechimgond@gmail.com")&&password.equals("12345")) {
			HttpSession httpSession =req.getSession();
			httpSession.setAttribute("pass", email);
			RequestDispatcher dispatcher=req.getRequestDispatcher("machome.jsp");
			dispatcher.forward(req, resp);
		}

	}

}
