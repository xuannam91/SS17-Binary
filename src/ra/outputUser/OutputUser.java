package ra.outputUser;

import ra.user.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class OutputUser {
    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();
        User user1 = new User(1, "Nam", "xuan nam", true);
        User user2 = new User(2, "Minh", "haha", true);
        User user3 = new User(3, "Dung", "hihi", true);
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        File outputUser = new File("user.dat");

        if(outputUser.createNewFile() ){
            FileOutputStream fileOutputStream = new FileOutputStream(outputUser);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            for (User user:userList) {
                outputStream.writeObject(user);
            }
        }else {
            System.out.println("tạo file không thành công");
        }
    }
}
