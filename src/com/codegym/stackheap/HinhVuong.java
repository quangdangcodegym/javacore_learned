package com.codegym.stackheap;

public class HinhVuong {
    public void chuVi() {
        System.out.println("chu vi");
    }

    public static void xinChaoHinhVuong(HinhVuong hinhVuong) {
        String s = "xin chao";
        String s1 = s;
        System.out.println(s);
        hinhVuong.chuVi();
    }

    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        // hinhVuong: biên tham chiếu
        // Class HinhVuong: kiểu dữ liệu hình vuông

        HinhVuong hinhVuong = new HinhVuong();

        System.out.println(hinhVuong);
        HinhVuong hinhVuong1 = hinhVuong;
        System.out.println(hinhVuong1);



        xinChaoHinhVuong(hinhVuong);
    }
}
