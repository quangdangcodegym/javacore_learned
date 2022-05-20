package com.codegym.abstract_interface;

abstract class XeDien{
    // Khai báo phương thức trừu tượng
    abstract void chay(); // Không có phần thân
    XeDien() {
        System.out.println("Contructor XeDien");
    }
}

class Vinfast extends XeDien{
    Vinfast() {
        System.out.println("Contructor Vinfast");
    }
    void chay(){
        System.out.println("Chạy ngon...");
    }
    public static void main(String args[]){
        XeDien xeDien = new Vinfast();
        xeDien.chay();

        XeDien xedienmoi = new XeDien() {
            @Override
            void chay() {
                System.out.println("Contructor xe dien moi");
            }
        };
        xedienmoi.chay();

    }
}