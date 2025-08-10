import java.util.Scanner;

public class School {
    private String schoolName;
    private String date;

    public School() {}
    public School(String date, String name) {
        this.date = date;
        this.schoolName = name;
    }

    public String getSchoolName() {
        return schoolName;
    }
    public void setName(String name) {
        this.schoolName = name;
    }

    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên trường: ");
        this.schoolName = sc.nextLine();
        System.out.print("Nhập ngày vào trường: ");
        this.date = sc.nextLine();
    }
    public void xuat() {
        System.out.print("\nTrường: " + getSchoolName() + "\nNgày vào trường: " + getDate());
    }
}
