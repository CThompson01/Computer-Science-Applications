
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double duration;
    
    public Movie() {
        rating = 0;
        title = "";
    }
    
    public Movie(int rating, String title) {
        this.rating = rating;
        this.title = title;
        this.duration = 100;
    }
    
    public Movie (int rating, String title, double duration) {
        this.rating = rating;
        this.title = title;
        this.duration = duration;
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
    
    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public double getDuration() {
        return duration;
    }
}