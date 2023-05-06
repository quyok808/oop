package truutuong;

public class Demo {
	public static void main(String[] args) {
		CAFE cf1 = new CAFE("Hawaiian Kona", 15.95, 100);
		CAFE cf2 = new CAFE("Ethiopian coffee", 8, 1000);
		CAFE cf3 = new CAFE("Colombian Supreme", 9.5, 1700);
		
		cf1.output();
		System.out.println("Tong tien: $" + cf1.tinhGiaTien());
		
		System.out.println("gia ban dau: " + cf1.getPrice());
		cf1.raiseCAFE1().output();
		System.out.println("gia sau khi tang: " + cf1.getPrice());
		
		System.out.println("Method 1: ");
		cf1.method1();
		
		
		cf2.output();
		System.out.println("Tong tien: $" + cf2.tinhGiaTien());
		cf3.output();
		System.out.println("Tong tien: $" + cf3.tinhGiaTien());
	}
}
