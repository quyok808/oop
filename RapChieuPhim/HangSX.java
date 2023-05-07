package RapChieuPhim;

public class HangSX {
    private String TenHang;
    private String QuocGia;

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getQuocGia() {
        return QuocGia;
    }

    public void setQuocGia(String QuocGia) {
        this.QuocGia = QuocGia;
    }
    
    public HangSX() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HangSX(String tenHang, String quocGia) {
		super();
		TenHang = tenHang;
		QuocGia = quocGia;
	}

	public void output(){
        System.out.println("Hang sx: " + TenHang + "\nQuoc gia: " + QuocGia);
    }
}
