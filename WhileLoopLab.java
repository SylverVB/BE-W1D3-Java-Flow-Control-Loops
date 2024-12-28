public class WhileLoopLab {
    /**
     * A while loop uses a conditional statement (within parentheses) and runs the code {within curly braces}
     * as long as the conditional is true.
     *
     * For this example, let's use a while loop to get the sum of all numbers between 0 and end (exclusive).
     * 
     * @param end a number representing the number to which the sum of all numbers starting from 0 should be calculated
     *            (exclusive - for example, when end is 5, we calculate 0+1+2+3+4)
     *
     **/
    public int whileExample(int end){
        int sum = 0;
        int i = 0;

        while (i < end) {
            sum += i;
            System.out.println("sum is: " + sum);
            i += 1;
            System.out.println("i is: " + i);
        }

        return sum;
    }

    public static void main(String[] args) {
        // Create an object of WhileLoopLab class to call the method
        WhileLoopLab lab = new WhileLoopLab();
        
        // Call whileExample with end as 6 (which should sum 0+1+2+3+4+5)
        int result = lab.whileExample(6);

        // Print the result
        System.out.println("Sum of numbers from 0 to 5: " + result);
    }
}


