package QLSV;

import java.util.*;

class SINHVIEN {
	private String mssv;
    private String hoten;
    private Double dtb;
    private Lop lop = new Lop();
    private Ngay date;



	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public Double getDtb() {
		return dtb;
	}

	public void setDtb(Double dtb) {
		this.dtb = dtb;
	}

	public Lop getLop() {
		return lop;
	}

	public void setLop(Lop Class) {
		lop = Class;
	}

	public Ngay getNgay() {
		return date;
	}

	public void setNgay(Ngay ngay) {
		date = ngay;
	}

	public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mssv: ");
        mssv = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        dtb = sc.nextDouble();
        lop.input();
        System.out.println("Nhap Ngay thang nam sinh");
        date = new Ngay(sc.nextInt(), sc.nextInt(), sc.nextInt());
        
    }

	public SINHVIEN() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void output(){
        System.out.print("Mssv: " + mssv + "\n");
        System.out.print("Ho va ten: " + hoten + "\n");
        System.out.print("Diem trung binh: " + dtb + "\n");
        lop.output();
        System.out.print("Ngay sinh: ");
        date.output();
    }
    
    public void rank(){
        if (dtb >= 5){
            System.out.println("SV "+hoten+" Dau");
        }
        else {
            System.out.println("SV "+hoten+" Rot");
        }
    }
    
    public String Intenkhoa() {
    	String tenkhoa = lop.getTenKhoa();
    	return tenkhoa;
    }
    
    public boolean CheckNgaySinh(SINHVIEN that) {
    	if (this.date.getNgay() == that.date.getNgay() && this.date.getThang() == that.date.getThang() && this.date.getNam() == that.date.getNam()) {
    		return true;
    	}
    	return false;
    }
}
//=============================================
