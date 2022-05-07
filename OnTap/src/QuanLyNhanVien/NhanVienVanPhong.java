package QuanLyNhanVien;

import java.util.Scanner;

public class NhanVienVanPhong extends NhanVien {
	private int mucLuong;
	private int ngayNghi;
	
	public int getMucLuong() {
		return mucLuong;
	}
	public void setMucLuong(int mucLuong) {
		this.mucLuong = mucLuong;
	}
	public int getNgayNghi() {
		return ngayNghi;
	}
	public void setNgayNghi(int ngayNghi) {
		this.ngayNghi = ngayNghi;
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap muc luong: ");
		mucLuong = sc.nextInt();
		System.out.println("Nhap ngay nghi: ");
		ngayNghi = sc.nextInt();
	}
	@Override
	public int tinhLuong() {
		return mucLuong - ngayNghi * 1000;
	}
	
	public void xuat() {
		super.xuat();
		System.out.printf("%15s\n",tinhLuong());
	}
	
	
	
}
