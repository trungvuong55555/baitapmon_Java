/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

/**
 *
 * @author Admin
 */
public class MonHoc {
    private String tenmon;
    private int sotrinh;
    private double diem;

    public MonHoc(String tenmon, int sotrinh, double diem) {
        this.tenmon = tenmon;
        this.sotrinh = sotrinh;
        this.diem = diem;
    }

    public String getTenmon() {
        return tenmon;
    }

    public int getSotrinh() {
        return sotrinh;
    }

    public double getDiem() {
        return diem;
    }
    
    public static void tieude()
    {
        System.out.printf("%20s%10s%10s%n","Ten mon","So trinh","Diem");
    }
    
    public void xuat()
    {
        System.out.printf("%20s%10s%10s%n",this.tenmon,this.sotrinh,this.diem);
    }
}
