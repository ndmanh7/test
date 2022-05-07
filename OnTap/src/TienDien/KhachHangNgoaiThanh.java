package TienDien;

import java.util.Scanner;

public class KhachHangNgoaiThanh {
	private String maKH;
	private String hoTen;
	private HoaDon ngayRaHD = new HoaDon();
	private KhachHang kh = new KhachHang();
	private int soLuong;
	private static int DINH_MUC = 100;
	private static float dongia;
	private float thanhTien;
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma khach hang: ");
		maKH = sc.nextLine();
		System.out.println("Nhap ho ten: ");
		hoTen = sc.nextLine();
		System.out.println("Nhap ngay ra hoa don: ");
		ngayRaHD.ngay = sc.nextInt();
		System.out.println("Nhap thang ra hoa don: ");
		ngayRaHD.thang = sc.nextInt();
		System.out.println("Nhap nam ra hoa don: ");
		ngayRaHD.nam = sc.nextInt();
		
		kh.setSinhHoat(800);
		kh.setKinhDoanh(1.5f);
		kh.setSanXuat(1.3f);
		
		System.out.println("Nhap so luong kWh tieu thu: ");
		soLuong = sc.nextInt();
		System.out.println("Nhap don gia : ");
		dongia = sc.nextFloat();
		
	}
	
	
	public float tinhThanhTien(){
		if(soLuong <= DINH_MUC) {
			thanhTien = soLuong * dongia;
		}else {
			thanhTien = (float) (soLuong * dongia * DINH_MUC + (soLuong - DINH_MUC)*dongia*2.5);
		}
		
		return thanhTien;
	}
	
	public void xuat() {
		String date = ngayRaHD.ngay+"/"+ngayRaHD.thang+"/"+ngayRaHD.nam;
		System.out.printf("%-15s%15s%15s%15s%15s%15s%15s%15s%15s\n",maKH,hoTen,date,
				kh.sinhHoat,kh.kinhDoanh,kh.sanXuat,soLuong,dongia,tinhThanhTien());
	}
}
