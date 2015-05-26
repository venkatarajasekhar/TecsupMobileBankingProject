package BankServices.business;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BankServices.modelo.*;
import BankServices.excepcion.*;
import BankServices.dao.*;

public class GCheckingAccount {

	public Collection<CheckingAccount> mostrar()
			throws DAOExcepcion {
		CheckingDAO dao = new CheckingDAO();
		
		return dao.listar();
	}
	

}