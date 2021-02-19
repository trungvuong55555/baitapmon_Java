/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class HinhChuNhat {
    private float dai;
    private float rong;

    public HinhChuNhat(float dai, float rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public HinhChuNhat() {
    }

    public float getDai() {
        return dai;
    }

    public void setDai(float dai) {
        this.dai = dai;
    }

    public float getRong() {
        return rong;
    }

    public void setRong(float rong) {
        this.rong = rong;
    }

    public float Dientich()
    {
        return dai*rong;
    }
    
    public float ChuVi()
    {
        return (dai+rong)*2;
    }
    
    public void nhap()
    {
        Random r= new Random();
        dai= r.nextFloat();
        rong=r.nextFloat();
    }
    
    public static void tieude()
    {
        System.out.printf("%15s%15s%15s%15s%15s%n","Chieu dai", "Chieu rong","Chu vi","Dien tich");
        
    }
    
    public void xuat()
    {
        System.out.printf("%15s%15s%15s%15s%15s%n",dai,rong,ChuVi(),Dientich());
    }
}
