import java.util.ArrayList;

public class Library {
    private ArrayList<Book> danhSach;

    public Library(ArrayList danhSach) {
        this.danhSach = danhSach;
    }

    public ArrayList getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(ArrayList danhSach) {
        this.danhSach = danhSach;
    }

    public void addBook(Book book) {
        this.danhSach.add(book);
    }

    public void displayAllBooks(boolean showPublisher) {
        if(danhSach.isEmpty()) {
            System.out.print("Thư viện không có sách\n");
            return;
        }
        for(Book book : danhSach) {
            book.displayInfo(showPublisher);
        }
    }

    public void searchByAuthor(String author) {
        boolean find = false;
        for (Book book : danhSach) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                System.out.println("Sách của tác giả " + author);
                book.displayInfo(true);
                find = true;
            }
        }
        if(!find)
            System.out.println("Không tìm thấy sách của tác giả " + author);
    }

    public void removeBookById(int bookId) {
        boolean find = false;
        Book Remove = new Book();
        for(Book book : danhSach) {
            if(bookId == book.getBookId()) {
                Remove = book;
                find = true;
                break;
            }
        }
        if(!find)
            System.out.println("Không có mã sách phù hợp để xóa");
        else {
            danhSach.remove(Remove);
            System.out.println("Danh sách còn lại ");
            displayAllBooks(true);
        }
    }
}