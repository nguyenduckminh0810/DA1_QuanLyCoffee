/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.util.Date;

/**
 *
 * @author HP
 */
public class BanChiTietEntity {
    private int MaHD;
    private int MaBan;
    private Date ThoiGianCoNguoi;
    private boolean Don;
    
    public BanChiTietEntity() {
    }

    public BanChiTietEntity(int MaHD, int MaBan, Date ThoiGianCoNguoi, boolean Don) {
        this.MaHD = MaHD;
        this.MaBan = MaBan;
        this.ThoiGianCoNguoi = ThoiGianCoNguoi;
        this.Don = Don;
    }

    public int getMaHD() {
        return MaHD;
    }

    public void setMaHD(int MaHD) {
        this.MaHD = MaHD;
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public Date getThoiGianCoNguoi() {
        return ThoiGianCoNguoi;
    }

    public void setThoiGianCoNguoi(Date ThoiGianCoNguoi) {
        this.ThoiGianCoNguoi = ThoiGianCoNguoi;
    }

    public boolean isDon() {
        return Don;
    }

    public void setDon(boolean Don) {
        this.Don = Don;
    }

    
    
}
