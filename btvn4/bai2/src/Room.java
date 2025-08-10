import java.util.Scanner;
import java.util.ArrayList;

public class Room {
    private String maPhong;
    private String tenPhong;
    private Double dienTich;
    private Manage x;
    private Integer n;
    private ArrayList<May> y = new ArrayList<> ();

    public Room() {
        x = new Manage();
        y = new ArrayList<> ();
    }

    public String getMaPhong() {
        return maPhong;
    }
    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public Double getDienTich() {
        return dienTich;
    }
    public void setDienTich(Double dienTich) {
        this.dienTich = dienTich;
    }

    public Manage getX() {
        return x;
    }
    public void setX(Manage x) {
        this.x = x;
    }

    public ArrayList<May> getY() {
        return y;
    }
    public void setY(ArrayList<May> y) {
        this.y = y;
    }

    public Integer getN() {
        return n;
    }
    public void setN(Integer n) {
        this.n = n;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phòng: ");
        this.maPhong = sc.nextLine();
        System.out.print("Nhập tên phòng: ");
        this.tenPhong = sc.nextLine();
        System.out.print("Nhập diện tích phòng: ");
        this.dienTich = sc.nextDouble();
        x.Nhap();
        System.out.print("Nhập số lượng máy của phòng: ");
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            May may = new May();
            System.out.print("Nhập thông tin máy thứ " + (i + 1));
            may.Nhap();
            y.add(may);
        }
    }
    public void Xuat() {
        System.out.print("Thông tin phòng máy" + "\nMã phòng: " + getMaPhong() + "\nTên phòng: " + getTenPhong() + "\nDiện tích: " + getDienTich());
        x.Xuat();
        System.out.print("\nThông tin máy trong phòng");
        for(May m : y) {
            m.Xuat();
        }
    }
}