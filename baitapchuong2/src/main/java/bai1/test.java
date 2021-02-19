/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class test {
    
    /*public void xuat(int a[])
    {
        
    }*/
    
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        
        int []a= new int[10];
        
        //cap phat bo nho cho tung phan tu o ben trong mang
        /*
        for(int i=0;i<10;i++)
        {
            a[i]=0;
        }
        */
        for(int i=0;i<10;i++)
        {
            a[i]= r.nextInt();
        }
        
        System.out.println("bien duoc tao boi random la: ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"   ");
        }
    }
}
