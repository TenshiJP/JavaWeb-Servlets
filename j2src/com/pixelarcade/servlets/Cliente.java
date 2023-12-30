/*
 * Created on 8/09/2023
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.pixelarcade.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Angel Jacinto
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Cliente extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
			System.out.println("Recibi la llamada en el Servlet.");
			System.out.println("Nombre:				" + request.getParameter("nombre"));
			System.out.println("Apellido:			" + request.getParameter("apellido"));
			System.out.println("Nick:				" + request.getParameter("nick"));
			System.out.println("e-mail:				" + request.getParameter("email"));
			System.out.println("Fecha Nacimiento:	" + request.getParameter("fecha-nacimiento"));
			System.out.println("Pais:				" + request.getParameter("pais"));
			System.out.println("Ciudad:				" + request.getParameter("ciudad"));
			System.out.println("Telefono:			" + request.getParameter("telefono"));
			System.out.println("Password:			" + request.getParameter("password"));
			System.out.println("Password:			" + request.getParameter("confirm-password"));
			response.sendRedirect("exito.html");
	}
	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
			doGet(request, response);
	}
}
