package classes;

import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class fullLibrary {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public fullLibrary() {
        books = new ArrayList<>();
        loadBooksFromFile();
        members = new ArrayList<>();
    }
    public void  loadBooksFromFile(){
        try{
            File file= new File ("books.txt");
            Scanner reader =new Scanner(file);
            while(reader.hasNextLine()){
                String line=reader.nextLine();
                String [] data = line.split(",");
                Book book =new Book(data[0],data[1])
            }
            reader.close();
        }catch(IOException e){

        }

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

