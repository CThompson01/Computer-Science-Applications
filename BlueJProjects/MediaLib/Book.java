
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book {
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    
    public Book() {
        rating = 0;
        title = "";
    }
    
    public Book(int rating, String title) {
        this.rating = rating;
        this.title = title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setRating(int rating) {
        this.rating = rating;
    }
    
    public int getRating() {
        return rating;
    }
}