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
public class Vehicle {
    private String tenchuxe;
    private String loaixe;
    private int dungtich;
    private double trigia;

    public Vehicle() {
        this.tenchuxe="";
        this.loaixe="";
        this.dungtich=0;
        this.trigia=0;
    }

    public Vehicle(String tenchuxe, String loaixe, int dungtich, double trigia) {
        this.tenchuxe = tenchuxe;
        this.loaixe = loaixe;
        this.dungtich = dungtich;
        this.trigia = trigia;
    }

    public String getTenchuxe() {
        return tenchuxe;
    }

    public void setTenchuxe(String tenchuxe) {
        this.tenchuxe = tenchuxe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public double getTrigia() {
        return trigia;
    }

    public void setTrigia(double trigia) {
        this.trigia = trigia;
    }
    
    public double tinhThue()
    {
        double thue;
        if(this.dungtich<=100)
            thue= 0.1*this.trigia;
        else if(this.dungtich<=200)
            thue=0.3*this.trigia;
        else
            thue=0.5*this.trigia;
        
        return thue;
    }
    
    public void nhap()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten chu xe: ");
        this.tenchuxe= sc.nextLine();
        System.out.println("Nhap loai xe: ");
        this.loaixe= sc.nextLine();
        System.out.println("Nhap dung tich xe: ");
        this.dungtich= sc.nextInt();
        System.out.println("nhap tri gia cua xe: ");
        this.trigia= sc.nextDouble();
    }
    
    public static void  tieude()
    {
        System.out.printf("%-30s%-15s%-10s%-10s%-10s%n","Ten chu xe","Loai xe","Dung tich","Tri gia","The phai nop");
    }
    
    public void xuat()
    {
        System.out.printf("%-30s%-15s%-10s%-10s%-10s%n",this.tenchuxe,this.loaixe,this.dungtich,this.trigia,this.tinhThue());
    }
}
