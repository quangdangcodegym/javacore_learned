package com.codegym.debug_try_catch;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchMain {
    public static void main(String[] args) {

        /**



         //        int [] list = {3,6,7,9};
         //        list[9] = 5;

         // sPrice: "23000"

         // Sẽ sinh ra lỗi: NumberFormatException –
         // if the string does not contain a parsable double
         //        String sPrice = "kaka";
         ////        double price = Double.parseDouble(sPrice);
         ////        System.out.println("Price: " + price);
         //
         //        sPrice = null;
         //        // Sẽ sinh ra lỗi: NullPointerException – if the string is null
         //        double price1 = Double.parseDouble(sPrice);
         //        System.out.println("Price: " + price1);


         //        String fileName = "D:\\CODEGYM\\CODEGYM\\BASE\\javacore_learned\\Hello.txt";
         //        //fileName = nulll;
         //        File file = new File(fileName);
         //FileWriter fileWriter = new FileWriter(file);

         //fileWriter.write("Hello C7");


         // Try catch với nhiều exception
         //        Scanner scanner = new Scanner(System.in);
         //        try {
         //            int a = scanner.nextInt();
         //        }catch (InputMismatchException e){
         //            System.out.printf("Loi roi phai nhap so");
         //        }catch (Exception ex){
         //            System.out.printf("Loi roi ban oi");
         //        }
         //
         Scanner scanner = new Scanner(System.in);
         String name ="Thanh Hoan";
         double price = 23000.0;
         int amout = 2;
         Product product = new Product(name, price, amout);

         // writeFileTryCatch(product);
         try {
         writeFileThrows(product);
         }catch (IOException ex){
         System.out.printf("Xu ly loi voi throw và throws");
         }catch (ArrayIndexOutOfBoundsException arrEx){
         System.out.printf("Vượt quá mảng rồi bạn ơi");
         }
         */
//


    }

    private static void writeFileThrows(Product product) throws IOException, ArrayIndexOutOfBoundsException {
        File file = new File("product.txt");


        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(product.toString());
        fileWriter.close();


        int[] list = {3, 4, 6};
        throw new ArrayIndexOutOfBoundsException();
//        list[10]  = 9; // Dòng này ném ra lỗi  ArrayIndexOutOfBoundsException
    }

    private static void writeFileTryCatch(Product product) {

        File file = new File("product.txt");

        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(product.toString());
            fileWriter.close();
        } catch (IOException ioEx) {
            System.out.println("Lỗi đọc ghi File");
        }


    }


}
