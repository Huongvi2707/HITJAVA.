import java.util.Scanner;

public class Manage {
    private String maQL;
    private String name;

    public Manage() {}
    public Manage(String maQL, String name) {
        this.name = name;
        this.maQL = maQL;
    }

    public String getMaQL() {
        return maQL;
    }
    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã quản lí: ");
        this.maQL = sc.nextLine();
        System.out.print("Nhập tên quản lí: ");
        this.name = sc.nextLine();
    }
    public void Xuat() {
        System.out.print("\nMã quản lí: " + getMaQL() + "\nTên quản lí: " + getName());
    }
}