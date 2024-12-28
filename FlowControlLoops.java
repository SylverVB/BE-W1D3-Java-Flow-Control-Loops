// Loop exercises

public class FlowControlLoops {

    public static void main(String args[]) {

        // Exercise 1: Print an array of ten byte values
        // Create an array of ten byte values. The values can be any arbitrary numbers that you choose. Now use a for loop to iterate over the elements in the array and print them to the console.

        System.out.println("Exercise 1:");
        printByteArray();

        // Separator between exercises
        System.out.println("--------------------------");

        // Exercise 2: Print numbers 1 through 10
        // For this exercise, you need to write a while loop that prints the numbers 1 through 10, inclusively each on a separate line.
        // HINT: You can use a variable that you increase during each iteration (step) of the loop. You can also use an if-statement to determine when to exit the loop.

        System.out.println("Exercise 2:");
        printNumbers();

        System.out.println("--------------------------");

        // Exercise 3: Print even numbers from 100 to -100
        // For this exercise, you must write a while loop that prints all of the even numbers 100 to -100, inclusively, each on a separate line.

        System.out.println("Exercise 3: ");
        printEvenNumbers();

        System.out.println("--------------------------");

        // Exercise 4: Print odd numbers from 1 to 49
        // For this exercise, you need to write a do-while loop that prints the odd numbers 1 through 49, inclusively, each on a separate line.

        System.out.println("Exercise 4: ");
        printOddNumbers();

        System.out.println("--------------------------");

        // Exercise 5: Print the alphabet using a single char variable
        // For this exercise, you must write a do-while loop that prints the letters of the alphabet. You must use a single char variable that you manipulate to print to the console. (You shouldn't have 26 lines of code that each print a letter...)

        System.out.println("Exercise 5: ");
        printAlphabet();

        System.out.println("--------------------------");

        // Exercise 6: Using break, continue, and labels to alter flow control
        // Write a Java program that uses break, continue, and labels to alter the flow control. Use proper source code formatting.

        System.out.println("Exercise 6: ");
        flowControlExample();
    }

    // Exercise 1: Method to print an array of ten byte values
    public static void printByteArray() {
        byte[] byteArray = {5, 8, 12, 22, 35, 47, 56, 64, 78, 91}; // Array of 10 byte values
        for (byte i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);  // Print each byte value
        }
    }

    // Exercise 2: Method to print numbers 1 through 10
    public static void printNumbers() {
        int number = 1;
        while (number <= 10) {
            System.out.println(number);  // Print the current number
            number++;  // Increment the number by 1
        }
    }

    // Exercise 3: Method to print even numbers from 100 to -100
    public static void printEvenNumbers() {
        int num = 100;  // Starting from 100
        while (num >= -100) {  // Loop until -100
            if (num % 2 == 0) {  // Check if the number is even
                System.out.println(num);
            }
            num -= 2;  // Decrease the number by 2 (can also do num--, but this is more efficient)
        }
    }

    // Exercise 4: Method to print odd numbers from 1 to 49
    public static void printOddNumbers() {
        int num = 1;  // Starting from 1 (first odd number)
        do {
            System.out.println(num);  // Print the odd number
            num += 2;  // Increment by 2 to get the next odd number
        } while (num <= 49);  // Continue until 49
    }

    // Exercise 5: Method to print the alphabet using a single char variable
    public static void printAlphabet() {
        char letter = 'A';  // Starting from 'A'
        do {
            System.out.println(letter);  // Print the current letter
            letter++;  // Increment to the next letter in the alphabet
        } while (letter <= 'Z');  // Continue until 'Z'
    }

    // Exercise 6: Using break, continue, and labels to alter flow control
    public static void flowControlExample() {
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 && j == 3) {
                    System.out.println("Breaking out of both loops at i = " + i + " and j = " + j);
                    break outerLoop;  // Break out of both loops using the label
                }
                if (i == 2 && j == 2) {
                    System.out.println("Skipping this iteration at i = " + i + " and j = " + j);
                    continue;  // Continue to the next iteration of the inner loop
                }
                System.out.println("i = " + i + " and j = " + j);  // Print the current values of i and j
            }
        }
    }
}