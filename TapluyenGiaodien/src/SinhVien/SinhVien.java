/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

/**
 *
 * Dinh Van Quan
 */
public class SinhVien {
    private String masv;
    private String hoten;
    private String gioitinh;
    private String lop;
    private String sothich;

    public SinhVien() {
        this.masv="a1";
        this.hoten="Dinh Van Quan";
        this.gioitinh="Nam";
        this.lop="Khoa hoc may tinh 2";
        this.sothich="";
    }

    public SinhVien(String masv, String hoten, String gioitinh, String lop, String sothich) {
        this.masv = masv;
        this.hoten = hoten;
        this.gioitinh = gioitinh;
        this.lop = lop;
        this.sothich = sothich;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSothich() {
        return sothich;
    }

    public void setSothich(String sothich) {
        this.sothich = sothich;
    }
    
    
    
}
