import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Student> danhSach = new ArrayList<> ();
        System.out.print("Nhập số lượng học sinh muốn nhập thông tin: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++) {
            Student s = new Student();
            System.out.println("Nhập thông tin cho học sinh thứ " + (i + 1));
            s.nhap();
            danhSach.add(s);
        }
        int j = 1;
        for(Student x : danhSach) {
            System.out.println("Thông tin sinh viên thứ " + j);
            x.xuat();
            ++j;
        }
    }
}