package QLSV;

import java.util.Scanner;

public class Lop {
	private String TenLop;
	private String TenKhoa;
	
	public Lop(String tenLop, String tenKhoa) {
		super();
		this.TenLop = tenLop;
		this.TenKhoa = tenKhoa;
	}

	public Lop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTenLop() {
		return this.TenLop;
	}


	public void setTenLop(String tenLop) {
		this.TenLop = tenLop;
	}



	public String getTenKhoa() {
		return this.TenKhoa;
	}



	public void setTenKhoa(String tenKhoa) {
		this.TenKhoa = tenKhoa;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten lop: ");
		TenLop = sc.nextLine();
		System.out.println("Nhap ten khoa: ");
		TenKhoa = sc.nextLine();
	}

	public void output() {
		System.out.println("Lop "+TenLop + " - Khoa " + TenKhoa);
	}
	
}
