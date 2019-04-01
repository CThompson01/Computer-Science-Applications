package utilities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFiles {

    public static char[][] readSearch(String filePath) {
        char[][] wordSearch;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            int size = 0;
            String currentline = bufferedReader.readLine();
            while (currentline != null) {
                currentline = bufferedReader.readLine();
                size++;
            }
            bufferedReader.close();

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            wordSearch = new char[size][size];
            for (int i = 0; i < size; i++) {
                wordSearch[i] = reader.readLine().toCharArray();
            }

            return wordSearch;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String[] readWords(String filePath) {
        String[] words;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

            int size = 0;
            String currentline = bufferedReader.readLine();
            while (currentline != null) {
                currentline = bufferedReader.readLine();
                size++;
            }
            bufferedReader.close();

            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            words = new String[size];
            for (int i = 0; i < size; i++) {
                words[i] = reader.readLine();
            }

            return words;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
