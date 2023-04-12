package Bai_08;

public class Pythagoras {
	public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
        	int index = i;
            for (int j = 1; j <= 10; j++) {
                System.out.print(index + "\t");
                index = index+i;
            }
            System.out.println();
        }
    }
}
