package classes;

public class Books {
    private int id;
    private String title;
    private String author;
    private boolean isBorrowed;
    public Books(){}
    public Books(int id, String title, String author,boolean isBorrowed){
        this.id=id;
        this.title=title;
        this.author=author;
        this.isBorrowed=false;
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
}
