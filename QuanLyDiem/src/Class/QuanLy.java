package Class;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLy extends HocSinh {

    public ArrayList<HocSinh> ds;
    public QuanLy() {
        ds=new ArrayList<HocSinh>(100);
    }
    public void themDanhSach(HocSinh hocSinh) {
        ds.add(hocSinh);
    }
    public void nhapDanhSach(Scanner sc) {
        HocSinh hocSinh;
        System.out.println("Nhập vào số lượng học sinh");
        int n =sc.nextInt();sc.nextLine();
        System.out.println("Nhập thông tin");
        for(int i=0;i<n;i++){
            System.out.println("Học sinh thứ "+(i+1)+":");
            hocSinh = new HocSinh();
            hocSinh.nhapThongTin(sc);
            themDanhSach(hocSinh);
    }

    // public static Scanner scanner = new Scanner(System.in);
    // public static void main(String[] args){
        // System.out.println("Mời nhập số lượng học sinh");
        // int soluong = scanner.nextInt();
        // ArrayList QuanLyHocSinh = new ArrayList<>(soluong);
    }
    public void hienThiDanhSach() {
        for (int i=0;i<ds.size();i++) {
            System.out.println();
            System.out.println("Học sinh thứ "+(i+1)+":");
            ds.get(i).hienthiThongTin();
            System.out.println();
        }
    }
}
