package Bai_05;

import java.util.Scanner;

public class TienDien {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhap so dien: ");
		int soDien = sc.nextInt();

		int tongTien = 0;

		if (soDien <= 50)
			tongTien = soDien * 2000;
		else if (soDien <= 100) 
			tongTien = 50 * 2000 + (soDien - 50) * 2500;
		else 
			tongTien = 50 * 2000 + 50 * 2500 + (soDien - 100) * 3500;

		System.out.println("Tong tien dien: " + tongTien + " vnd");

	}

}
