package bt.bt01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileObject {
    public static final String FILENAME = "src/bt/bt01/product.txt";
    public static void outputFileObject(List<Product> list){
        File file = new File(FILENAME);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            System.out.println("Ghi thành công");
        }catch (FileNotFoundException e){
            System.out.println("Không tìm thấy file");
        }catch (IOException e){
            System.out.println("Có lỗi khi ghi file");
        }
    }

    public static List<Product> importFileToList() {
        List<Product> productList = new ArrayList<>();
        try {
            File file = new File(FILENAME);
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            productList = (List<Product>) objectInputStream.readObject();
            System.out.println("Đã nạp thành công");
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file");
        } catch (ClassCastException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}
