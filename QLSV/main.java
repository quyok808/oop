package QLSV;

public class main {
	public static void main(String[] args) {
		SINHVIEN sv = new SINHVIEN();
		sv.input();	
		
		SINHVIEN sv1 = new SINHVIEN();
		sv1.input();
		
		System.out.println("Ten khoa cua sv "+ sv.getHoten() +" la: "+sv.Intenkhoa());
		sv.output();
		sv.rank();
		System.out.println("Ngay sinh cua sv "+ sv1.getHoten() + " co trung voi sv " + sv.getHoten() + ": "+sv1.CheckNgaySinh(sv));
		
	}
}
