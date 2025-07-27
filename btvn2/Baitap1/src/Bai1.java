import java.util.Scanner;
public class Bai1 {
    final static String s = "square";
    final static String c = "circle";
    final static String t = "triangle";
    final static double PI = 3.14;
    public static double hinhVuong(double a) {
        return a * a;
    }
    public static double hinhTamGiac(double a, double h) {
        return 0.5 * a * h;
    }
    public static double hinhTron(double r) {
        return PI * r * r;
    }
    public static void check(String type) {
        Scanner sc = new Scanner(System.in);
        if(type.equalsIgnoreCase(s)) {
            System.out.print("Nhập vào độ dài cạnh của hình vuông: ");
            double a = sc.nextDouble();
            System.out.print("Diện tích hình vuông là: " + hinhVuong(a) + " đvdt");
        }
        else if(type.equalsIgnoreCase(c)) {
            System.out.print("Nhập vào bán kính của hình tròn: ");
            double r = sc.nextDouble();
            System.out.print("Diện tích của hình tròn là: " + hinhTron(r) + " đvdt");
        }
        else if(type.equalsIgnoreCase(t)) {
            System.out.print("Nhập vào độ dài của cạnh đáy: ");
            double b = sc.nextDouble();
            System.out.print("Nhập vào độ dài của chiều cao: ");
            double h = sc.nextDouble();
            System.out.print("Diện tích hình tam giác là: " + hinhTamGiac(b, h) + " đvdt");
        }
        else
            System.out.print("Hình dạng không hợp lệ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        check(type);
    }
}
