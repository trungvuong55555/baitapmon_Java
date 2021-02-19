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
public class NgayThang {
    private int ngay;
    private int thang;
    private int nam;

    public NgayThang(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    
    
    
    
    public void nhap()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay: "); 
        do
        {
            this.ngay= sc.nextInt();
        }while(this.ngay<0 || this.ngay>31);
        System.out.println("Nhap thang: "); 
        do
        {
            this.thang= sc.nextInt();
        }while(this.thang>12 || this.thang<1);
        System.out.println("Nhap nam: "); this.nam= sc.nextInt();
    }

    @Override
    public String toString() {
        return this.ngay + "/"+ this.thang+"/"+ this.nam;
    }
    
    
    
}
