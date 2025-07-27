import java.util.Scanner;
public class Bai3 {
    public static String check(int a, int b, int c) {
        if(a + b == c)
            return "đúng";
        else
            return "sai";
    }
    public static void duDoan(int a, int b, int c) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Phép toán của bạn là: " + a + " + " + b + " = " + c + "\n");
        System.out.print("Dự đoán kết quả đúng/sai: ");
        String s = sc.nextLine();
        if(s.equals(check(a, b, c)))
            System.out.print("Bạn dự đoán đúng");
        else
            System.out.print("Bạn dự đoán sai");
    }
    public static void main(String[] args) {
        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);
        int c = (int) (Math.random() * 201);
        duDoan(a, b, c);
    }
}
