package QuanLyNhanVien;

import java.util.Scanner;

public class NhanVienSanXuat extends NhanVien{
	private int soSanPham;

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}
	
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhap so san pham: ");
		soSanPham = sc.nextInt();
	}

	@Override
	public int tinhLuong() {
		return soSanPham*1000;
	}
	
	public void xuat() {
		super.xuat();
		System.out.printf("%15s\n",tinhLuong());
	}
}
