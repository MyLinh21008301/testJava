package iuh.se.services;

import iuh.se.models.Account;
import iuh.se.repository.AccountReponsetory;

public class AccountServices {

	private AccountReponsetory accountReponsitory;
	public AccountServices() {
		accountReponsitory = new AccountReponsetory();
		
	}
	public Account layAccount(String username, String password) {
		return accountReponsitory.layTheoMa(username, password).get();
	}
}
