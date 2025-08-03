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
        return 2025 - namSinh;  // hoặc lấy năm hiện tại
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTX1() {
        return TX1;
    }

    public void setTX1(double TX1) {
        this.TX1 = TX1;
    }

    public double getTX2() {
        return TX2;
    }

    public void setTX2(double TX2) {
        this.TX2 = TX2;
    }

    public double getKTHP() {
        return KTHP;
    }

    public void setKTHP(double KTHP) {
        this.KTHP = KTHP;
    }

    public int getSoTietNghi() {
        return soTietNghi;
    }

    public void setSoTietNghi(int soTietNghi) {
        this.soTietNghi = soTietNghi;
    }

    public double getGPA() {
        return TX1 * 0.2 + TX2 * 0.3 + KTHP * 0.5;
    }

    public void inThongTin() {
        System.out.printf("%-25s %-5d %-12s %-10.2f %-10.2f %-12.2f %-10.2f %-10d\n",
                ten, getTuoi(), diaChi, TX1, TX2, KTHP, getGPA(), soTietNghi);
    }
}
