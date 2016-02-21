package com.epam.task10.ui;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.epam.task10.service.PersonService;
import com.epam.task10.service.PersonServiceImpl;

public class DirectServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		final PersonService personService = new PersonServiceImpl();
		final String content = personService.getPersonListAsText();

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write("<!DOCTYPE html>\n" + "<html>\n"
				+ "<head><title>A servlet without templates.</title></head>\n"
				+ "<body bgcolor=\"#fdf5e6\">\n" + "<h1>Note:</h1>\n" + "<p>"
				+ content + "</p>\n" + "</body></html>");
	}

}
