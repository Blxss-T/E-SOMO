import classes.Book;
import classes.Books;
import classes.Library;
import classes.Member;
import classes.Members;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        Member member =new Member();
        Library library = new Library();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        member.setName(name);
        System.out.println("What book do u want to borrow?");
         String borrowBook=sc.nextLine();
         member.borrowBook();


    }
}