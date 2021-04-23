/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * Dinh Van Quan
 */
public class CustomTable extends AbstractTableModel {
    
    //Khai bao name
    private String name[]={"Ma sinh vien","Ho ten sinh vien","Gioi tinh","Lop","So thich"};
    //khai bao kieu du lieu voi tung truong tuong ung
    private Class truong[]={String.class,String.class,String.class,String.class,String.class};
    //khai bao bien de truyen vao bang
    ArrayList<SinhVien> list= new ArrayList<SinhVien>();

    //phương thức khởi tạo cho class có tham số truyền vào.

    public CustomTable() {
        this.list=null;
    }
    
    
    public CustomTable(ArrayList<SinhVien> truyen) {
        this.list=truyen;
    }
    
    
    @Override
    public int getRowCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return list.size();
    }

    @Override
    public int getColumnCount() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return truong.length;
    }

    @Override
    public String getColumnName(int column) {
        return name[column];//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch(columnIndex)
        {
            case 0: return list.get(rowIndex).getMasv();
            case 1: return list.get(rowIndex).getHoten();
            case 2: return list.get(rowIndex).getGioitinh();
            case 3: return list.get(rowIndex).getLop();
            case 4: return list.get(rowIndex).getSothich();
            default: return null;
        }
    }
    
}
