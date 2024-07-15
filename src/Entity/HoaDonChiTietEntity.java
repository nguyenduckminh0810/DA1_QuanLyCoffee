package Entity;

public class HoaDonChiTietEntity {

    private int MaHD;
    private String MaSP;
    private int SoLuong;
    private int Gia;
    private int TongGia;
    private boolean TrangThaiThanhToan;
    private String LyDoHuy;
    private String GhiChu;

    public HoaDonChiTietEntity() {
    }

    public HoaDonChiTietEntity(int MaHD, String MaSP, int SoLuong, int Gia, int TongGia, boolean TrangThaiThanhToan, String LyDoHuy, String GhiChu) {
        this.MaHD = MaHD;
        this.MaSP = MaSP;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
        this.TongGia = TongGia;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
        this.LyDoHuy = LyDoHuy;
        this.GhiChu = GhiChu;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int Gia) {
        this.Gia = Gia;
    }

    public int getTongGia() {
        return TongGia;
    }

    public void setTongGia(int TongGia) {
        this.TongGia = TongGia;
    }

    public boolean isTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(boolean TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public String getLyDoHuy() {
        return LyDoHuy;
    }

    public void setLyDoHuy(String LyDoHuy) {
        this.LyDoHuy = LyDoHuy;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

}
