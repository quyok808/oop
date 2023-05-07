package RapChieuPhim;

public class main {
    public static void main(String[] args) {
        Phim p1 = new Phim();

        p1.setTenPhim("Nha ba nu");
        p1.setNamSX(2020);
        p1.hang_sx.setTenHang("Quy");
        p1.hang_sx.setQuocGia("Viet Nam");
        p1.setGiaVe(70000);
        p1.ngay.setNgay(25);
        p1.ngay.setThang(2);
        p1.ngay.setNam(2023);

        Phim p2 = new Phim();

        p2.setTenPhim("Lat mat 6");
        p2.setNamSX(2018);
        p2.hang_sx.setTenHang("Li Hai");
        p2.hang_sx.setQuocGia("Viet Nam");
        p2.setGiaVe(75000);
        p2.ngay.setNgay(16);
        p2.ngay.setThang(2);
        p2.ngay.setNam(2023);

        Phim p3 = new Phim();

        p3.setTenPhim("Bo Gia");
        p3.setNamSX(2021);
        p3.hang_sx.setTenHang("Tran Thanh");
        p3.hang_sx.setQuocGia("Viet Nam");
        p3.setGiaVe(68000);
        p3.ngay.setNgay(8);
        p3.ngay.setThang(5);
        p3.ngay.setNam(2023);

        System.out.println("Phim " + p1.getTenPhim() + " co gia ve re hon phim " + p3.getTenPhim() + ": " + p3.checkVe(p1));
        System.out.println("Ten hang san xuat phim " + p1.getTenPhim() + " la: "+ p1.hang_sx.getTenHang());    
        System.out.println("Gia ve cua phim " + p2.getTenPhim() + " truoc khi duoc khuyen mai la: " + p2.getGiaVe());
        p2.khuyenmai();
        System.out.println("Gia ve cua phim " + p2.getTenPhim() + " sau khi duoc khuyen mai la: " + p2.getGiaVe());
    }
}
