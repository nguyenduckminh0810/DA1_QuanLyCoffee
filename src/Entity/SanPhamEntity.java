
package Entity;

public class SanPhamEntity {
    private String MaSP;
    private String TenSP;
    private int Gia;
    private String MaDonViSP;
    private String MaLoaiSP;
    private boolean TrangThai;
    
    public SanPhamEntity(){
        
    }

    public SanPhamEntity(String MaSP, String TenSP, int Gia, String MaDonViSP, String MaLoaiSP, boolean TrangThai) {
        this.MaSP = MaSP;
        this.TenSP = TenSP;
        this.Gia = Gia;
        this.MaDonViSP = MaDonViSP;
        this.MaLoaiSP = MaLoaiSP;
        this.TrangThai = TrangThai;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public String getMaDonViSP() {
        return MaDonViSP;
    }

    public void setMaDonViSP(String MaDonViSP) {
        this.MaDonViSP = MaDonViSP;
    }

    public String getMaLoaiSP() {
        return MaLoaiSP;
    }

    public void setMaLoaiSP(String MaLoaiSP) {
        this.MaLoaiSP = MaLoaiSP;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }



    @Override
    public String toString(){
        return TenSP;
    }
}
