package bt.bt01;

import java.io.Serializable;

import static bt.bt01.Main.sc;

public class Product implements Serializable {

    private static final long serialVersionUID = 664541842429424l;
    private int productID;
    private String productName;
    private String manufacturer;
    private double price;
    private String description;

    public Product() {
    }

    public Product(int productID, String productName, String manufacturer, double price, String description) {
        this.productID = productID;
        this.productName = productName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.description = description;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void input(){
        System.out.println("Thêm sản phẩm mới");
        System.out.println("Hãy nhập mã sản phẩm");
        this.productID = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập tên");
        this.productName = sc.nextLine();
        System.out.println("Hãng sản xuất");
        this.manufacturer = sc.nextLine();
        System.out.println("Nhập giá");
        this.price = Double.parseDouble(sc.nextLine());
        System.out.println("Mô tả");
        this.description = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}
