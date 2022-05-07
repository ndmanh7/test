package QuanLyNhanVien;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void title() {
		System.out.printf("%-15s%15s%15s%15s\n","Ma NV","Ho ten","Phu cap","Luong");
	}
	
	public static boolean timKiem(ArrayList<NhanVien> list, String s) {
		int check = 0;
		for (NhanVien nhanVien : list) {
			if(nhanVien.getMaNV().equalsIgnoreCase(s)) {
				check++;
			}
		}
		
		if(check != 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<NhanVien> list = new ArrayList<>();
		int a;
		
		do {
			System.out.println("\n==========MENU==========\n");
			System.out.println("1. Them nhan vien");
			System.out.println("2. Hien thi danh sach nhan vien");
			System.out.println("3. Sua nhan vien");
			System.out.println("4. Xoa nhan vien");
			System.out.println("5. Tim kiem nhan vien");
			System.out.println("6. Sap xep nhan vien");
			System.out.println("7. Ket thuc chuong trinh");
			System.out.println("Nhap lua chon: ");
			a = sc.nextInt();
			
			switch (a) {
			
			//them nhan vien vao danh sach
			case 1:
				System.out.println("\n==========CHON LOAI NHAN VIEN CAN NHAP==========\n");
				int chon;
				System.out.println("1. Nhan vien van phong");
				System.out.println("2. Nhan vien san xuat");
				System.out.println("Chon loai nhan vien can nhap thong tin: ");
				chon = sc.nextInt();
				
				switch (chon) {
				case 1:
					System.out.println("\n==========NHAP THONG TIN NHAN VIEN VAN PHONG==========\n");
					NhanVien nhanVienVP = new NhanVienVanPhong();
					nhanVienVP.nhap();
					list.add(nhanVienVP);
					
					break;

				case 2:
					System.out.println("\n==========NHAP THONG TIN NHAN VIEN SAN XUAT==========\n");
					NhanVien nhanVienSX = new NhanVienSanXuat();
					nhanVienSX.nhap();
					list.add(nhanVienSX);
					break;
				}
				break;
				
				
				
				
			//hien thi danh sach nhan vien
			case 2:
				System.out.println("\n==========HIEN THI DANH SACH NHAN VIEN==========\n");

				title();
				for (NhanVien nhanVien : list) {
					if(nhanVien instanceof NhanVienSanXuat) {
						nhanVien.xuat();
					}else if(nhanVien instanceof NhanVienVanPhong) {
						nhanVien.xuat();
					}

				}
				break;
				
				
			//sua thong tin nhan vien
			case 3:
				sc.nextLine();
				System.out.println("\n==========SUA THONG TIN NHAN VIEN==========\n");
				String s;
				System.out.println("Nhap ma nhan vien can sua: ");
				s = sc.nextLine();
				int i = 0;
				int check = 0;
				int ktNV = 0;
				for (NhanVien nhanVien : list) {
					if(nhanVien.getMaNV().equals(s)) {
						check++;
						i = list.indexOf(nhanVien);
						if(nhanVien instanceof NhanVienVanPhong) {
							ktNV = 1;
						}else if(nhanVien instanceof NhanVienSanXuat) {
							ktNV = 2;
						}
					}
				}
				
				if(check != 0) {
					System.out.println("Nhap thong tin moi cho nhan vien: ");
					
					NhanVien nhanVien;
					if(ktNV == 1) {
						nhanVien = new NhanVienVanPhong();
						nhanVien.nhap();
						list.set(i, nhanVien);
					}else if(ktNV == 2) {
						nhanVien = new NhanVienSanXuat();
						nhanVien.nhap();
						list.set(i, nhanVien);
					}
					
				}else {
					System.out.println("Khong co nhan vien nay trong danh sach!");
				}
				
				
				break;
				
				
				
			//xoa nhan vien
			case 4:
				sc.nextLine();
				System.out.println("\n==========XOA NHAN VIEN==========\n");
				String s1;
				System.out.println("Nhap ma nhan vien can xoa: ");
				s1 = sc.nextLine();
				int i1 = 0;
				int check1 = 0;
				
				for (NhanVien nhanVien : list) {
					if(nhanVien.getMaNV().equals(s1)) {
						check1++;
						i1 = list.indexOf(nhanVien);
					}
				}
				
				if(check1 != 0) {
					list.remove(i1);
					System.out.println("Xoa thanh cong!");
				}else {
					System.out.println("Khong co nhan vien nay trong danh sach!");
				}
				break;
				
			
				
			//tim kiem nhan vien
			case 5:
				
				break;
				
				
			
				
				//sap xep nhan vien theo luong
			case 6:
				System.out.println("\n==========SAP XEP NHAN VIEN THEO LUONG==========\n");
				
				break;
			case 7:
				
				break;
			
			}
		}while(a != 7);
		
		int chon;
		System.out.println("1. Nhan vien van phong");
		System.out.println("2. Nhan vien san xuat: ");
		System.out.println("Chon loai nhan vien can nhap thong tin: ");
		chon = sc.nextInt();
	}
}
