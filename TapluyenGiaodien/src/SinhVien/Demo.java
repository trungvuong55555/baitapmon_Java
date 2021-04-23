/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.ArrayList;

/**
 *
 * Dinh Van Quan
 */
public class Demo {
    public static void main(String[] args) {
        SinhVien a1= new SinhVien("a1","Quan","Nam","KHMT2","");
        SinhVien a2= new SinhVien("a2","Phuong","Nu","KHMT1","Nau an");
        ArrayList<SinhVien> list = new ArrayList<SinhVien>();
        list.add(a1);
        list.add(a2);
        
        System.out.println("list get:  "+ list.get(1).getHoten());
    }
}
