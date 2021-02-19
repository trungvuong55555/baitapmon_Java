/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai14;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Phieu {
    private SinhVien sinhvien;
    private int somonhoc;
    private MonHoc []mon= new MonHoc[this.somonhoc];

    public Phieu() {
        this.sinhvien= new SinhVien("","","",0);
        this.somonhoc=0;
        this.mon= new MonHoc[this.somonhoc];
    }

    public void setSomonhoc(int somonhoc) {
        this.somonhoc = somonhoc;
    }
    
    
    
    public void nhap()
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap thong tin cua sinh vien (Ma sinh vien, Ten sinh vien, Lop, khoa): ");
        this.sinhvien= new SinhVien(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextInt());
        /*do
        {
            System.out.println("nhap so luong mon hoc cua sinh vien nay: ");
            this.somonhoc= sc.nextInt();
        }while(this.somonhoc<0);*/
        //this.mon= new MonHoc[this.somonhoc];
        for(int i=0;i<this.somonhoc;i++)
        {
            System.out.println("nhap thong tin mon hoc thu: "+ (i+1));
            System.out.println("ban nhap (ten mon, so trinh, diem): ");
            mon[i]= new MonHoc(sc.nextLine(),sc.nextInt(),sc.nextDouble());
        }
        
    }
    
    public double tongDiem()
    {
        double tong=0;
        for(int i=0;i<this.somonhoc;i++)
        {
            tong+=this.mon[i].getDiem();
        }
        return tong;
    }
    
    public int tongTrinh()
    {
        int trinh=0;
        for(int i=0;i<this.somonhoc;i++)
        {
            trinh+=this.mon[i].getSotrinh();
        }
        return trinh;
    }
    
    public double diemTB()
    {
        return this.tongDiem()/this.tongTrinh();
    }
    
    public void xuat()
    {
        System.out.printf("%40s%n","PHIEU BAO DIEM");
        System.out.printf("%-15s%5%s%-10s%10s%n","Ma sinh vien: ",this.sinhvien.getMasv()," ","Ten sinh vien: ",this.sinhvien.getHoten());
        System.out.printf("%-5s%10s%-5s%-5s%5%-5s%5s%n","Lop: ",this.sinhvien.getLop(),"Khoa: ",this.sinhvien.getKhoa()," ","Diem TB",this.diemTB());
        MonHoc.tieude();
        for(int i=0;i<this.somonhoc;i++)
            mon[i].xuat();
    }
}
