/*
 * Created on 10/09/2023
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package com.pixelarcade.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import oracle.jdbc.pool.OracleDataSource;

/**
 * @author Angel Jacinto
 *
 * To change the template for this generated type comment go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
public class Usuario extends HttpServlet {

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
	protected void doGet(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
			doPost(request, response);
	}
	protected void doPost(
		HttpServletRequest request,
		HttpServletResponse response)
		throws ServletException, IOException {
			String strQuerry = "";
			try{
				OracleDataSource odsDataSource = new OracleDataSource();//Objeto para la conexion.
				odsDataSource.setURL("jdbc:oracle:thin:ANGEL/admin@localhost:1521:XE");//Establecer canal de comunicacion hacia la BD.
				Connection conOracle = odsDataSource.getConnection(); //Crear conexión para la BD.
				Statement stateDML = conOracle.createStatement();//Objeto para instrucciones DML.
				System.out.println("Datos recibidos");
				strQuerry = "INSERT INTO USUARIO (NOMBRE, APELLIDO, NICK, FECHANACIMIENTO, PAIS, CIUDAD, TELEFONO, EMAIL, PASSWORD)" +
							"VALUES ('" + request.getParameter("nombre") +
							"', '" + request.getParameter("apellido") +
							"', '" + request.getParameter("nick") +
							"', TO_DATE('" + request.getParameter("fecha-nacimiento") + "', 'YYYY-MM-DD')" + 
							", '" + request.getParameter("pais") +
							"', '" + request.getParameter("ciudad") +
							"', '" + request.getParameter("telefono") +
							"', '" + request.getParameter("email") +
							"', '" + request.getParameter("password") +
							"')";
							
				stateDML.executeQuery(strQuerry);
				conOracle.commit();//Confirmar cambio en la BD.
				conOracle.close();//Cerrar sesión
				System.out.println("Registro Agregado");
			} catch(SQLException err){
				err.printStackTrace();
				System.out.println("Error en la conexion de la BD");
			}
			response.sendRedirect("exito.html");
	}
		
}
