import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi ký tự: ");
        String input = sc.nextLine();

        ChuoiKiTu sa = new ChuoiKiTu(input);

        System.out.println("Số nguyên âm: " + sa.demNguyenAm());
        System.out.println("Số ký tự in hoa: " + sa.demInHoa());
    }
}
