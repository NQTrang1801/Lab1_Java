package Bai_06;

import Bai_01.HinhTron;
import Bai_02.PhepChia;
import Bai_03.PhanSo;
import Bai_03.mainPhanSo;
import Bai_04.StringJava;
import Bai_05.TienDien;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String choose = "0";
		boolean key = true;
		while (key) {
			System.out.println("*___________MENU___________");
			System.out.println("choose 1: Bai 1");
			System.out.println("choose 2: Bai 2");
			System.out.println("choose 3: Bai 3");
			System.out.println("choose 4: Bai 4");
			System.out.println("choose 5: Bai 5");
			System.out.println("choose 0: break");
			System.out.print("choose: ");
			if (sc.hasNext())
				choose = sc.next();
			else
				choose = "0";
			switch (choose) {
			case "1":
				HinhTron.main(args);
				break;
			case "2":
				PhepChia.main(args);
				break;
			case "3":
				mainPhanSo.main(args);
				break;
			case "4":
				StringJava.main(args);
				break;
			case "5":
				TienDien.main(args);
				break;
			case "0":
				key = false;
				break;
			default:
				break;
			}
		}
	}
}
