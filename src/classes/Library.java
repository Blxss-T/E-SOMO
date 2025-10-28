package classes;

import java.util.ArrayList;

public class Library {
    private ArrayList<Books> totalBooks;
    private ArrayList<Members> totalMembers;
   public  Library(){}

    public Library(ArrayList<Books> totalBooks, ArrayList<Members> totalMembers) {
        this.totalBooks = new ArrayList<>();
        this.totalMembers = new ArrayList<>();
    }
    public void addBook(Books book){
       if(!totalBooks.contains(book)){
           totalBooks.add(book);
       }else{
           System.out.println("Book already exists");
       }

    }
    public void removeBook(Books book){
        if(totalBooks.contains(book)){
            totalBooks.remove(book);
        }else{
            System.out.println("Book does not exists");
        }
    }
    public void addMember(Members member){
        if(!totalMembers.contains(member)){
            totalMembers.add(member);
        }else{
            System.out.println("Member already exists");
        }

    }
    public void removeMember(Members member){
        if(totalMembers.contains(member)){
            totalMembers.remove(member);
        }else{
            System.out.println("Member does not exists");
        }
    }
    public void displayBooks(){
       for (Books book:totalBooks){
           book.displayInfo();
       }
    }
    public void displayMembers(){
        for (Members member:totalMembers){
            member.displayInfo();
        }
    }
}

