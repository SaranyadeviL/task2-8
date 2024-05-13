import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //get the 1st num from user
        System.out.println(" Enter the first number");
        int n1 = scanner.nextInt();

        //get the 2nd num from user
        System.out.println(" Enter the second number");
        int n2 = scanner.nextInt();

        //display the original values
        System.out.println("Real values are");
        System.out.println("First number:" + n1);
        System.out.println("Second number:" + n2);

        //swap the values using an additional variable
        int temp = n1;
        n1 = n2;
        n2 = temp;

        //Display the swapped values
        System.out.println(" Swapped numbers");
        System.out.println("First number:" + n1);
        System.out.println("Second number:" + n2);
    }
}
