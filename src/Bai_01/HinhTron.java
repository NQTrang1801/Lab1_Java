package Bai_01;
import java.util.Scanner;

public class HinhTron {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ban kinh: ");
		double r = sc.nextDouble();
		
		System.out.println("Chu vi: " + (double)2*r*Math.PI);
		System.out.println("Dien tich: " + (double) r*r*Math.PI);
	}
}
