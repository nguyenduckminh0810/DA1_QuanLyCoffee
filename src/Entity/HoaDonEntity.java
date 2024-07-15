package Entity;

import java.util.Date;

public class HoaDonEntity {

    private int MaHD;
    private String MaNV;
    private Date NgayTao;
    private boolean TrangThai;
    private boolean TrangThaiThanhToan;
    private int ThanhTien;
    private String LyDoHuy;
    private int SoLuongHuy;
    private String GhiChu;
    private String SDT;
    private String Ten;
    private String DiaChi;
    private int TienShip;

    public HoaDonEntity() {
    }

    public HoaDonEntity(int MaHD, String MaNV, Date NgayTao, boolean TrangThai, boolean TrangThaiThanhToan, int ThanhTien, String LyDoHuy, int SoLuongHuy, String GhiChu, String SDT, String Ten, String DiaChi, int TienShip) {
        this.MaHD = MaHD;
        this.MaNV = MaNV;
        this.NgayTao = NgayTao;
        this.TrangThai = TrangThai;
        this.TrangThaiThanhToan = TrangThaiThanhToan;
        this.ThanhTien = ThanhTien;
        this.LyDoHuy = LyDoHuy;
        this.SoLuongHuy = SoLuongHuy;
        this.GhiChu = GhiChu;
        this.SDT = SDT;
        this.Ten = Ten;
        this.DiaChi = DiaChi;
        this.TienShip = TienShip;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public String getMaNV() {
        return MaNV;
    }

    public void setMaNV(String MaNV) {
        this.MaNV = MaNV;
    }

    public Date getNgayTao() {
        return NgayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.NgayTao = NgayTao;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public boolean isTrangThaiThanhToan() {
        return TrangThaiThanhToan;
    }

    public void setTrangThaiThanhToan(boolean TrangThaiThanhToan) {
        this.TrangThaiThanhToan = TrangThaiThanhToan;
    }

    public int getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(int ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    public String getLyDoHuy() {
        return LyDoHuy;
    }

    public void setLyDoHuy(String LyDoHuy) {
        this.LyDoHuy = LyDoHuy;
    }

    public int getSoLuongHuy() {
        return SoLuongHuy;
    }

    public void setSoLuongHuy(int SoLuongHuy) {
        this.SoLuongHuy = SoLuongHuy;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getTienShip() {
        return TienShip;
    }

    public void setTienShip(int TienShip) {
        this.TienShip = TienShip;
    }

}
