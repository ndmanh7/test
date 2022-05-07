package TienDien;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyHoaDonDemo {
	
	public static void title() {
		System.out.printf("%-15s%15s%15s%15s%15s%15s%15s%15s%15s\n","Ma KH","Ho ten","Ngay ra HD",
				"Dien SH","Dien KD","Dien SX","So luong","Don gia","Thanh tien");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<KhachHangNoiThanh> listKHNoiThanh = new ArrayList<>();
		ArrayList<KhachHangNgoaiThanh> listKHNgoaiThanh = new ArrayList<>();
		
		int n1, n2;
		System.out.println("Nhap so luong khach hang noi thanh:");
		n1 = sc.nextInt();
		System.out.println("Nhap so luong khach hang ngoai thanh:");
		n2 = sc.nextInt();
		
		System.out.println("\n==========NHAP KHACH HANG NOI THANH==========\n");
		for (int i = 0; i < n1; i++) {
			
			System.out.println("Nhap khach hang noi thanh thu "+(i+1)+"\n");
			KhachHangNoiThanh khachHangNoiThanh = new KhachHangNoiThanh();
			khachHangNoiThanh.nhap();
			listKHNoiThanh.add(khachHangNoiThanh);
		}
		
		System.out.println("\n==========NHAP KHACH HANG NGOAI THANH==========\n");
		for (int i = 0; i < n2; i++) {
			System.out.println("Nhap khach hang ngoai thanh thu "+(i+1)+"\n");
			KhachHangNgoaiThanh khachHangNgoaiThanh = new KhachHangNgoaiThanh();
			khachHangNgoaiThanh.nhap();
			listKHNgoaiThanh.add(khachHangNgoaiThanh);
		}
		
		
		System.out.println("\n==========HOA DON==========\n");
		System.out.println("\n==========KHACH HANG NOI THANH==========\n");
		title();
		for (KhachHangNoiThanh khachHangNoiThanh : listKHNoiThanh) {
			khachHangNoiThanh.xuat();
		}
		System.out.println("\n==========KHACH HANG NGOAI THANH==========\n");
		title();
		for (KhachHangNgoaiThanh khachHangNgoaiThanh : listKHNgoaiThanh) {
			khachHangNgoaiThanh.xuat();
		}
	}
}
