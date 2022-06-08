package com.ty.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dto.Applicant;
import com.ty.dto.Branch;
import com.ty.service.ApplicantService;
import com.ty.service.BranchService;
@WebServlet(value = "/getAllapplicantbyper")
public class GetAllApplicantByPer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		double percentage=Double.parseDouble(req.getParameter("percentage"));

		ApplicantService applicanthService = new ApplicantService();
		List<Applicant> applicants = applicanthService.getApplicantByPuc(percentage);
		if (applicants != null) {
			req.setAttribute("filterapplicant", applicants);
			RequestDispatcher dispatcher = req.getRequestDispatcher("filetrapplivant.jsp");
			dispatcher.forward(req, resp);
		} else {

		}
	}
}
