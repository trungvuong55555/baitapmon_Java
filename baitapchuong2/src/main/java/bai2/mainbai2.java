/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class mainbai2 {
    public static void main(String[] args) {
        System.out.println("nhap so luong phan tu trong mang cua hinh tron: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HinhTron[] a= new HinhTron[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]= new HinhTron();
        }
        
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap phan tu thu: "+ (i+1));
            a[i].nhap();
        }
        
        HinhTron.TieuDe();
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
        
    }
}
