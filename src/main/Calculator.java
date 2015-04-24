package main;

/**
 * Simple Java Calculator with add and multiply method
 */
public class Calculator {

    public static void main(String[] args) {
    	System.out.println("Hello World");
    }

        public int add(int... number) {
                int total = 0;
                for (int i : number) {
                        total += i;
                }
                return total;
        }

        public int multiply(int... number) {
                int product = 1;
                for (int i : number) {
                        product *= i;
                }
                return product;
        }

}
