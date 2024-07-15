/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class LoaiSanPhamEntity {
        private String MaLoaiSP;
        private String TenLoai;

    public LoaiSanPhamEntity() {
    }

    public LoaiSanPhamEntity(String MaLoaiSP, String TenLoai) {
        this.MaLoaiSP = MaLoaiSP;
        this.TenLoai = TenLoai;
    }

    public String getID_LoaiSP() {
        return MaLoaiSP;
    }

    public void setID_LoaiSP(String ID_LoaiSP) {
        this.MaLoaiSP = ID_LoaiSP;
    }

    public String getTenLoai() {
        return TenLoai;
    }

    public void setTenLoai(String TenLoai) {
        this.TenLoai = TenLoai;
    }
        @Override
        public String toString(){
            return TenLoai;
        }
}
