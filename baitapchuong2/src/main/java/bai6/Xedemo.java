/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Xedemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n;
        do
        {
            System.out.println("nhap so luong xe can nhap: ");
            n= sc.nextInt();
        }while(n<0);
        
        Vehicle []a= new Vehicle[n];
        
        for(int i=0;i<n;i++)
            a[i]= new Vehicle();
        
        for(int i=0;i<n;i++)
        {
            System.out.println("nhap thong tin xe thu "+ (i+1));
            a[i].nhap();
        }
        
        System.out.println("thong tin ban vua nhap la: ");
        Vehicle.tieude();
        for(int i=0;i<n;i++)
        {
            a[i].xuat();
        }
    }
}
