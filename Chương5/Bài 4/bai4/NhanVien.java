/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class NhanVien {
    private String hoten,namsinh,diachi;
    private double tienluong;
    private int tonggiolam;

    public NhanVien() {
    }

    public NhanVien(String hoten, String namsinh, String diachi, double tienluong, int tonggiolam) {
        this.hoten = hoten;
        this.namsinh = namsinh;
        this.diachi = diachi;
        this.tienluong = tienluong;
        this.tonggiolam = tonggiolam;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getTienluong() {
        return tienluong;
    }

    public void setTienluong(double tienluong) {
        this.tienluong = tienluong;
    }

    public int getTonggiolam() {
        return tonggiolam;
    }

    public void setTonggiolam(int tonggiolam) {
        this.tonggiolam = tonggiolam;
    }
    public void inputInfo(){
        Scanner sc=new Scanner (System.in);
        System.out.println("Nhap ho ten: ");this.hoten=sc.nextLine();
        System.out.println("Nhap nam sinh: ");this.namsinh=sc.nextLine();
        System.out.println("Nhap dia chi: ");this.diachi=sc.nextLine();
        
        System.out.println("Nhap tien luong: ");this.tienluong=sc.nextDouble();
        System.out.println("Nhap tong gio lam: ");this.tonggiolam=sc.nextInt();
    }

    @Override
    public String toString() {
        return "NhanVien{" + "hoten=" + hoten + ", namsinh=" + namsinh + ", diachi=" + diachi + ", tienluong=" + tienluong + ", tonggiolam=" + tonggiolam + ", thinhthuong=" + tinhThuong() + '}';
    }
    
    
    
    public void prinInfo(){
        System.out.println(this.toString());
    }
    
    public double tinhThuong(){
        if(this.tonggiolam>=200){
            return this.tienluong*0.2;
        }else if(this.tonggiolam>=100){
            return this.tienluong*0.1;
        }
        else{
            return 0;
        }
    }
}
