package Xe;

import java.util.Scanner;

public class Xe implements MayMoc {
	private String tenXe;
	private DoanhNghiep dn;
	private int trongTai;
	private int tienDatCoc;
	private String tenKH;
	private String nhienLieu;
	private int namSX;
	
	
	public String getTenXe() {
		return tenXe;
	}
	public void setTenXe(String tenXe) {
		this.tenXe = tenXe;
	}
	public DoanhNghiep getDn() {
		return dn;
	}
	public void setDn(DoanhNghiep dn) {
		this.dn = dn;
	}
	public int getTrongTai() {
		return trongTai;
	}
	public void setTrongTai(int trongTai) {
		this.trongTai = trongTai;
	}
	public int getTienDatCoc() {
		return tienDatCoc;
	}
	public void setTienDatCoc(int tienDatCoc) {
		this.tienDatCoc = tienDatCoc;
	}
	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		this.tenKH = tenKH;
	}
	@Override
	public String setNhienLieu(String NL) {
		// TODO Auto-generated method stub
		return this.nhienLieu = NL;
	}
	@Override
	public int setNamSX(int namSX) {
		// TODO Auto-generated method stub
		return this.namSX = namSX;
	}
	
	
	public void nhap() {
		dn = new DoanhNghiep();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten xe: ");
		tenXe = sc.nextLine();
		System.out.println("Nhap ten doanh nghiep: ");
		dn.setTenDN(sc.nextLine());
		System.out.println("Nhap so dien thoai: ");
		dn.setSoDT(sc.nextLine());
		System.out.println("Nhap dia chi: ");
		dn.setDiaChi(sc.nextLine());
		System.out.println("Nhap trong tai: ");
		trongTai = sc.nextInt();
		System.out.println("Nhap tien dat coc: ");
		tienDatCoc = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhap ten khach hang: ");
		tenKH = sc.nextLine();
		System.out.println("Nhap nhien lieu; ");
		setNhienLieu(sc.nextLine());
		System.out.println("Nhap nam san xuat: ");
		setNamSX(sc.nextInt());
		
	}
	
	public void xuat(){
		System.out.printf("%-15s%15s%15s%15s%15s%15s%15s%15s%15s\n",tenXe,dn.getTenDN(),
				dn.getSoDT(),dn.getDiaChi(),trongTai,tienDatCoc,tenKH,nhienLieu,namSX);
	}
	
	
}
