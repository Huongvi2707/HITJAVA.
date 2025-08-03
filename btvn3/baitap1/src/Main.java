public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Trần Thị Hương Vi", 2006, "Bắc Ninh", 9, 9, 9, 0);
        Student s2 = new Student("Phan Mai Hương", 2006, "Hà Nội", 8.5, 8.5, 8.5, 1);
        Student s3 = new Student("Nguyễn Thị Ngọc Hà", 2006, "Bắc Ninh", 8.5, 8.5, 8, 2);
        Student s4 = new Student("Nguyễn Như Quỳnh", 2005, "Hà Giang", 8, 7, 8.5, 3);
        Student s5 = new Student("Trần Thị Ngân Phương", 2005, "Bắc Ninh", 8, 8, 8, 1);

        System.out.printf("%-25s %-5s %-12s %-10s %-10s %-12s %-10s %-10s\n",
                "Tên", "Tuổi", "Địa chỉ", "TX1", "TX2", "KTHP", "GPA", "Nghỉ");

        s1.inThongTin();
        s2.inThongTin();
        s3.inThongTin();
        s4.inThongTin();
        s5.inThongTin();
    }
}