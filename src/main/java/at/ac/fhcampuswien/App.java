package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        double input;
        int count=2;
        double big=0;
        System.out.print("Number 1: ");
        input = scanner.nextDouble();

        if (input<=0){
            System.out.println("No number entered.");
            return;
        }
        while(input>0){
            System.out.print("Number "+count+": ");
            input = scanner.nextDouble();
            count++;
            if (big<input){
                big  = input;}
        }
        System.out.printf("The largest number is "+"%.2f",big);
        System.out.println();
    }

    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int zahl;
        System.out.print("n: ");
        zahl = scanner.nextInt();

        if (zahl<=0){
            System.out.println("Invalid number!");
            return;}
        for(int a=1;a<zahl;a++){
            System.out.println(a);
            for (int b=1;b<a;b++){

            }
        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int konstante =6;
        for (int i=1; i<=konstante; i++){
            for (int j=1;j<=konstante-i;j++){
                System.out.print(" "); // gibt leerzeichen aus
            }
            int star=0;
            while (star != 2*i-1){
                System.out.print("*"); // gibt sterne aus
                star++;
            }
            System.out.println(); //haut mich in die nächste zeile -> back to first loop
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int dead = 0;
        int z = 1;
        double counter = 0;
        int negative = 0;
        while (dead != 1) {

            System.out.print("Mark " + z + ": ");
            int zahl = scanner.nextInt();
            if (zahl < 0 || zahl > 5) {
                System.out.println("Invalid mark!");
            } else if (zahl >= 1 && zahl <= 4) {
                counter = counter + zahl;
                z++;
            } else if (zahl == 5) {
                counter = counter + 5;
                negative++;
                z++;
            }
            if (zahl == 0 && z<=1){
                System.out.println("Average: 0.00");
                System.out.println("Negative marks: 0");
                break;
            } else if (zahl == 0) {
                double average;
                average = counter / (z - 1);
                System.out.printf("Average: " + String.format("%.2f", average)+System.lineSeparator());
                System.out.print("Negative marks: " + negative+"\n");
                dead++;
            }
        }
    }




    //todo Task 6
    public void happyNumbers() {
        // input your solution here
            int save = 0;
            int sum = 0;
            int number;
            Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
            number = scanner.nextInt();
            while (sum!=1 && sum!=4) {
                while (number > 0) {
                    save = number % 10;
                    sum = sum + (save * save);
                    number = number / 10;
                }
                if (sum == 1) {
                    System.out.println("Happy number!");
                } else if (sum == 4) {
                    System.out.println("Sad number!");
                } else{
                    number = sum;
                    sum = 0;}
            }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}