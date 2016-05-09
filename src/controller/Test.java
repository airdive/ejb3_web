package controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import publicinterface.SayHelloLocal;

public class Test extends HttpServlet {
	@EJB
	SayHelloLocal sayHelloLocalRef;

	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException ,IOException {
		sayHelloLocalRef.sayHelloMethod();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}



