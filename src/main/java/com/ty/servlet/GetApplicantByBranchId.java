package com.ty.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ty.dto.Applicant;
import com.ty.service.ApplicantService;

@WebServlet(value = "/getallapplicant")
public class GetApplicantByBranchId extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// int branch_id=Integer.parseInt(req.getParameter("branch_id"));
		int id = Integer.parseInt(req.getParameter("branchid"));
		ApplicantService applicantService = new ApplicantService();
		List<Applicant> listofapplicant = applicantService.getApplicantByBranchId(id);
		if (listofapplicant != null) {
			HttpSession httpSession = req.getSession();
			httpSession.getAttribute("pass");
			req.setAttribute("listofapplicant", listofapplicant);

			RequestDispatcher dispatcher = req.getRequestDispatcher("showbranchapplicant.jsp");
			dispatcher.forward(req, resp);
		} else {
			resp.sendRedirect("home.jsp");
		}
	}

}
