public class UseCase2PalindromeCheckerApp {
    public static void main(String[] args){
        String input = "madam";
        String reversed = "";
        for(int i = input.length() - 1; i >= 0; i--){
            reversed += input.charAt(i);
        }
        System.out.print("Is this a palindrome? ");
        if (input.equals(reversed)){
            System.out.print("true.");
        }
        else{
            System.out.print("false.");
        }
    }
}
