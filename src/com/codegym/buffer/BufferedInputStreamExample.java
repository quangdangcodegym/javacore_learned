package com.codegym.buffer;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class BufferedInputStreamExample {

    public static void main(String args[]) throws IOException {

        /**
        // Đọc file dùn lớp FileReader, dùng bộ đệm là mảng
        FileReader fileReader = new FileReader("filereader.txt");
        char[] chars = new char[3];
        String str = "";
        while(fileReader.read(chars)!=-1){
            str += toStringfromChars(chars);
        }
        System.out.println(str);


        // Đọc file dùng đến bộ đệm
        FileReader fileReaderBuffered = new FileReader("filereader_buffer.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReaderBuffered, 5);
        //int strBufferedReader = bufferedReader.read(); // Đọc được mã ASCI của N là 78
        String strLinebufferedReader = bufferedReader.readLine();   // Đọc được là Nguyễn Đại Triết

        System.out.println(strLinebufferedReader);


         //Đọc file nhị phân
         FileOutputStream fileOutputStream = new FileOutputStream("fileoutputstream.txt");
         fileOutputStream.write(78); // Chữ N mã ASCI 78 sẽ được lưu
         byte[] bytes  = {78,79};    // Chữ N=78, Chữ O=79
         fileOutputStream.write(bytes);
         fileOutputStream.close();




//        FileInputStream fileInputStream = new FileInputStream("ngoctrinh.jpg");
//        FileOutputStream fileOutputStream = new FileOutputStream("ngoctrinhNEW.jpg");
//        FileOutputStream fileOutputStream1 = new FileOutputStream("ngoctrinhNEWBinaryTest.txt");
//
//        byte[] bytes = new byte[128];
//        while (fileInputStream.read(bytes)!=-1){
//            fileOutputStream.write(bytes);
//            fileOutputStream1.write(bytes);
//        }
//        fileOutputStream.close();
//        fileInputStream.close();


        byte [] a = intToBytes(5);
        FileOutputStream fileOutputStream = new FileOutputStream("writebinary.txt");
        fileOutputStream.write(a);

        byte[] arr = intToBytes(5);


        FileInputStream fileInputStream = new FileInputStream("writebinary.txt");
//        byte [] b = fileInputStream.readAllBytes();
        int temp = -1;
        while ((temp=fileInputStream.read())!=-1){
            System.out.println(temp);
        }
//        System.out.println(convertByteArrayToInt(b));

         */


//        FileOutputStream fileOutputStream = new FileOutputStream("writebinary.txt");
//        fileOutputStream.write(99);

//        FileInputStream fileInputStream = new FileInputStream("ngoctrinhNEW.jpg");
//        FileOutputStream fileOutputStream = new FileOutputStream("ngoctrinhBinary.jpg");
//        int temp= -1;
//        byte[] bytes = new byte[100];
//        while ((temp = fileInputStream.read())!=-1){
//            fileOutputStream.write(temp);
//        }
//        byte[] bytes = new byte[100];
//        while (fileInputStream.read(bytes)!=-1){
//            fileOutputStream.write(bytes);
//        }
//        fileInputStream.close();
//        fileOutputStream.close();

//        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
//        Product p = new Product("Iphone X", 2000.0, 1);
//
//        byte[] arrBytes =  serialize(p);
//        fileOutputStream.write(arrBytes);
//        fileOutputStream.close();

       //Cach 1: doc het tat cac cac byte
//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//        byte[] arr = fileInputStream.readAllBytes();
//        try{
//            Product p1 = (Product) deserialize(arr);
//            System.out.println(p1);
//        }catch (Exception e){
//            System.out.println("Loi....");
//        }

        // Đọc từng byte
//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//        ArrayList<Integer> listBytes = new ArrayList<>();
//        try{
//            int temp = -1;
//            while((temp = fileInputStream.read())!=-1){
//               listBytes.add(temp);
//            }
//            Integer [] listIntegers = new Integer[listBytes.size()];
//            for(int i=0;i<listBytes.size();i++){
//                listIntegers[i] = listBytes.get(i);
//            }
//            Product p1 = (Product) deserialize(convertIntegersToBytes(listIntegers));
//            System.out.println(p1);
//        }catch (Exception e){
//            System.out.println("Loi....");
//            e.printStackTrace();
//        }

        // Tự làm thêm đọc theo nBuffered
//        FileInputStream fileInputStream = new FileInputStream("test.txt");
//        byte [] bytes = new byte[10];
//
//        ArrayList<Integer> listBytes = new ArrayList<>();
//        while (fileInputStream.r!=-1){
//
//        }


    }

    public static byte[] convertIntegersToBytes(Integer[] listIntegers) {
        byte[] listBytes = new byte[listIntegers.length];
        for (int i=0;i<listIntegers.length;i++){
            int temp = listIntegers[i];
            listBytes[i] = (byte) temp;

        }
        return listBytes;
    }
    public static Object deserialize(byte[] data) throws IOException, ClassNotFoundException {
        ByteArrayInputStream in = new ByteArrayInputStream(data);
        ObjectInputStream is = new ObjectInputStream(in);
        return is.readObject();
    }
    public static byte[] serialize(Object obj) throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream os = new ObjectOutputStream(out);
        os.writeObject(obj);
        return out.toByteArray();
    }
    private static  byte[] intToBytes( final int i ) {
        ByteBuffer bb = ByteBuffer.allocate(4);
        bb.putInt(i);
        return bb.array();
    }
    private static int convertByteArrayToInt(byte[] intBytes){
        ByteBuffer byteBuffer = ByteBuffer.wrap(intBytes);
        return byteBuffer.getInt();
    }

    public static String toStringfromChars(char[] chars){
        String str = "";
        for (int i=0;i<chars.length;i++){
            str += chars[i];
        }
        return str;
    }
}
