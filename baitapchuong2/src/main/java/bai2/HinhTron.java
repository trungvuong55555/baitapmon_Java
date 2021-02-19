/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class HinhTron {
    private double r;

    public HinhTron() {
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public String toString() {
        return "HinhTron{" + "r=" + r + '}';
    }
    
    public double ChuVi()
    {
        return 2*r*Math.PI;
    }
    
    public double DienTich()
    {
        return Math.PI*r*r;
    }
    
    public static void TieuDe()
    {
        System.out.printf("%15s%15s%15s%n","ban kinh","chu vi","dien tich");
    }
    
    public void nhap()
    {
        Random r= new Random();
        this.r= r.nextFloat();
    }
    
    public void xuat()
    {
        System.out.printf("%15s%15s%15s%n",r,ChuVi(),DienTich());
    }
}
