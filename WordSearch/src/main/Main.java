package main;

import utilities.TextFiles;

public class Main {
    private static int[] beginningLetter = new int[2];
    private static int[] endLetter = new int[2];

    public static void main(String[] args) {
        // Grab the word search
        char[][] wordSearch = TextFiles.readSearch("wordsearch.txt");
        String[] wordsToSearchFor = TextFiles.readWords("words.txt");

        // Prints out the word search for debugging
        assert wordSearch != null;
        printWordSearch(wordSearch);

        // Iterates through every word in array and searches for it
        for (String word : wordsToSearchFor) {
            searchForWord(word, wordSearch);
        }
    }

    private static void searchForWord(String word, char[][] wordSearch) {
        char letter = word.charAt(0);

        // Finds the index of the first letter
        // Then continues to search for the following letters
        for (int row = 0;row < wordSearch.length;row++) {
            for (int col = 0;col < wordSearch[row].length;col++) {
                if (letter == wordSearch[row][col]) {
//                    System.out.println("First letter of " + word + " found at (" + row + "," + col + ")");

                    beginningLetter[0] = row;
                    beginningLetter[1] = col;

                    secondLetter(row,col,word,wordSearch);
                }
            }
        }
    }

    private static void secondLetter(int iRow, int iCol, String word, char[][] wordSearch) {
        int size = wordSearch.length;

        int[] rows = {iRow - 1, iRow, iRow + 1};
        int[] cols = {iCol - 1, iCol, iCol + 1};

        for (int row : rows) {
            if (row >= 0 && row < size) {
                for (int col : cols) {
                    if (col >= 0 && col < size) {

                        // Prints the column and row that it is checking
//                        System.out.print("(" + row + "," + col + ") ");

                        // If the letter is similar
                        if (wordSearch[row][col] == word.charAt(1)) {
                            // The word has been successfully found
//                            if (letterToCheck == word.length()-1) {
//                                endLetter[0] = row;
//                                endLetter[1] = col;
//
//                                System.out.println("\n** "+word+" Found **\n" +
//                                        "First: " + beginningLetter[1] + beginningLetter[0] + "\n" +
//                                        "Last: " + endLetter[1] + endLetter[0] + "\n" +
//                                        "****************");
//
//                                return;
//                            } else {
                                int rowDiff = row - iRow;
                                int colDiff = col - iCol;
                                nextLetter(row + rowDiff,col + colDiff, rowDiff, colDiff,
                                        word,wordSearch, 1 +1);
//                            }
                        }
                    }
                }
            }
        }
    }

    private static void nextLetter(int iRow, int iCol, int rowDiff, int colDiff,
                                   String word, char[][] wordSearch, int letterToCheck) {
        int size = wordSearch.length;

        if (iRow >= 0 && iRow < size) {
            if (iCol >= 0 && iCol < size) {
                // If the letter is similar
                if (wordSearch[iRow][iCol] == word.charAt(letterToCheck)) {
                    // The word has been successfully found
                    if (letterToCheck == word.length()-1) {
                        endLetter[0] = iRow;
                        endLetter[1] = iCol;

                        System.out.println("\n** "+word+" Found **\n" +
                                "First: " + beginningLetter[1] + beginningLetter[0] + "\n" +
                                "Last: " + endLetter[1] + endLetter[0] + "\n" +
                                "****************");
                    } else {
                        nextLetter(iRow + rowDiff,iCol + colDiff, rowDiff, colDiff,
                                word,wordSearch,letterToCheck+1);
                    }
                }
            }
        }
    }

    private static void printWordSearch(char[][] wordSearch) {
        for (char[] row : wordSearch) {
            for (char column : row) {
                System.out.print(column);
            }
            System.out.print("\n");
        }
    }
}
