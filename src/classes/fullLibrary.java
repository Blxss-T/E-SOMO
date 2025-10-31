package classes;

import java.util.ArrayList;

public class fullLibrary {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public fullLibrary() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }
    public void addBook(Book book){
       if(!books.contains(book)){
           books.add(book);
       }else{
           System.out.println("Book already exists");
       }

    }
    public void removeBook(Book book){
        if(books.contains(book)){
            books.remove(book);
        }else{
            System.out.println("Book does not exists");
        }
    }
    public void addMember(Member member){
        if(!members.contains(member)){
            members.add(member);
        }else{
            System.out.println("Member already exists");
        }

    }
    public void removeMember(Member members){
        if(members.contains(member)){
            members.remove(member);
        }else{
            System.out.println("Member does not exists");
        }
    }
    public void displayBooks(){
       for (Book book:books){
           book.displayInfo();
       }
    }
    public void displayMembers(){
        for (Member member:members){
            member.displayInfo();
        }
    }
}

