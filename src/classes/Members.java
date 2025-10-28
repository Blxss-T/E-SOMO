package classes;

import java.sql.Struct;
import java.util.ArrayList;

public class Members {
    private int id;
    private String name;
    ArrayList<Books> borrowedBooks ;
    public Members(){}

    public Members(int id, String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<Books>();
    }
    public void displayInfo(){
        System.out.println("ID"+id+"Name"+name+"Borrowed"+borrowedBooks);
    }
    public void borrowBook(Books book) throws BookUnavailableException{
        if(book.isBorrowed()){
            book.setBorrowed(true);
            borrowedBooks.add(book);
            System.out.println(name+" borrowed"+book.getTitle());
        }else {
          throw new BookUnavailableException ("Sorry "+book.getTitle()+" is already borrowed");
        }
    }
    public void returnBook(Books book) throws BookUnavailableException{
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
            for(Books b:borrowedBooks){
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

    public ArrayList<Books> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(ArrayList<Books> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }
}
