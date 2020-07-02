import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookFilter {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
                new Book("Things Fall Apart", 350, "Chenua Chebe"),
                new Book("Alice's Adventure in Wonderland", 190, "Lewis Carrol"),
                new Book("In The Chest of a Woman", 240, "Peggy Oppong")
        );

//        //wet method
//        //filter a list of books of long pages
//        List<Book> longNovelsandPages = findLongNovels(bookList);
//        System.out.println("List of books with Long pages.");
//        System.out.println(longNovelsandPages);
//
//        //filter by author
//        System.out.println("=======================================");
//        System.out.println(filterByAuthor(bookList, "Peggy Oppong"));

        //dry method using predicate
        List<Book> filterBooksByLength = filterBooks(bookList, new LengthOfNovelPredicate(200));
        List<Book> filterBooksByAuthor = filterBooks(bookList,new AuthorPredicate("Lewis Carrol"));
        System.out.println(filterBooksByLength);
        System.out.println(filterBooksByAuthor);

        //using Anonymous Class on the fly
        System.out.println("Anonymous: ");
        List<Book> filterBooksByAuthor2 = filterBooks(bookList, new BookPredicate() {
            @Override
            public boolean test(Book book) {
                return book.getAuthor().equals("Peggy Oppong");
            }
        });
        System.out.println(filterBooksByAuthor2);
    }

    public static class Book {
        private String name;
        private int pageCount;
        private String author;

        public Book(String name, int pageCount, String author) {
            this.name = name;
            this.pageCount = pageCount;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        @Override
        public String toString() {
            return String.format("Book{name='%s', page count='%d' author='%s'}, ", name, pageCount, author);
        }
    }

//    //finding novels with 200 pages and above
//    public static List<Book> findLongNovels(List<Book> books){
//        List<Book> result = new ArrayList<>();
//        for(Book book:books){
//            if (book.getPageCount() > 200){
//                result.add(book);
//            }
//        }
//        return result;
//    }
//
//    //filter books by author
//    public static List<Book> filterByAuthor(List<Book> bookList, String author){
//        List<Book> result = new ArrayList<>();
//        for (Book book: bookList){
//            if (author.equals(book.getAuthor())){
//                result.add(book);
//            }
//        }
//        return result;
//    }

    interface  BookPredicate{
        boolean test(Book book);
    }

    public static class LengthOfNovelPredicate implements BookPredicate{
        private int length;

        public LengthOfNovelPredicate(int length){
            this.length = length;
        }

        @Override
        public boolean test(Book book) {
            return book.getPageCount() > length;
        }
    }

    public static class AuthorPredicate implements BookPredicate{
        private String author;

        public AuthorPredicate(String author){
            this.author = author;
        }

        @Override
        public boolean test(Book book) {
            return author.equals(book.getAuthor());
        }
    }

    public static List<Book> filterBooks(List<Book> bookList, BookPredicate bookPredicate){
        List<Book> result = new ArrayList<>();
        for (Book book: bookList){
            if (bookPredicate.test(book)){
                result.add(book);
            }
        }
        return result;
    }
}
