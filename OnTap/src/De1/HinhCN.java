package De1;

import java.util.Random;
import java.util.Scanner;

public class HinhCN extends HinhPhang{
	private String maHinh;
	private float chieuDai;
	private float chieuRong;
	
	
	
	public String getMaHinh() {
		return maHinh;
	}
	public void setMaHinh(String maHinh) {
		this.maHinh = maHinh;
	}
	public float getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(float chieuDai) {
		this.chieuDai = chieuDai;
	}
	public float getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(float chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	
	@Override
	public float tinhCV() {
		return chieuDai+chieuRong;
	}
	@Override
	public float tinhDT() {
		// TODO Auto-generated method stub
		return chieuDai*chieuRong;
	}
	
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		do {
			Random rd = new Random();
			chieuDai = (float) rd.nextInt(100);
			chieuRong = (float) rd.nextInt(100);
		}while(chieuRong > chieuDai);
		
	}
	
	public void xuat() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s\n",maHinh,chieuDai,chieuRong,tinhDT(),tinhCV());
	}
}
