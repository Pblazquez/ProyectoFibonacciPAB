package org.uma.pep;
/**
 * Class containing a method to compute the Fibonacci sequence
 *
 *
 * @author José Blázquez
 */

public class Fibonacci {
    /**
     * @param number
     * @return The fibonacci result of an integer number and an associated pair
     */
    private int YoungRabbit = 0;
    private int OldRabbit = 1;
    private int result = 1;
    /**
     * The integer result is equalized to 1 because if the number is 0 or 1, the result is 1, in that way we can
     * start in the function for with the number 2 directly
     */
    private int cont;

    public int compute(int number, int pair) {
        if (number < 0) {
            throw new RuntimeException("The value is negative: " + number);
        }else{
            for (cont = 2; cont <= number; cont++) {
                result = YoungRabbit + OldRabbit;
                YoungRabbit = OldRabbit*pair;
                OldRabbit = result;
            }
            return result;
        }
    }
}

