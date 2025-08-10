import java.util.Scanner;

public class Student {
    private String studentName;
    private String Class;
    private double score;
    private Faculty y;

    public Student() {
        y = new Faculty();
    }
    public Student(String studentName, String Class, double score) {
        this.studentName = studentName;
        this.Class = Class;
        this.score = score;
        y = new Faculty();
    }

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getclass() {
        return Class;
    }
    public void setclass(String Class) {
        this.Class = Class;
    }

    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }

    public Faculty getY() {
        return y;
    }
    public void setY(Faculty y) {
        this.y = y;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên học sinh: ");
        this.studentName = sc.nextLine();
        System.out.print("Nhập tên lớp: ");
        this.Class = sc.nextLine();
        System.out.print("Nhập điểm số của học sinh: ");
        this.score = sc.nextDouble();
        y.Nhap();
    }
    public void xuat() {
        System.out.print("Tên học sinh: " + getStudentName() + "\nLớp: " + getclass() + "\nĐiểm số: " + getScore());
        y.Xuat();
    }
}
