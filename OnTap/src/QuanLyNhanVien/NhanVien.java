package QuanLyNhanVien;

import java.util.Scanner;

public abstract class NhanVien {
	private String maNV;
	private String hoTen;
	private int namVaoLam;
	private int luong;
	private final int phuCap = 100000;
	
	
	
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public int getNamVaoLam() {
		return namVaoLam;
	}
	public void setNamVaoLam(int namVaoLam) {
		this.namVaoLam = namVaoLam;
	}
	public int getLuong() {
		return luong;
	}
	public void setLuong(int luong) {
		this.luong = luong;
	}
	public int getPhuCap() {
		return phuCap;
	}
	
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma nhan vien:");
		maNV = sc.nextLine();
		System.out.println("Nhap ho ten nhan vien: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap nam vao lam");
		namVaoLam = sc.nextInt();
		
	}
	
	public void xuat() {
		System.out.printf("%-15s%15s%15s",maNV,hoTen,phuCap);
	}
	
	abstract public int tinhLuong();
	
}
