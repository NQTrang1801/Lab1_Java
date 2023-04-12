package Bai_02;
import java.util.Scanner;

public class PhepChia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap 2 so: ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.printf(a + " / " + b + " = " + "%.3f",(a/b));
		System.out.println("\n");
	}
}
