public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        if (text == null || text.isEmpty()) {
            return false;
        }

       
        StringBuilder clean = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (Character.isLetterOrDigit(c)) {
                clean.append(c);
            }
        }

        MyStack<Character> stack = new MyStack<>(clean.length());

        for (int i = 0; i < clean.length(); i++) {
            stack.push(clean.charAt(i));
        }
        
        for (int i = 0; i < clean.length(); i++) {
            if (clean.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}
