package Bai_04;
import java.util.Scanner;

public class StringJava {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: (length >= 3) >>");
		String x = sc.nextLine();
		System.out.print("y: (length >= 3) >>");
		String y = sc.nextLine();
		System.out.println("length(" + x + ") = " + x.length());
		String x3head = x.substring(0, 3);
		System.out.println("3 ki tu dau: " + x3head);
		if (x.length() >= 7)
			System.out.println("index x[6]: " + x.charAt(6));
		String y3tail = y.substring(y.length()-3, y.length());
		String xy = x3head.concat(y3tail);
		System.out.println(xy);
		
		if (x.equals(y))
			System.out.println("x = y");
		else
			System.out.println(" x != y");
		
		if (x.equalsIgnoreCase(y))
			System.out.println("x = y");
		else
			System.out.println(" x != y");
		
		if (x.indexOf(y) != -1)
			System.out.println("y co trong x");
		else
			System.out.println("y khong co trong x");
		
		System.out.print("Vi tri y trong x: ");
		int fromIndex = 0;
		while (true) {
			int index = x.indexOf(y, fromIndex);
			if (index == -1)
				break;
			System.out.print(index + " ");
			fromIndex = index + 1;
			if (fromIndex > x.length() - y.length())
				break;
		}
	}
}
