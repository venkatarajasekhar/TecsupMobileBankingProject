package BankServices.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import BankServices.modelo.Account;
import BankServices.modelo.Transaction;
import BankServices.util.*;

public class TransactionDAO extends BaseDAO {

	
	public void addTransaction(Account account, Transaction transaction)
	{
		String queryAccount = "update Account SET CurrentBal=? where AccountNumber=?";
		String queryTransaction = "insert into " + transaction.getTransactionType() 
				+ " (Date, Amount, Description, Account_AccountNumber) "
				+ "VALUES ( NOW(),?,?,?)";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try{
		con = ConexionBD.obtenerConexion();
		stmt = con.prepareStatement(queryAccount);
		double currentBal = account.getCurrentBal() + transaction.getAmount();
		
		stmt.setDouble(1, currentBal);
		stmt.setString(2, account.getAccountNumber());
		stmt.executeUpdate();
		
		stmt = con.prepareStatement(queryTransaction);
		stmt.setDouble(1, transaction.getAmount());
		stmt.setString(2, transaction.getDescription());
		stmt.setString(3, account.getAccountNumber());
		stmt.executeUpdate();
		
		}
		
		
		catch (SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
		}
		
	}

	public List<Transaction> getTransactions()
	{
		String queryAccount = "select * from Withdraw UNION Deposit UNION Transfer";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<Transaction> transactions = new ArrayList<Transaction>();
		
		try{
		con = ConexionBD.obtenerConexion();
		stmt = con.prepareStatement(queryAccount);
		rs = stmt.executeQuery();

		while (rs.next())
		{
			//Get Transactions
			Transaction t = new Transaction(rs.getInt("ID"), rs.getTimestamp("Date"), rs.getDouble("Amount"), null,rs.getString("Description"));
			transactions.add(t);
			
		}
		
		
		
		}
		
		
		catch (SQLException e) {
			System.err.println(e.getMessage());
		} 
		finally {
			this.cerrarResultSet(rs);
			this.cerrarStatement(stmt);
			this.cerrarConexion(con);
			
		}
		return transactions;
		
	}
	}



