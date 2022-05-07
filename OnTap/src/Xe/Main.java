package Xe;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void title() {
		System.out.printf("%-15s%15s%15s%15s%15s%15s%15s%15s%15s\n","Ten xe","Ten DN",
				"SDT","Dia chi","Trong tai","Tien DC","Ten KH","Nhien lieu" ,"Nam SX");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Xe> list = new ArrayList<>();
		
		int n;
		System.out.println("Nhap so luong xe can nhap : ");
		n = sc.nextInt();
		System.out.println("\n===========NHAP THONG TIN XE==========\n");
		for (int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin xe thu "+(i+1)+"\n");
			Xe xe = new Xe();
			xe.nhap();
			list.add(xe);
			
		}
		
		System.out.println("\n===========XUAT THONG TIN XE==========\n");
		title();
		for (Xe xe : list) {
			xe.xuat();
		}
		
		
		System.out.println("\n===========XE CO TRONG TAI LON NHAT==========\n");
		int max = 0;
		for (Xe xe : list) {
			if(xe.getTrongTai() > max) {
				max = xe.getTrongTai();
			}
		}
		title();
		for (Xe xe : list) {
			if(xe.getTrongTai() == max) {
				xe.xuat();
			}
		}
		
		System.out.println("\n===========SAP XEP THEO TRONG TAI==========\n");
		list.sort(new Comparator<Xe>() {

			@Override
			public int compare(Xe o1, Xe o2) {
				Integer trongtai1 = (Integer) o1.getTrongTai();
				Integer trongtai2 = (Integer) o2.getTrongTai();
				return trongtai1.compareTo(trongtai2);
			}
		});
		title();
		for (Xe xe : list) {
			xe.xuat();
		}
	}
	
		
	
}
