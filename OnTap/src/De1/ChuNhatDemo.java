package De1;

import java.util.ArrayList;
import java.util.Random;

public class ChuNhatDemo {
	public static void title() {
		System.out.printf("%-15s%-15s%-15s%-15s%-15s\n","Ma hinh","Chieu dai","Chieu rong","Dien tich","Chu vi");
	}
	
	public static void main(String[] args) {
		ArrayList<HinhCN> list = new ArrayList<>();
		int dem = 0;
		while(dem < 10) {
			Random rd = new Random();
			int i = rd.nextInt(100)+1;
			HinhCN hinhCN = new HinhCN();
			String s = "CN"+i;
			int check = 0;
			for (HinhCN hinhCN2 : list) {
				if(hinhCN2.getMaHinh().equals(s)) {
					check++;
				}
			}
			
			if(check != 0) {
				System.out.println("Da ton tai ma hinh n"+s);
			}else {
				hinhCN.setMaHinh("CN"+i);
				hinhCN.nhap();
				list.add(hinhCN);
				dem++;
			}
			
			
		}
		title();
		for (HinhCN hinhCN : list) {
			hinhCN.xuat();
		}
		
		
		
		//hinh chu nhat co dien tich lon nhat
		System.out.println("\n==========HINH CHU NHAT CO DIEN TICH LON NHAT==========\n");
		float max = list.get(0).tinhDT();
		for (HinhCN hinhCN : list) {
			if(hinhCN.tinhDT() > max) {
				max = hinhCN.tinhDT();
			}
		}
		title();
		for (HinhCN hinhCN : list) {
			if(hinhCN.tinhDT() == max) {
				hinhCN.xuat();
			}
		}
		
		
		//hinh chu nhat co dien tich nho nhat
		System.out.println("\n==========HINH CHU NHAT CO DIEN TICH NHO NHAT==========\n");
		float min = list.get(0).tinhDT();
		for (HinhCN hinhCN : list) {
			if(min > hinhCN.tinhDT()) {
				min = hinhCN.tinhDT();
			}
		}
		title();
				
		for (HinhCN hinhCN : list) {
			if(hinhCN.tinhDT() == min) {
				hinhCN.xuat();
			}
		}
	}
}
