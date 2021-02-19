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
public class mainSinhVien {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int n=1;
        
        SinhVien []a= new SinhVien[n];
        
        a[0]= new SinhVien(1,"Dinh Van Quan",9.9,9.8);
        
        //a[1]=new SinhVien(2,"Le Ha Lan",5.1,5.2);
        /*a[2]= new SinhVien();
        a[2].setMasv(2);
        a[2].setTen("Long Vo Linh");
        a[2].setDemlt(8.8);
        a[2].setDiemth(5.7);*/
        
        
        /*a[3]= new SinhVien();
        System.out.println("Nhap thong tin cua sinh vien thu 3 thong qua phuong thuc nhap: ");
        a[3].nhap();*/
        //a[2]= new SinhVien(3,"Bui Ngoc Phuong",10.0,10.0);
        
        //a[3]= new SinhVien();
        /*
        System.out.println("Thong tin ban vua nhap la: ");
        SinhVien.TieuDe();
        for(int i=0;i<n;i++)
            a[i].xuat();
        */
        
        SinhVien a= new SinhVien(1,"Dinh Van Quan",9.1,9.1);
        SinhVien.TieuDe();
        a.xuat();
    }
}
