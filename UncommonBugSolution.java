public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 10;
        try {
            x = x / 0; // Potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
            x = -1; // Assign a default value to handle potential error after catch
        }
        System.out.println("x = " + x); 

        String s = null;
        try {
            int len = s.length(); // Potential NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            s = ""; // Assign an empty string to handle null reference error
        }

        System.out.println("Length of s is: " + s.length());
        System.out.println("Program continues... ");
    }
}