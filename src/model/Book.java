package model;

public class Book {
    private String title;
    private String authors;
    public void name(){
        System.out.println("Name of the books");
    }
    public Book(){
        authors = "Sokia";
        title = "LearningJava";
    }
    public Book(String authors, String title){
        this.authors = authors;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthors(){
        return authors;
    }

}
