package nested.test.ex1;

import java.util.List;

public class Library {
    private Book[] books;
    private int bookCount;


    public Library(int num) {
        books = new Book[num];
        bookCount = 0;

    }



    private class Book {
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        @Override
        public String toString() {
            return "도서 제목=" + title + ", 저자=" + author;
        }
    }

    public void addBook(String book, String author) {

        if (books.length > bookCount) {
            books[bookCount++] = new Book(book,author);
        }
        else {
            System.out.println("도서관 저장 공간이 부족합니다.");
        }
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println(book);
        }

    }


}
