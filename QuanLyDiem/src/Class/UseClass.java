package Class;

import java.util.Scanner;

public class UseClass extends HocSinh {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        QuanLy ql =new QuanLy();
        ql.nhapDanhSach(sc);
        System.out.println("Danh sách học sinh là: ");
        ql.hienThiDanhSach();
        sc.close();
    }
}
