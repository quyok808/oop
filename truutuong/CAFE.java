package truutuong;

public class CAFE {
	private String kind;
	private double price;
	private int weight;
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void output() {
		System.out.println(weight + " pound cafe loai "+ kind + ", gia $" + price + "/pound");
	}
	
	//_contructor
	public CAFE(String kind, double price, int weight) {
		super();
		this.kind = kind;
		this.price = price;
		this.weight = weight;
	}
	
	//_tinh_gia_tien
	public double tinhGiaTien() {
		double total;
		total = price * weight;
		return total;
	}
	
	//_tang_gia_khong_thay_doi_thuoc_tinh_ban_dau
	public CAFE raiseCAFE1() {
		return new CAFE(kind,this.price + this.price*0.05,weight);
	}
	//_tang_gia_thay_doi_thuoc_tinh_ban_dau
	public void raiseCAFE2() {
		this.price = this.price + this.price*0.05;
	}
	
	public void method1() {
		int a = 0;
		System.out.println(a);
		method2(a);
		System.out.println(a);
	}
	public void method2(int a) {
		a = a + 1;
		System.out.println("Method 2: "+a);
	}
	
	//_swap
	public void swap(int var1, int var2) {
		int temp = var1;
		var1 = var2;
		var2 = temp;
	}
}
