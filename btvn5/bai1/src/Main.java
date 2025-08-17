import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Book> danhSach = new ArrayList<> ();
        Library library = new Library(danhSach);
        System.out.println("---------CHỨC NĂNG---------");
        System.out.println("1. Thêm sách vào thư viện");
        System.out.println("2. Hiển thị danh sách sách");
        System.out.println("3. Tìm sách theo tên tác giả");
        System.out.println("4. Xóa sách theo mã sách và hiển thị kết quả");
        System.out.println("5. Thoát");
        while(true) {
            int choose;
            do {
                System.out.print("Nhập vào lựa chọn của bạn: ");
                choose = sc.nextInt();
            }
            while(choose > 5 || choose < 1);
            switch(choose) {
                case 1:
                    System.out.print("Nhập số lượng sách muốn thêm: ");
                    int soLuong = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Bạn có muốn nhập nhà xuất bản không (Có/Không): ");
                    String luaChon = sc.nextLine();
                    if(luaChon.equalsIgnoreCase("Có")) {
                        for(int i = 1; i <= soLuong; i++) {
                            System.out.println("Thông tin sách " + i);
                            System.out.print("Nhập tên nhà sản xuất: ");
                            String name = sc.nextLine();
                            System.out.print("Nhập địa chỉ: ");
                            String address = sc.nextLine();
                            System.out.print("Nhập tiêu đề sách: ");
                            String title = sc.nextLine();
                            System.out.print("Nhập tên tác giả: ");
                            String author = sc.nextLine();
                            System.out.print("Nhập giá sách: ");
                            double price = sc.nextDouble();
                            sc.nextLine();
                            library.addBook(new Book(title, author, price, new Publisher(name, address)));
                        }
                    }
                    else if(luaChon.equalsIgnoreCase("Không")) {
                        for(int i = 1; i <= soLuong; i++) {
                            System.out.println("Thông tin sách " + i);
                            System.out.print("Nhập tiêu đề sách: ");
                            String title = sc.nextLine();
                            System.out.print("Nhập tên tác giả: ");
                            String author = sc.nextLine();
                            System.out.print("Nhập giá sách: ");
                            double price = sc.nextDouble();
                            sc.nextLine();
                            library.addBook(new Book(title, author, price));
                        }
                    }
                    else
                        System.out.println("Lựa chọn không đúng");
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Bạn có muốn hiển thị thông tin nhà xuất bản không (Có/Không): ");
                    String luaChon1 = sc.nextLine();
                    if(luaChon1.equalsIgnoreCase("Có")) {
                        System.out.println("---------DANH SÁCH SÁCH---------");
                        library.displayAllBooks(true);
                    }
                    else if(luaChon1.equalsIgnoreCase("Không")) {
                        System.out.println("---------DANH SÁCH SÁCH---------");
                        library.displayAllBooks(false);
                    }
                    else
                        System.out.println("Lụa chọn không đúng");
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Nhập tên tác giả của sách muốn tìm kiếm: ");
                    String author = sc.nextLine();
                    library.searchByAuthor(author);
                    break;
                case 4:
                    System.out.print("Nhập mã sách muốn xóa: ");
                    int maSach = sc.nextInt();
                    library.removeBookById(maSach);
                    break;
                case 5:
                    return;
            }
        }
    }
}