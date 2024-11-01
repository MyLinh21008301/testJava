package iuh.se.models;

import java.io.Serializable;

public class Account implements Serializable {
	private String accountID;
	private String fullName;
	private String password;
	private String email;
	private String phone;
	private int status;
	public Account() {
		
	}
	public Account(String accountID, String fullName, String password, String email, String phone, int status) {
		super();
		this.accountID = accountID;
		this.fullName = fullName;
		this.password = password;
		this.email = email;
		this.phone = phone;
		this.status = status;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", fullName=" + fullName + ", password=" + password + ", email="
				+ email + ", phone=" + phone + ", status=" + status + "]";
	}
	
}
