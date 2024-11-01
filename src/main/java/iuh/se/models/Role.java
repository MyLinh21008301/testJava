package iuh.se.models;

import java.util.Objects;

public class Role {
	private String roleID;
	private String roleName;
	private String description;
	private int status;
	public Role() {
		
	}
	public Role(String roleID, String roleName, String description, int status) {
		
		this.roleID = roleID;
		this.roleName = roleName;
		this.description = description;
		this.status = status;
	}
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Role [roleID=" + roleID + ", roleName=" + roleName + ", description=" + description + ", status="
				+ status + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(roleID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		return Objects.equals(roleID, other.roleID);
	}
	
}
