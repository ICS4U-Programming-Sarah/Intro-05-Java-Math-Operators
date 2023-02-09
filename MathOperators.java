/**
* This program executes math operations including addition, etc.
*
* @author  Sarah Andrew
* @version 1.0
*
* @since   2023-02-09
*/
public final class MathOperators {

    /**
     * This is a private constructor used to satisfy the
     * style checker.
     *
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private MathOperators() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * This is the main method.
     *
     * @param args Unused.
     */
    public static void main(String[] args) {
        // Addition.
        System.out.println("25 + 5 = " + (25 + 5));
        // Subtraction.
        System.out.println("7 - 5 = " + (7 - 5));
        // Multiplication.
        System.out.println("8 * 4 = " + (8 * 4));
        // Division with ints.
        System.out.println("36 / 2 = " + (36 / 2));
        // Division with floats.
        System.out.println("5 / 7 = " + (5f / 7f));
        // Division with double.
        System.out.println("145 / 12 = " + (145d / 12d));
        // Exponent raised 2.
        System.out.println("10^2 = " + (Math.pow(10, 2)));
        // Exponent raised 3.
        System.out.println("5^3 = " + (Math.pow(5, 3)));
        // Square root.
        System.out.println("√144 = " + (Math.sqrt(144)));
    }
}
