public class Factorial {

    public static void main(String[] args) {
        int num =5;//change num value as needed
        int fact = 1;
        for(int i=1; i <= num; ++i) {
            //factorial = fact*i
            fact=fact*i;
        }
        System.out.println("Factorial of the number:" +fact);



    }
}
