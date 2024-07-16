import java.util.Scanner;

public class Task2_codsoft {
    public static void main(String[] args) {
        System.out.println("For how many students the calculator required");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        while (x > 0) {
            float[] marks = new float[20];
            System.out.println("Enter the no. of subjects :");
            int n = sc.nextInt();
            System.out.println("Enter the marks out of 100");
            for (int i = 0; i < n; i++) {
                System.out.println("Subject " + (i + 1) + " ");
                marks[i] = sc.nextFloat();
            }
            float sum = 0;
            for (int i = 0; i < marks.length; i++) {
                sum += marks[i];
            }
            System.out.println("Total marks achieved by student is : " + sum);
            float avg_percentage = (sum / (n * 100)) * 100;
            System.out.println("The average percentage achieved by student : " + avg_percentage);
            System.out.println("The grade is acieved by the student is :");
            if (avg_percentage > 90 && avg_percentage <= 100) {
                System.out.print("GRADE A");
            } else if (avg_percentage >= 80 && avg_percentage <= 90) {
                System.out.print("GRADE B");
            } else if (avg_percentage >= 70 && avg_percentage < 80) {
                System.out.print("GRADE C");
            } else {
                System.out.print("GRADE E");
            }
            System.out.println("\n");
            x--;
        }
        sc.close();

    }
}