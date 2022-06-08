package com.ty.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ty.dto.Applicant;
import com.ty.service.ApplicantService;

public class DeleteApplicant extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ApplicantService applicantService=new ApplicantService();
		boolean result=applicantService.deleteApplicant(0);
		if(result) {
			
		}
	}

}
