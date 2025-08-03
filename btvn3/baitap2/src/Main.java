import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Student> danhSach = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void khoiTaoMau() {
        danhSach.add(new Student("Trần Thị Hương Vi", 2006, "Bắc Ninh", 9, 9, 9, 0));
        danhSach.add(new Student("Phan Mai Hương", 2006, "Hà Nội", 8.5, 8.5, 8.5, 1));
        danhSach.add(new Student("Nguyễn Thị Ngọc Hà", 2006, "Bắc Ninh", 8.5, 8.5, 8, 2));
        danhSach.add(new Student("Nguyễn Như Quỳnh", 2005, "Hà Giang", 8, 7, 8.5, 3));
        danhSach.add(new Student("Trần Thị Ngân Phương", 2005, "Bắc Ninh", 8, 8, 8, 1));
    }

    public static void themSinhVien() {
        System.out.print("Nhập tên: ");
        String ten = scanner.nextLine();
        System.out.print("Năm sinh: ");
        int namSinh = Integer.parseInt(scanner.nextLine());
        System.out.print("Địa chỉ: ");
        String diaChi = scanner.nextLine();
        System.out.print("Điểm TX1: ");
        double tx1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Điểm TX2: ");
        double tx2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Điểm KTHP: ");
        double kthp = Double.parseDouble(scanner.nextLine());
        System.out.print("Số tiết nghỉ: ");
        int soTietNghi = Integer.parseInt(scanner.nextLine());

        danhSach.add(new Student(ten, namSinh, diaChi, tx1, tx2, kthp, soTietNghi));
        System.out.println("Đã thêm sinh viên thành công!");
    }

    public static void suaSinhVien() {
        System.out.print("Nhập tên sinh viên cần sửa: ");
        String tenTim = scanner.nextLine();

        for (Student sv : danhSach) {
            if (sv.getTen().equalsIgnoreCase(tenTim)) {
                System.out.println("Đang sửa sinh viên: " + sv.getTen());

                System.out.print("Sửa địa chỉ (hiện tại: " + sv.getDiaChi() + "): ");
                String diaChi = scanner.nextLine();
                if (!diaChi.isEmpty()) sv.setDiaChi(diaChi);

                System.out.print("Sửa điểm TX1 (hiện tại: " + sv.getTX1() + "): ");
                String tx1 = scanner.nextLine();
                if (!tx1.isEmpty()) sv.setTX1(Double.parseDouble(tx1));

                System.out.print("Sửa điểm TX2 (hiện tại: " + sv.getTX2() + "): ");
                String tx2 = scanner.nextLine();
                if (!tx2.isEmpty()) sv.setTX2(Double.parseDouble(tx2));

                System.out.print("Sửa điểm KTHP (hiện tại: " + sv.getKTHP() + "): ");
                String kthp = scanner.nextLine();
                if (!kthp.isEmpty()) sv.setKTHP(Double.parseDouble(kthp));

                System.out.print("Sửa số tiết nghỉ (hiện tại: " + sv.getSoTietNghi() + "): ");
                String soTietNghi = scanner.nextLine();
                if (!soTietNghi.isEmpty()) sv.setSoTietNghi(Integer.parseInt(soTietNghi));

                System.out.println("Đã sửa thông tin sinh viên.");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên có tên " + tenTim);
    }

    public static void xoaSinhVien() {
        System.out.print("Nhập tên sinh viên cần xóa: ");
        String tenXoa = scanner.nextLine();
        boolean removed = danhSach.removeIf(sv -> sv.getTen().equalsIgnoreCase(tenXoa));
        if (removed) System.out.println("Đã xóa sinh viên " + tenXoa);
        else System.out.println("Không tìm thấy sinh viên cần xóa.");
    }

    public static void sapXepTheoTuoi() {
        danhSach.sort(Comparator.comparingInt(Student::getTuoi));
        System.out.println("Đã sắp xếp theo tuổi.");
    }

    public static void sapXepTheoGPA() {
        danhSach.sort(Comparator.comparingDouble(Student::getGPA).reversed());
        System.out.println("Đã sắp xếp theo GPA.");
    }

    public static void sapXepTheoSoTietNghi() {
        danhSach.sort(Comparator.comparingInt(Student::getSoTietNghi));
        System.out.println("Đã sắp xếp theo số tiết nghỉ.");
    }

    public static void hienThiDanhSach() {
        System.out.printf("%-25s %-5s %-12s %-10s %-10s %-12s %-10s %-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");
        for (Student sv : danhSach) {
            sv.inThongTin();
        }
    }

    public static void main(String[] args) {
        khoiTaoMau();

        while (true) {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Sắp xếp theo tuổi");
            System.out.println("5. Sắp xếp theo GPA");
            System.out.println("6. Sắp xếp theo số tiết nghỉ");
            System.out.println("7. Hiển thị danh sách sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Chọn chức năng: ");

            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số hợp lệ!");
                continue;
            }

            switch (choice) {
                case 1:
                    themSinhVien();
                    break;
                case 2:
                    suaSinhVien();
                    break;
                case 3:
                    xoaSinhVien();
                    break;
                case 4:
                    sapXepTheoTuoi();
                    break;
                case 5:
                    sapXepTheoGPA();
                    break;
                case 6:
                    sapXepTheoSoTietNghi();
                    break;
                case 7:
                    hienThiDanhSach();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại!");
            }
        }
    }
}
