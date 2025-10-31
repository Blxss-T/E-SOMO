package classes;

import java.util.ArrayList;

public class Member {
    private int id;
    private String name;
    private ArrayList<Book> borrowedBooks ;
    public Member(){}

    public Member(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }
    public void displayInfo(){
        System.out.println("ID"+id+"Name"+name+"Borrowed"+borrowedBooks);
    }
    public void borrowBook(Book book) throws BookUnavailableException{
        if(book.isBorrowed()){
            book.setBorrowed(true);
            borrowedBooks.add(book);
            System.out.println(name+" borrowed"+book.getTitle());
        }else {
          throw new BookUnavailableException ("Sorry "+book.getTitle()+" is already borrowed");
        }
    }
    public void returnBook(Book book) throws BookUnavailableException{
        if(borrowedBooks.contains(book)){
            book.setBorrowed(false);
            borrowedBooks.remove(book);
            System.out.println(book.getTitle()+" has been successfully returned");
        }else{
            throw new BookUnavailableException("Book non existant");
        }
    }
    public void displayBorrowed() throws BookUnavailableException{
        if (borrowedBooks.isEmpty()){
            System.out.println("You have not borrowed nay books");
        }else{
            System.out.println(name+"'s borrowed books:");
            for(Book b:borrowedBooks){
                System.out.println("-"+b.getTitle()+ " by" +b.getAuthor());
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
