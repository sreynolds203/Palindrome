import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userInput = "";//variable for user's word or number
        String reverse = "";//variable for reverse word or number
        Scanner scnr = new Scanner(System.in);//basic scanner object for user input

        System.out.println("Input a word or number to check if it is a palindrome.");
        userInput = scnr.nextLine();//reads the user input

        int length = userInput.length();//variable for getting length of user input

        for(int i = length - 1; i >= 0; i--) {//loop to get each letter and reverse word
            reverse = reverse + userInput.charAt(i);
        }
        if(userInput.equals(reverse)){//statement to tell user if input is palindrome or not.
            System.out.println(userInput + " is a palindrome");
        } else {
            System.out.println(userInput + " is not a palindrome");
        }
    }
}
