package pe3.Bank_Charges;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println("Bank Charges");

        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Checks : ");
        double checksNumber = sc.nextDouble();
        double fees;
        double total = 10.0;

        if(checksNumber < 20){  
            fees = 0.1* checksNumber;
            total+= fees;
            
        } else if( checksNumber >= 20 && checksNumber <= 39){
            fees = 0.08* checksNumber;
            total+= fees;
        }
        else if( checksNumber >= 40 && checksNumber <= 59){
            fees = 0.06* checksNumber;
            total+= fees;
        }
        else{
            fees = 0.04* checksNumber;
            total+= fees;
        }
        System.out.println("Total : "+ total);
    }
}