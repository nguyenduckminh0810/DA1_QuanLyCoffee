/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author Admin
 */
public class DonViSanPhamEntity {
    private String MaDonViSP;
    private String TenDonVi;
    private int KichThuoc;
    private int ThemTien;
    
    public DonViSanPhamEntity() {
    }

    public String getMaDonViSP() {
        return MaDonViSP;
    }

    public void setMaDonViSP(String MaDonViSP) {
        this.MaDonViSP = MaDonViSP;
    }

    public String getTenDonVi() {
        return TenDonVi;
    }

    public void setTenDonVi(String TenDonVi) {
        this.TenDonVi = TenDonVi;
    }

    public int getKichThuoc() {
        return KichThuoc;
    }

    public void setKichThuoc(int KichThuoc) {
        this.KichThuoc = KichThuoc;
    }

    public int getThemTien() {
        return ThemTien;
    }

    public void setThemTien(int ThemTien) {
        this.ThemTien = ThemTien;
    }

    public DonViSanPhamEntity(String MaDonViSP, String TenDonVi, int KichThuoc, int ThemTien) {
        this.MaDonViSP = MaDonViSP;
        this.TenDonVi = TenDonVi;
        this.KichThuoc = KichThuoc;
        this.ThemTien = ThemTien;
    }
    
    @Override
    public String toString(){
        return TenDonVi;
    }

    public String getThemTien(String selectByName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
