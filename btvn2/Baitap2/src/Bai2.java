import java.util.Scanner;
public class Bai2 {
    public static String nhap() {
        System.out.print("Nhập vào một chuỗi: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        return s;
    }
    public static boolean check(String s) {
        String s1 = "";
        for(int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }
        if(s.equalsIgnoreCase(s1))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String s = nhap();
        String s1 = s.trim();
        if(check(s1)) {
            System.out.println(s.toUpperCase());
            System.out.print("Chuỗi đối xứng");
        }
        else {
            System.out.println(s.toLowerCase());
            System.out.print("Chuỗi này không đối xứng");
        }
    }
}
