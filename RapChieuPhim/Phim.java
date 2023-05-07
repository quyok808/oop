package RapChieuPhim;

public class Phim {
    private String TenPhim;
    private int NamSX;
    HangSX hang_sx = new HangSX();
    private double GiaVe;
    NgayChieu ngay = new NgayChieu();

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String TenPhim) {
        this.TenPhim = TenPhim;
    }

    public int getNamSX() {
        return NamSX;
    }

    public void setNamSX(int NamSX) {
        this.NamSX = NamSX;
    }

    public HangSX getHang_sx() {
        return hang_sx;
    }

    public void setHang_sx(HangSX hang_sx) {
        this.hang_sx = hang_sx;
    }

    public double getGiaVe() {
        return GiaVe;
    }

    public void setGiaVe(long GiaVe) {
        this.GiaVe = GiaVe;
    }

    public NgayChieu getNgay() {
        return ngay;
    }

    public void setNgay(NgayChieu ngay) {
        this.ngay = ngay;
    }

    public void output(){
        System.out.println("Ten phim: "+TenPhim);
        System.out.println("Năm sx: " + NamSX);
        hang_sx.output();
        System.out.println("Gia ve: "+GiaVe);
        System.out.print("Ngay chieu: ");
        ngay.output();   
    }
    
    public boolean checkVe(Phim that) {
    	if (this.getGiaVe() < that.getGiaVe())
    		return true;
    	return false;
    }
    
    public void khuyenmai() {
    	this.GiaVe = this.GiaVe + this.GiaVe*0.2;	
    }
}
