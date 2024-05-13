import java.util.Scanner;

public class Senior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = scanner.nextInt();
        if (age >= 60){
            System.out.println("You are a Senior Citizen");
        }
        else{
            System.out.println("You are not a Senior Citizen");
        }
    }
}
