import java.util.Scanner;
public class UseCase3PalindromeCheckreApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = input.nextLine();
        String reversed = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reversed += str.charAt(i);
        }
        System.out.print("Is this a palindrome? ");
        if (str.equals(reversed)){
            System.out.print("true.");
        }
        else{
            System.out.print("false. ");
        }
    }
}
