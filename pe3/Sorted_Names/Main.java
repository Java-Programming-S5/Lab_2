package pe3.Sorted_Names;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sorted Names");

        Scanner sc = new Scanner(System.in);
        String name1, name2, name3;

        System.out.println("Enter name 1 :");
        name1 = sc.nextLine();

        System.out.println("Enter name 2 :");
        name2 = sc.nextLine();

        System.out.println("Enter name 3 :");
        name3 = sc.nextLine();

        if (name1.compareToIgnoreCase(name2) <= 0 && name1.compareToIgnoreCase(name3) <= 0) {
            System.out.println(name1);

            if (name2.compareToIgnoreCase(name3) <= 0) {
                System.out.println(name2);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name2);
            }
        } else if (name2.compareToIgnoreCase(name1) <= 0 && name2.compareToIgnoreCase(name3) <= 0) {
            System.out.println(name2);

            if (name1.compareToIgnoreCase(name3) <= 0) {
                System.out.println(name1);
                System.out.println(name3);
            } else {
                System.out.println(name3);
                System.out.println(name1);
            }
        } else {
            System.out.println(name3);

            if (name1.compareToIgnoreCase(name2) <= 0) {
                System.out.println(name1);
                System.out.println(name2);
            } else {
                System.out.println(name2);
                System.out.println(name1);
            }
        }

        sc.close();
    }
}
