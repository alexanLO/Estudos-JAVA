package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DB;
import db.DbException;

public class App {

	public static void main(String[] args) {

		// transação é importante para manter a consistencia do banco de dados

		//setAutoCommi - inicia ele ocmeça com o valor false ele só fecha quando ficar true
		//commit() - confirma a transação
		//rollback - desfaz o que foi feito até então

		Connection connection = null;
		PreparedStatement st = null;

		try {
			connection = DB.getConnection();
			connection.setAutoCommit(false);

			st = (PreparedStatement) connection.createStatement();

			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");

			int x = 1;
			if(x < 2){
				throw new SQLException("Fake error");
			}

			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");


		} catch (SQLException e) {
			e.getStackTrace();
		} finally{
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}