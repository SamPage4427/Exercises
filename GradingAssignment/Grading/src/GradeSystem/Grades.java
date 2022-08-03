package GradeSystem;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your grade?");

        int grade = scanner.nextInt();
        int a = 90;
        int b = 80;
        int c = 70;
        int d = 60;

        if(grade >= a){
            System.out.println("Your Grade is a A: " + grade);
        }else if(grade < a && grade >= b){
            System.out.println("Your Grade is a B: " + grade);
        }else if(grade < b && grade >= c){
            System.out.println("Your Grade is a C: " + grade);
        }else if(grade < c && grade >= d){
            System.out.println("Your Grade is a D: " + grade);
        }else {
            System.out.println("Your Grade is a F: " + grade);
        }


    }
}
