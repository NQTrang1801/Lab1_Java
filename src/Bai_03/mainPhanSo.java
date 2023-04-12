package Bai_03;

import java.util.Scanner;

public class mainPhanSo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PhanSo ps1 = new PhanSo();
		PhanSo ps2 = new PhanSo();
		
		ps1.tu = sc.nextInt();
		ps1.mau = sc.nextInt();
		ps2.tu = sc.nextInt();
		ps2.mau = sc.nextInt();
		
		PhanSo tong = ps1.congPS(ps2);
		System.out.print("sum: ");
		tong.printPS();
		
		PhanSo hieu = ps1.truPS(ps2);
		System.out.print("sub: ");
		hieu.printPS();
		
		PhanSo tich = ps1.nhanPS(ps2);
		System.out.print("mul: ");
		tich.printPS();
		
		PhanSo thuong = ps1.chiaPS(ps2);
		System.out.print("div: ");
		thuong.printPS();
	}
}
