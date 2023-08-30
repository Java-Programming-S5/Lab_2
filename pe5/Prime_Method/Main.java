package pe5.Prime_Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Is prime number ? ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Number : ");
        int num = sc.nextInt();

        boolean isPrime = true;

        int i = 2;
        while((i < num) && isPrime){
            if(num % i == 0){
                isPrime = false;
            }
            i++;
        }

        System.out.println(isPrime);
        sc.close();
    }
}
