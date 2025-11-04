public class Main {
    public static void main(String[] args) {
        String texto1 = "Anita lava la tina";
        String texto2 = "Hola";

        System.out.println(texto1 + " → " + PalindromeChecker.isPalindrome(texto1));
        System.out.println(texto2 + " → " + PalindromeChecker.isPalindrome(texto2));
    }
}
