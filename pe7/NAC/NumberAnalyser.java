package pe7.NAC;

import java.io.*;
import java.util.Scanner;

public class NumberAnalyser {
    private double[] numbers;
    private int count;

    public NumberAnalyser(String filename) throws FileNotFoundException {
        getNumber(filename);
    }

    public double getLowest() {
        double low = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (low > numbers[i]) {
                low = numbers[i];
            }
        }
        return low;
    }

    public double getHighest() {
        double high = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (high < numbers[i]) {
                high = numbers[i];
            }
        }
        return high;
    }

    public double getSum() {
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public double getAvg() {
        double sum = getSum();

        return sum / numbers.length;
    }

    private int getNumber(String filename) throws FileNotFoundException {
        count = getNumberOfValues(filename);

        File file = new File(filename);
        Scanner sc = new Scanner(file);

        numbers = new double[count];

        for (int i = 0; i < count; i++) {
            numbers[i] = sc.nextDouble();
        }

        sc.close();
        return count;
    }

    private int getNumberOfValues(String filename) throws FileNotFoundException {
        // Create the necessary objects for file input.
        File file = new File(filename);
        Scanner inFile = new Scanner(file);

        // Initialize the counter variable.
        count = 0;

        // Count the number of values in the file.
        while (inFile.hasNext()) {
            // Read the next value, but don't do
            // anything with it.
            inFile.nextDouble();

            // Increment count.
            count++;
        }

        // Close the file.
        inFile.close();

        // Return the number of items read from the file.
        return count;
    }

}
