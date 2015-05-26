package BankLogic;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.sun.org.apache.xpath.internal.operations.Bool;

import BankServices.modelo.*;
import BankServices.excepcion.*;
import BankServices.dao.*;

public class Login {

	public SecurityQuestion doLogin(String username, String password) throws DAOExcepcion
	{
		
		if (username == "" || username == null)
		{
			return null;
		}
		
		else if (password == "" || password == null)
		{
			return null;
		}
		
		
		CustomerDAO dao = new CustomerDAO();
		Customer customer = dao.getCustomerById(username);
		SecurityQuestionDAO SQdao = new SecurityQuestionDAO();
		
		SQdao.getQuestionByCustomerId(customer);
		
		
		if (!password.equals(customer.getPassword()))
		{
			return null;
		}
		
		return customer.getRandomSecurityQuestion();
		
		
	}
	
	public Customer doLogin(String username, String password, Integer securityQuestionID, String securityAnswer) throws DAOExcepcion
	{
		
		if (username == "" || username == null)
		{
			return null;
		}
		
		else if (password == "" || password == null)
		{
			return null;
		}
		
		
		CustomerDAO dao = new CustomerDAO();
		Customer customer = dao.getCustomerById(username);
		SecurityQuestionDAO SQdao = new SecurityQuestionDAO();
		
		SQdao.getQuestionByCustomerId(customer);
		
		
		if (!password.equals(customer.getPassword()))
		{
			return null;
		}



		if (securityAnswer == null || securityAnswer == "" || securityQuestionID == null)
		{
			return null;
		}
		
		SecurityQuestion ResponseSQ = customer.getSecurityQuestion(securityQuestionID);
		if (ResponseSQ == null)
		{
			return null;
		}
		
		if (!securityAnswer.equals(ResponseSQ.getAnswer()) )
		{
			return null;
		}
		
		return customer;
		
		
	}
	

}