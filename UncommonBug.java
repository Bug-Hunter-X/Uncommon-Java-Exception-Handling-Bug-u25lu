public class UncommonBug {
    public static void main(String[] args) {
        int x = 10;
        try {
            x = x / 0; // Potential ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        }
        System.out.println("x = " + x); // x is still 10

        String s = null;
        try {
            int len = s.length(); // Potential NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught");
            // The problem is that even after catching these exceptions, the program continues, but the value of x or the reference to s is not changed and an error will occur in further usage.
        }

        // The following code is problematic and might show an unexpected result: 
        if (s != null) {
            System.out.println("Length of s is: " + s.length());
        }

        System.out.println("Program continues... ");
    }
}