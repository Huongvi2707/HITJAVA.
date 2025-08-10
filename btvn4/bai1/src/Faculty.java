import java.util.Scanner;

public class Faculty {
    private String facultyName;
    private String date;
    private School x;

    public Faculty() {
        x = new School();
    }
    public Faculty(String facultyName, String date) {
        x = new School();
        this.date = date;
        this.facultyName = facultyName;
    }

    public String getFacultyName() {
        return facultyName;
    }
    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public School getX() {
        return x;
    }
    public void setX(School x) {
        this.x = x;
    }

    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        x.nhap();
        System.out.print("Nhập tên khoa: ");
        this.facultyName = sc.nextLine();
        System.out.print("Nhập ngày vào khoa: ");
        this.date = sc.nextLine();
    }

    public void Xuat() {
        x.xuat();
        System.out.print("\nKhoa: " + getFacultyName() + "\nNgày vào khoa: " + getDate() + "\n");
    }
}
