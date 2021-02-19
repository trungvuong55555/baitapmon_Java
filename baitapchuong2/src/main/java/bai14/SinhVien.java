/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private String masv;
    private String hoten;
    private String lop;
    private int khoa;

    public SinhVien(String masv, String hoten, String lop, int khoa) {
        this.masv = masv;
        this.hoten = hoten;
        this.lop = lop;
        this.khoa = khoa;
    }

    public String getMasv() {
        return masv;
    }

    public String getHoten() {
        return hoten;
    }

    public String getLop() {
        return lop;
    }

    public int getKhoa() {
        return khoa;
    }
    
    
}
