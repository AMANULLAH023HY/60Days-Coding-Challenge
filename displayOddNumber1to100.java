// Java Program to Display Odd Numbers From 1 to 100

public class displayOddNumber1to100 {
    public static void main(String args[]) {
        int number = 100;
        System.out.print("List of odd numbers from 1 to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
