package iuh.se.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import iuh.se.models.Account;
import jakarta.inject.Inject;

public class AccountReponsetory implements IRepository<Account> {
	
	private ConnectDB connectDB;
	public AccountReponsetory() {
		connectDB = new ConnectDB();
	}
	
	
	
	@Override
	public boolean them(Account t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean xoa(Account t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean capNhat(Account t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> layDS() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Account> layTheoMa(Object... objects) {
		try {
			PreparedStatement preparedStatement = connectDB.getConnection().prepareStatement("SELECT * FROM account WHERE account_id = ? AND password = ?");
			String username = objects[0].toString();
			String password = objects[1].toString();
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				Account account = new Account(resultSet.getString(1), resultSet.getString(2), 
						resultSet.getString(3), resultSet.getString(4), resultSet.getString(5), resultSet.getInt(6));
				return Optional.of(account);
			} else {
				throw new Exception("Cannot find data");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return Optional.empty();
		}
	}

}
