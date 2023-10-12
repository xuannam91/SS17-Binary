package ra.inputstream;

import java.io.*;

public class DemoinputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        DataInputStream inputStream = new DataInputStream(fileInputStream);
        System.out.println("Đọc từ file data.txt");
        System.out.println(inputStream.readInt());
        System.out.println(inputStream.readBoolean());
        System.out.println(inputStream.readUTF());
    }
}
