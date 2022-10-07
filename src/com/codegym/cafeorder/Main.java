package com.codegym.cafeorder;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";

    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        // id: 1665110077 price: 30000

        updateProductView();

//        ArrayList<Product> list = getListProducts();
//        printProduct(list);
//
////        Table table1 = new Table(1, "Bàn 1");
////        Table table2 = new Table(2, "Bàn 2");
////        Table table3 = new Table(3, "Bàn 3");
////        Table table4 = new Table(4, "Bàn 4");
//

    }
    public static void updateProductView(){
        System.out.println("Nhập ID san pham muốn sửa");
        int id = Main.scanner.nextInt();
        System.out.println("Nhập giá muốn sửa");
        double price = Main.scanner.nextDouble();
        updateProduct(id, price);
    }
    public static  void updateProduct(int id, double price){
        ArrayList<Product> list = getListProducts();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                list.get(i).setPrice(price);
            }
        }
        saveListProducts(list);
    }
    public void updateProduct(int id, String name){
        ArrayList<Product> list = getListProducts();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId()==id){
                list.get(i).setName(name);
            }
        }
    }

    public void inputProductView(){
        Scanner scanner = new Scanner(System.in);
        showProducts(getListProducts());
        int id = (int) (System.currentTimeMillis()/1000);

        boolean checked = false;
        String name = "";
        do{
            System.out.println("Nhập tên: ");
            name = scanner.nextLine();
            checked = checkNameExists(name);
            if(checked){
                System.out.println("Tên sản phẩm này đẵ bị trùng. Vui lòng nhập lại");
            }
        }while (checked);


        double price = 23000.0;
        Product product = new Product(name, price, id);
        addProduct(product);
        showProducts(getListProducts());
    }

    private static boolean checkNameExists(String name) {
        ArrayList<Product> listProduct = getListProducts();
        for (Product p: listProduct) {
            if(p.getName().equalsIgnoreCase(name)){
                return true;
            }
        }
        return false;
    }

    public static void showProducts(ArrayList<Product> listProducts){
        System.out.printf("--------------------------------%n");
        System.out.printf("| Danh sách món                 |%n");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n", "CATEGORY", "NAME", "BITS");
        System.out.printf("--------------------------------%n");

        for (int i = 0; i < listProducts.size(); i++) {
            System.out.printf("| %2d | %-30s | %-8s |%n",listProducts.get(i).getId(), listProducts.get(i).getName(), listProducts.get(i).getPrice());
        }
        System.out.printf("--------------------------------%n");
    }
    public static void addProduct(Product product){
        ArrayList<Product> list = getListProducts();
        list.add(product);
        saveListProducts(list);
    }

    private static ArrayList<Product> getListProducts() {
        ArrayList<Product> listProduct = new ArrayList<>();
        File file = new File("product.txt");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine())!=null){
                // line chính là 1 Product: 1,Cafe Đen,12000
                String [] arr = line.split(",");
                String sId = arr[0];
                String sName = arr[1];
                String sPrice = arr[2];

                int id = Integer.parseInt(sId);
                double price = Double.parseDouble(sPrice);
                Product product = new Product(sName, price, id);
                listProduct.add(product);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return listProduct;
    }


    private static void saveListProducts(ArrayList<Product> list){
        File file = new File("product.txt");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            fileWriter.write(convertToString(list));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void printProduct(ArrayList<Product> listProduct){
        for(Product p : listProduct){
            System.out.printf("%d   %s   %f \n", p.getId(), p.getName(), p.getPrice());
        }
    }

    private static String convertToString(ArrayList<Product> listProduct){
        String str = "";
        for (int i=0;i<listProduct.size();i++){
            //1,Cafe Đen,12000
            str += listProduct.get(i).getId() + "," +
                    listProduct.get(i).getName() + "," +
                    listProduct.get(i).getPrice() + "\n";
        }
        return str;
    }
}
