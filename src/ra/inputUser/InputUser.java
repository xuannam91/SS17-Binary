package ra.inputUser;

import ra.user.User;

import java.io.*;

public class InputUser {
    public static void main(String[] args) throws IOException {
        File usertxt = new File("user.txt");
        BufferedWriter writer = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("user.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            FileWriter fileWriter = new FileWriter(usertxt);
            writer = new BufferedWriter(fileWriter);

            User user = (User) inputStream.readObject();

            while (true) {
                System.out.println(user);
                writer.write(user.toString());
                writer.newLine();
                user = (User) inputStream.readObject();

            }
         
        } catch (IOException e) {

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {

        }finally {
            writer.close();
        }

    }
}
