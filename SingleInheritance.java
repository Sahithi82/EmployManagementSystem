import java.util.Scanner;


class Calculator {
    int a, b;


    void call(int x, int y) {
        a = x;
        b = y;
    }


    void Operations() {
        System.out.println("\nCalculator Operations:");
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));

        if (b != 0)
            System.out.println("Division = " + ((double) a / b));
        else
            System.out.println("Division by zero not possible");
    }
}


class StudentGrade extends Calculator {


    void calculateGrade(int marks) {
        System.out.println("\nStudent Grade:");

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 80)
            System.out.println("Grade B");
        else if (marks >= 70)
            System.out.println("Grade C");
        else if (marks >= 60)
            System.out.println("Grade D");
        else
            System.out.println("Grade F");
    }


    void Primes(int min, int max) {
        System.out.println("\nPrime Numbers between " + min + " and " + max + ":");

        for (int i = min; i <= max; i++) {
            int count = 0;

            if (i < 2)
                continue;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0)
                    count++;
            }

            if (count == 2)
                System.out.print(i + " ");
        }
        System.out.println();
    }
}


public class SingleInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentGrade obj = new StudentGrade();

        // Calculator
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        obj.call(n1, n2);
        obj.Operations();

        // Grade
        System.out.print("\nEnter student marks: ");
        int marks = sc.nextInt();

        obj.calculateGrade(marks);

        // Prime Numbers
        System.out.print("\nEnter minimum value: ");
        int min = sc.nextInt();

        System.out.print("Enter maximum value: ");
        int max = sc.nextInt();

        obj.Primes(min, max);

        sc.close();
    }
}