package GradeSystem;

import java.util.Scanner;

public class GradesDouble {
    public static void main(String[] args) {
        Scanner nScanner = new Scanner(System.in);
        double a = 90.0;
        double b = 80.0;
        double c = 70.0;
        double d = 60.0;
        System.out.println("What is your grade?");
        double grade = nScanner.nextDouble();

        if(grade > a) {
            System.out.println("Your Grade is a A: " + grade);
        }else if(grade > b) {
            System.out.println("Your Grade is a B: " + grade);
        }else if(grade > c) {
            System.out.println("Your Grade is a C: " + grade);
        }else if(grade > d) {
            System.out.println("Your Grade is a D: " + grade);
        }else {
            System.out.println("Your Grade is a F: " + grade);
        }


    }
}
