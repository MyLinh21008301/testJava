package iuh.se.models;

import java.sql.Date;

public class Log {
	private Account accountId;
	private Date ngayDangNhap;
	private Date ngayDangXuat;
	private String ghiChu;
	public Log() {
		
	}
	public Log(Account accountId, Date ngayDangNhap, Date ngayDangXuat, String ghiChu) {
		super();
		this.accountId = accountId;
		this.ngayDangNhap = ngayDangNhap;
		this.ngayDangXuat = ngayDangXuat;
		this.ghiChu = ghiChu;
	}
	public Account getAccountId() {
		return accountId;
	}
	public void setAccountId(Account accountId) {
		this.accountId = accountId;
	}
	public Date getNgayDangNhap() {
		return ngayDangNhap;
	}
	public void setNgayDangNhap(Date ngayDangNhap) {
		this.ngayDangNhap = ngayDangNhap;
	}
	public Date getNgayDangXuat() {
		return ngayDangXuat;
	}
	public void setNgayDangXuat(Date ngayDangXuat) {
		this.ngayDangXuat = ngayDangXuat;
	}
	public String getGhiChu() {
		return ghiChu;
	}
	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}
	@Override
	public String toString() {
		return "Log [accountId=" + accountId + ", ngayDangNhap=" + ngayDangNhap + ", ngayDangXuat=" + ngayDangXuat
				+ ", ghiChu=" + ghiChu + "]";
	}

}
