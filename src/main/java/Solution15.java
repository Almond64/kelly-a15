import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password = "almond76";
        System.out.print("What is the password? ");
        String inputString = input.next();
        //check if inputString equals password
        if (inputString.equals(password)) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }
    }
}
