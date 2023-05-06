package introduce;

import java.util.Scanner;

public class KTSNT {
	public static boolean KTSNT (int n) {
		int dem = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				dem++;
			}
		}
		if (dem == 2)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		int n = 3;
		System.out.println("Nhap n: ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.close();
		System.out.println(KTSNT(n));
	}
}
