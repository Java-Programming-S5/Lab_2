package pe7.NAC;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        NumberAnalyser na = new NumberAnalyser("Numbers.txt");

        // Display data about the numbers in the file.
        System.out.println("The lowest number in the file is " +
                na.getLowest());
        System.out.println("The highest number in the file is " +
                na.getHighest());
        System.out.println("The total of the numbers in the file is " +
                na.getSum());
        System.out.println("The average of the numbers in the file is " +
                na.getAvg());
    }
}
