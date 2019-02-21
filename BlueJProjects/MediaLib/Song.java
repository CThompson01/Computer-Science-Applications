
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song {
    // instance variables - replace the example below with your own
    private int rating;
    private String title;
    private double price;
    private boolean favorited;
    
    public Song() {
        rating = 0;
        title = "";
        this.price = 0.0;
        this.favorited = false;
    }
    
    public Song(int rating, String title) {
        this.rating = rating;
        this.title = title;
        this.price = 0.0;
        this.favorited = false;
    }
    
    public Song(int rating, String title, double price) {
        this.rating = rating;
        this.title = title;
        this.price = price;
        this.favorited = (rating>7);
    }
    
    public Song(int rating, String title, double price, boolean favorite) {
        this.rating = rating;
        this.title = title;
        this.price = price;
        this.favorited = favorite;
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
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setFavorite(boolean favorite) {
        this.favorited = favorite;
    }
    
    public boolean getFavorited() {
        return favorited;
    }
}
