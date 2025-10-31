import classes.Books;
import classes.Library;
import classes.Members;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Books book = new Books();
        Members member =new Members();
        Library library = new Library();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name= sc.nextLine();
        member.setName(name);



    }
}