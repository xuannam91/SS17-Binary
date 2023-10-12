package ra.user;

import java.io.Serializable;

public class User implements Serializable {

//    Tạo 1 class User có thể Serializable có các trường sau
//    int id
//    String username
//    String password
//    boolean status
//    Thực hiện ghi object này vào 1 file là 'user.dat'
//    Thực hiện đọc dữ liệu từ file này và in ra màn hình
//    Thực hiện đọc dữ liều file này nhưng mà ghi nội dung text vào file user.txt

    private static final long serialVersionUID = 473524819632753L;
    private int UserID;
    private String userName;
    private String password;
    private boolean status;

    public User() {
    }

    public User(int userID, String userName, String password, boolean status) {
        UserID = userID;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public int getUserID() {
        return UserID;
    }

    public void setUserID(int userID) {
        UserID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserID=" + UserID +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
