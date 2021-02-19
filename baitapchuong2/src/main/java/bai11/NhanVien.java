/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai11;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String hoDem;
    private String ten;
    private NgayThang ngaySinh;
    private NgayThang ngayVaoLam;

    public NhanVien() {
        this.hoDem="";
        this.ten="";
        this.ngaySinh=new NgayThang(0,0,0);
        this.ngayVaoLam=new NgayThang(0,0,0);
    }
    
    
    
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ho dem nhan vien: "); this.hoDem= sc.nextLine();
        System.out.println("nhap  ten nhan vien: "); this.ten= sc.nextLine();
        System.out.println("nhap ngay thang nam sinh: ");
        this.ngaySinh.nhap();
        System.out.println("nhap ngay vao lam: ");
        this.ngayVaoLam.nhap();
    }
    
    public static void tieude()
    {
        System.out.printf("%-15s%-7s%-20s%-20s%n","Ho dem","Ten","Ngay Sinh","Ngay vao lam");
    }
    
    public void xuat()
    {
        System.out.printf("%-15s%-7s%-20s%-20s%n",this.hoDem,this.ten,this.ngaySinh,this.ngayVaoLam);
    }
    
}
