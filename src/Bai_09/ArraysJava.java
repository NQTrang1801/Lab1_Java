package Bai_09;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("nhap so luong: ");
		int n = sc.nextInt();

		int[] arraysInt = new int[n];

		System.out.println("Nhap arraysInt: ");
		for (int i = 0; i < n; i++) {
			arraysInt[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arraysInt));

		int max = arraysInt[0];
		int min = arraysInt[0];

		for (int i = 1; i < n; i++) {
			max = Math.max(arraysInt[i], max);
			min = Math.min(arraysInt[i], min);
		}
		System.out.println("max: " + max + "\nmin: " + min);

		System.out.print("x = ");
		int x = sc.nextInt();
		int index = Arrays.binarySearch(arraysInt, x);
		if (index >= 0)
			System.out.println(x + " tim thay o vi tri: " + index);
		else
			System.out.println("khong tim thay " + x);

		int count = 0;
		for (int i = 0; i < n; i++)
			if (arraysInt[i] == x)
				count++;
		System.out.println("So phan tu " + x + " la: " + count);

		Arrays.sort(arraysInt);
		System.out.println(Arrays.toString(arraysInt));
////////////////////
		int arrays2DInt[][] = new int[n][n];
		System.out.println("Nhap arrays2DInt: ");
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arrays2DInt[i][j] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arrays2DInt[i]));
		}

		max = arrays2DInt[0][0];
		min = arrays2DInt[0][0];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				max = Math.max(arrays2DInt[i][j], max);
				min = Math.min(arrays2DInt[i][j], min);
			}
		}
		System.out.println("max: " + max + "\nmin: " + min);

		for (int i = 0; i < n; i++) {
			Arrays.sort(arrays2DInt[i]);
		}
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arrays2DInt[i]));
		}
		System.out.println();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 1; j < n; j++) {
				if (arrays2DInt[i][i] > arrays2DInt[j][j]) {
					int temp = arrays2DInt[i][i];
					arrays2DInt[i][i] = arrays2DInt[i + 1][i + 1];
					arrays2DInt[j][j] = temp;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(arrays2DInt[i]));
		}
	}
}
