
/**
 * Write a description of class MediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MediaLib {
    
    static Song songs[] = new Song[5];
    static Movie movies[] = new Movie[3];
    static Book books[] = new Book[3];
    
    static double avgRating = 0.0;
    static int totalRating = 0;
    
    public static void main() {
        writingData();
        //readSongs();
        FavoritesMediaLib.printFavorites();
    }
    
    private static void writingData() {
        System.out.println("Welcome to your Media Library");
        
        // Initialize Songs
        songs[0] = new Song(1, "Billy", 2.51);
        songs[1] = new Song(10, "Ring of Fire", 5.99);
        songs[2] = new Song(1, "Despacito", 2.15);
        songs[3] = new Song(10, "Gods Gonna Cut You Down", 5.99);
        songs[4] = new Song(10, "Hurt", 5.99);
        
        // Initialize Movies
        movies[0] = new Movie(1, "Infinity War", 125.5);
        movies[1] = new Movie(5, "Star Wars Episode 1: Phantom Menace", 155.75);
        movies[2] = new Movie(1, "Star Wars Episode 6: Return of the Jedi", 132.5);
        
        // Initialize Book
        books[0] = new Book(1, "Great Expectations");
        books[1] = new Book(1, "Heart of Darkness");
        books[2] = new Book(1, "Harry Wizard");
        
        // Prints Songs
        for (int i = 0; i < songs.length; i++) {
            System.out.print(songs[i].getTitle() + " | ");
            System.out.print(songs[i].getRating() + " | ");
            System.out.print("$" + songs[i].getPrice() + " | ");
            System.out.println("Favorited: " + (songs[i].getFavorited() ? "yes" : "no"));
            totalRating += songs[i].getRating();
            
            MediaFile.writeString(songs[i].getTitle()+"|"+songs[i].getRating()+"|"+songs[i].getFavorited());
            //MediaFile.writeString(songs[i].getTitle()+"|"+songs[i].getRating()+"|"+"$"+songs[i].getPrice()+"|"+"Favorited: "+(songs[i].getFavorited()?"yes":"no"));
        }
        
        // Prints Movies
        for (int i = 0; i < movies.length; i++) {
            System.out.print(movies[i].getTitle() + " | ");
            System.out.print(movies[i].getRating() + " | ");
            System.out.println(movies[i].getDuration() + "minutes");
            
            //MediaFile.writeString(movies[i].getTitle()+"|"+movies[i].getRating()+"|"+movies[i].getDuration()+"minutes");
        }
        
        // Prints Books
        for (int i = 0; i < books.length; i++) {
            System.out.print(books[i].getTitle() + "|");
            System.out.println(books[i].getRating());
            //MediaFile.writeString(books[i].getTitle()+"|"+books[i].getRating());
        }
        
        avgRating = totalRating / songs.length;
        System.out.println("Average Rating: " + avgRating + "\n");
        
        MediaFile.saveAndClose();
    }
    
    private static void readSongs() {
        System.out.println("Welcome to your Songs Library");
        String line = MediaFile.readString();
        while (line != null) {
            System.out.println("Title: "+line.substring(0,line.indexOf("|")));
            System.out.println("Rating: "+line.substring(line.indexOf("|")+1));
            line = MediaFile.readString();
        }
    }
    
    
}
