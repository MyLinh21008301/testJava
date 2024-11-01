package iuh.se.models;

public class GrantAccess {
	private Account accountID;
	private Role roleID;
	private boolean isGrant;
	private String note;
	public GrantAccess() {
		
	}
	public GrantAccess(Account accountID, Role roleID, boolean isGrant, String note) {
		
		this.accountID = accountID;
		this.roleID = roleID;
		this.isGrant = isGrant;
		this.note = note;
	}
	public Account getAccountID() {
		return accountID;
	}
	public void setAccountID(Account accountID) {
		this.accountID = accountID;
	}
	public Role getRoleID() {
		return roleID;
	}
	public void setRoleID(Role roleID) {
		this.roleID = roleID;
	}
	public boolean isGrant() {
		return isGrant;
	}
	public void setGrant(boolean isGrant) {
		this.isGrant = isGrant;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return "GrantAccess [accountID=" + accountID + ", roleID=" + roleID + ", isGrant=" + isGrant + ", note=" + note
				+ "]";
	}

}
