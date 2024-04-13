import java.util.Scanner;

public class ProblemSolver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Problem 1: Finding the minimum element
       /* System.out.print("Enter Problem 1: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter  Problem 1: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Time complexity: O(n1) - We iterate through the entire array once to find the minimum element.
        // Space complexity: O(1) - No extra space is used besides the input array

        int min = findMinimum(arr1);
        System.out.println("Minimum element for Problem 1: " + min);*/



        // Problem 2: Finding the average
        /*System.out.print("\nEnter Problem 2: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter  Problem 2: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        // Time complexity: O(n2) - We iterate through the entire array once to calculate the sum.
        // Space complexity: O(1) - No extra space is used besides the input array.

        double average = findAverage(arr2);
        System.out.println("Average for Problem 2: " + average);*/

        // Problem 3: Checking whether a number is prime
       /* System.out.print("\nEnter Problem 3: ");
        int num3 = scanner.nextInt();

        // Time complexity: O(sqrt(n3)) - We iterate up to the square root of the number to check for divisibility.
        // Space complexity: O(1) - No extra space is used.

        boolean isPrime = isPrime(num3);
        System.out.println("Problem 3: " + (isPrime ? "Prime" : "Composite"));
*/


        // Problem 4: Finding the factorial of a number using recursion
       /* System.out.print("\nEnter a number for Problem 4: ");
        int num4 = scanner.nextInt();

        // Time complexity: O(n4) - Recursive calls are made 'n' times.
        // Space complexity: O(n4) - Stack space for recursive calls.

        int factorial = findFactorial(num4);
        System.out.println("Factorial of " + num4 + " is: " + factorial);
*/
        // Problem 5: Finding the nth Fibonacci number using recursion
        /*System.out.print("\nEnter a number for Problem 5 (Fibonacci): ");
        int num5 = scanner.nextInt();

        // Time complexity: O(2^n) - Exponential time complexity due to recursive calls.
        // Space complexity: O(n) - Space for recursive calls on the stack.

        int fibonacci = findFibonacci(num5);
        System.out.println("Fibonacci number for Problem 5: " + fibonacci);
*/
        // Problem 6: Finding the power of a number using recursion
       /* System.out.print("\nEnter the base and exponent for Problem 6: ");
        int base = scanner.nextInt();
        int exponent = scanner.nextInt();

        // Time complexity: O(log n) - Due to recursive calls reducing the problem size by half each time.
        // Space complexity: O(log n) - Space for recursive calls on the stack.

        int power = findPower(base, exponent);
        System.out.println("Power of " + base + " raised to " + exponent + " for Problem 6: " + power);
*/
        // Solving Problem 7: Finding all permutations of a string
        /*System.out.print("Enter a string for Problem 7 (without spaces): ");
        String str = scanner.next();

        System.out.println("Permutations for Problem 7:");
        generatePermutations(str.toCharArray(), 0);*/

        // Solving Problem 8
      /*  System.out.print("\nEnter a string for Problem 8: ");
        String str8 = scanner.next();
        boolean isAllDigits = checkAllDigits(str8);
        System.out.println("Problem 8: " + (isAllDigits ? "Yes" : "No"));*/
        // Problem 9: Finding the binomial coefficient (C(n, k))

        System.out.print("\nEnter two numbers for Problem 9 (separated by space): ");
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int binomialCoefficient = findBinomialCoefficient(n, k);
        System.out.println("Problem 9: Binomial coefficient C(" + n + ", " + k + ") = " + binomialCoefficient);

        // Problem 10: Finding the GCD of two numbers using recursion
/*
        System.out.print("\nEnter two numbers for Problem 10 (separated by space): ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int gcd = findGCD(num1, num2);
        System.out.println("Problem 10: GCD(" + num1 + ", " + num2 + ") = " + gcd);*/

        scanner.close();
    }

    // Method to solve problem 1: Finding the minimum element
    /*public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }*/

    // Method to solve problem 2: Finding the average
   /* public static double findAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }*/

    // Method to solve problem 3: Checking whether a number is prime
    /*public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }*/

    // Method to solve problem 4: Finding the factorial of a number using recursion
   /* public static int findFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }*/
    // Method to solve problem 5: Finding the nth Fibonacci number using recursion
   /* public static int findFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return findFibonacci(n - 1) + findFibonacci(n - 2);
    }*/

    // Method to solve problem 6: Finding the power of a number using recursion
  /*  public static int findPower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        int temp = findPower(base, exponent / 2);
        if (exponent % 2 == 0) {
            return temp * temp;
        } else {
            return base * temp * temp;
        }
    }*/

    // Method to solve problem 7: Finding all permutations of a string
   /* public static void generatePermutations(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(String.valueOf(chars));
            return;
        }

        for (int i = index; i < chars.length; i++) {
            swap(chars, i, index);
            generatePermutations(chars, index + 1);
            swap(chars, i, index);
        }
    }


    public static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }*/
    // Method to solve Problem 8: Checking whether a string consists of all digits
   /* public static boolean checkAllDigits(String str) {
        return str.matches("\\d+");
    }
    // Method to solve Problem 9: Finding the binomial coefficient (C(n, k))
    public static int findBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }*/
    public static int findBinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return findBinomialCoefficient(n - 1, k - 1) + findBinomialCoefficient(n - 1, k);
        }
    }

    // Method to solve Problem 10: Finding the GCD of two numbers using recursion (Euclidean Algorithm)
    /*public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
*/

}