/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */


public class mainbai1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("nhap so luong hinh chu nhat trong mang: ");
        int n= sc.nextInt();
        
        HinhChuNhat []a= new HinhChuNhat[n];
        
        System.out.println("su dung phuong thuc nhap cho bai toan: ");
        
        for(int i=0;i<n;i++)
        {
            a[i]= new HinhChuNhat();
        }
        
        for(int i=0;i<n;i++)
        {
            a[i].nhap();
        }
        
        HinhChuNhat.tieude();
        for(int i=0;i<n;i++)
            a[i].xuat();
    }
}
