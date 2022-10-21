package Class;

import java.util.Scanner;

public class HocSinh {
    private String hoTen;
    private int diem;
    public HocSinh() {}
    public HocSinh(String hoTen, int diem) {
        this.hoTen=hoTen;
        this.diem=diem;
    }
    public void nhapThongTin(Scanner sc){
        System.out.println("Nhập tên học sinh: ");
        hoTen=sc.nextLine();
        System.out.println("Nhập điểm: ");
        diem=sc.nextInt();sc.nextLine();
    }
    public void hienthiThongTin() {
        System.out.println("Họ tên: "+hoTen);
        System.out.println("Điểm: "+diem);
    }
}
