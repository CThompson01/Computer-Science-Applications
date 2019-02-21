
/**
 * Write a description of class FavoritesMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FavoritesMediaLib {
    // instance variables - replace the example below with your own

    public static void printFavorites() {
        System.out.println("Welcome to your Favorite Songs Library");
        String line = MediaFile.readString();
        while (line != null) {
            String[] strings = line.split("\\|");
            if (strings[2].equals("true")) {
                System.out.println(strings[0]+"("+strings[1]+")");
            }
            line = MediaFile.readString();
        }
    }
}
