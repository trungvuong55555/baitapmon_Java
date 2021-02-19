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
public class NhanVienDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        int n;
        Scanner sc= new Scanner(System.in);
        do
        {
            System.out.println("nhap so luong nhan vien: ");
            n= sc.nextInt();
        }while(n<0);
        
        NhanVien []a= new NhanVien[n];
        
        for(int i=0;i<n;i++)
            a[i]= new NhanVien();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap thong tin nhan vien thu: "+ (i+1));
            a[i].nhap();
        }
        
        NhanVien.tieude();
        
        for(int i=0;i<n;i++)
            a[i].xuat();
    }
}
