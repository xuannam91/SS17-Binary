package bt.bt01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static bt.bt01.FileObject.importFileToList;
import static bt.bt01.FileObject.outputFileObject;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static List<Product> productList = importFileToList();
    public static void main(String[] args) {

        int choice;
        do {
            System.out.println("=====MENU=====");
            System.out.println("1.Thêm vào sản phẩm mới");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3.Tìm kiếm theo tên");
            System.out.println("4.Thoát và in ra file");
            System.out.println("Hãy lựa chọn");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    outputFileObject(productList);
                    System.exit(0);
            }
        } while (true);
    }
    public static void add(){
        Product newProduct = new Product();
        newProduct.input();
        productList.add(newProduct);
    }
    public static void display(){
        for (Product p: productList) {
            System.out.println(p.toString());
        }
    }
    public static void search(){
        System.out.println("Nhập tên cần tìm kiếm");
        String naneSearch = sc.nextLine();
        boolean check = false;
        Product productsearch = new Product();
        for (Product p: productList) {
            if(p.getProductName().equalsIgnoreCase(naneSearch)){
                productsearch = p;
                check = true;
            }
        }
        if(check){
            System.out.println(productsearch.toString());
        }else {
            System.out.println("Không tìm thấy");
        }
    }
}
