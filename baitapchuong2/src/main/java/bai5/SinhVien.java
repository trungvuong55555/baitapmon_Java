/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhVien {
    private int masv;
    private String ten;
    private double demlt;
    private double diemth;

    public SinhVien(int masv, String ten, double demlt, double diemth) {
        this.masv = masv;
        this.ten = ten;
        this.demlt = demlt;
        this.diemth = diemth;
    }

    public SinhVien() {
        this.masv=0;
        this.ten="NULL";
        this.demlt=0.0;
        this.diemth=0.0;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDemlt() {
        return demlt;
    }

    public void setDemlt(double demlt) {
        this.demlt = demlt;
    }

    public double getDiemth() {
        return diemth;
    }

    public void setDiemth(double diemth) {
        this.diemth = diemth;
    }
    
    public static void TieuDe()
    {
        System.out.printf("%-15s%-30s%-15s%-15s%15-s%n","ma sinh vien","ho ten","diem ly thuyet","diem thuc hanh","diem trung binh");
        
    }
    
    public double DiemTB()
    {
        return (this.demlt+this.diemth)/2;
    }
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap ma sinh vien: ");
        this.masv= sc.nextInt();
        System.out.print("nhap ho ten sinh vien: ");
        this.ten= sc.next();
        System.out.println("nhap diem ly thuyet cua sinh vien: ");
        this.demlt= sc.nextDouble();
        System.out.println("nhap diem thuc hanh cua sinh vien: ");
        this.diemth= sc.nextDouble();
    }
    
    public void xuat()
    {
        System.out.printf("%-15s%-30s%-15s%-15s%n",this.masv,this.ten,this.demlt,this.diemth,DiemTB());
    }
    
    
}
