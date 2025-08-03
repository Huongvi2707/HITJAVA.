public class Student {
    private String ten;
    private int namSinh;
    private String diaChi;
    private double TX1;
    private double TX2;
    private double KTHP;
    private int soTietNghi;

    public Student(String ten, int namSinh, String diaChi, double TX1, double TX2, double KTHP, int soTietNghi) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.diaChi = diaChi;
        this.TX1 = TX1;
        this.TX2 = TX2;
        this.KTHP = KTHP;
        this.soTietNghi = soTietNghi;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return 2025 - namSinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public double getTX1() {
        return TX1;
    }

    public double getTX2() {
        return TX2;
    }

    public double getKTHP() {
        return KTHP;
    }

    public double getGPA() {
        return TX1 * 0.2 + TX2 * 0.3 + KTHP * 0.5;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void inThongTin() {
        System.out.printf("%-25s %-5d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-10d\n",
                ten, getTuoi(), diaChi, TX1, TX2, KTHP, getGPA(), soTietNghi);
    }
}