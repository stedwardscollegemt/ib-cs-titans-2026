package chapter06.hlextension;

/**
 * Write a program and play an easy game of Sudoku at the same time!
 */
public class Sudoku {
    
    int[][] easy = new int[9][9];

    public static void main(String[] args) {
        // TODO: initialise the easy grid first
        // https://sudoku-puzzles.net/sudoku-easy/

        displayGrid();

        // TODO: fill in the last row of the puzzle (it is obvious) and do a horizontalCheck()

        // TODO: play the game with your teacher, and write code :)
    }

    // TODO: Construct a method to display the sudoku grid
    public static void displayGrid() {
        // key lesson is navigating through a 2D array
        // using nested for loops
    }

    public static boolean horizontalCheck(int row) {
        boolean error = false;
        // TODO: write the logic that checks if a full row of numbers is valid
        return error;
    }

    public static boolean verticalCheck(int col) {
        boolean error = false;
        // TODO: write the logic that checks if a full column of numbers is valid
        return error;
    }

    public static boolean boxCheck(int box) {
        boolean error = false;
        // TODO: write the logic that checks if a 3x3 box of numbers is valid
        return error;
    }
}
