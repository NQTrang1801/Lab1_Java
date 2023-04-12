package Bai_07;
import java.util.Scanner;

public class SoNguyenTo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		boolean ok = true;
		for(int i = 2; i < num; i++) {
			if (num % i == 0) {
				ok = false;
				break;
			}
		}
		if (ok == true)
			System.out.println(num + " la so nguyen to");
		else
			System.out.println(num + " khong phai la so nguyen to");
	}
}
