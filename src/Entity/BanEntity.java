
package Entity;

import java.util.Date;

public class BanEntity {
    private int MaBan;
    private boolean TrangThai;
    private boolean HoatDong;
    private int SoLuongChoNgoi;
    
    public BanEntity() {
    }

    public int getMaBan() {
        return MaBan;
    }

    public void setMaBan(int MaBan) {
        this.MaBan = MaBan;
    }

    public boolean isTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(boolean TrangThai) {
        this.TrangThai = TrangThai;
    }

    public boolean isHoatDong() {
        return HoatDong;
    }

    public void setHoatDong(boolean HoatDong) {
        this.HoatDong = HoatDong;
    }

    public int getSoLuongChoNgoi() {
        return SoLuongChoNgoi;
    }

    public void setSoLuongChoNgoi(int SoLuongChoNgoi) {
        this.SoLuongChoNgoi = SoLuongChoNgoi;
    }

    public BanEntity(int MaBan, boolean TrangThai, boolean HoatDong, int SoLuongChoNgoi) {
        this.MaBan = MaBan;
        this.TrangThai = TrangThai;
        this.HoatDong = HoatDong;
        this.SoLuongChoNgoi = SoLuongChoNgoi;
    }
 
    @Override
    public String toString() {
        return "Bàn:"+ MaBan + " ("+SoLuongChoNgoi+")";
    }
    
}
