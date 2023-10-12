package ra.outputstream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class DemoOutStream {
    public static void main(String[] args) throws IOException {
        File output = new File("data.txt");
        if (output.createNewFile()) {
            FileOutputStream fileOutputStream = new FileOutputStream(output);
            DataOutputStream outputStream = new DataOutputStream(fileOutputStream);

            outputStream.writeInt(1000);
            outputStream.writeBoolean(true);
            outputStream.writeUTF("Hello Java");
            outputStream.close();
        } else {
            System.out.println(" có lỗi xảy ra khi tạo file");
        }
    }
}
