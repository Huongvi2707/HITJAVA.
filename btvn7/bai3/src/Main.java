import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student("S1", "Vi", 19, "vi@gmail.com", "CNTT", "Hanoi", 8.0));
        manager.addStudent(new Student("S2", "Hà", 19, "ha@gmail.com", "CNTT", "BacNinh", 7.0));
        manager.addStudent(new Student("S3", "Phương", 18, "phuong@gmail.com", "CNTT", "Haiphong", 6.2));

        int choice;
        do {
            System.out.println("\n===== MENU QUẢN LÝ SINH VIÊN =====");
            System.out.println("1. In danh sách sinh viên");
            System.out.println("2. Sắp xếp theo Score giảm dần");
            System.out.println("3. Sắp xếp theo Score tăng dần");
            System.out.println("4. Tìm sinh viên theo tên");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    manager.printStudents();
                    break;
                case 2:
                    manager.sortByScoreDesc();
                    break;
                case 3:
                    manager.sortByScoreAsc();
                    break;
                case 4:
                    System.out.print("Nhập tên cần tìm: ");
                    String name = sc.nextLine();
                    Student found = manager.findByName(name);
                    if (found != null) {
                        System.out.printf("Tìm thấy: %s | %s | %.2f | Grade: %s%n",
                                found.getId(), found.getName(), found.getScore(), found.getGrade());
                    } else {
                        System.out.println("Không tìm thấy sinh viên!");
                    }
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }

        } while (choice != 0);

        sc.close();
    }
}
