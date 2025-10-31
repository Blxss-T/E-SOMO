package classes;

public class Books {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;
    public Books(){}
    public Books(int id, String title, String author,boolean isBorrowed){
        int nextId = 0;
        this.id=nextId;
        nextId++;
        this.title=title;
        this.author=author;
        this.isBorrowed=false;
    }
    public void displayInfo(){
        System.out.println(title+"by"+author+"is"+isBorrowed);
    }
    public void borrowBook() {
        if(!isBorrowed){
            isBorrowed=true;
            System.out.println("Borrowed successfully");
        }else{
            System.out.println("Ooops, Books already borrowed.");
        }
    }
    public void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("Book returned!");
        }else{
            System.out.println("Book not retruned yet!");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Books{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';






    }
}
