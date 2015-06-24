package practice;


import java.math.BigDecimal;

import java.math.RoundingMode;


public class fib {

    private static BigDecimal zero = BigDecimal.valueOf(0);

    private static BigDecimal one = BigDecimal.valueOf(1);

    private static BigDecimal two = BigDecimal.valueOf(2);

    private static BigDecimal four = BigDecimal.valueOf(4);

    private static BigDecimal five = BigDecimal.valueOf(5);


    public static void main(String[] args) {

        BigDecimal num = new BigDecimal(args[0]);


        long start = System.currentTimeMillis();


        if (isFibonacci(num)) {

            System.out.println(num + " is a Fibonacci number.");

        } else {

            System.out.println(num + " is NOT a Fibonacci number.");

        }


        long end = System.currentTimeMillis();


        System.out.println("Ran in " + (end - start) + " milliseconds.");

    }


    public static boolean isFibonacci(BigDecimal num) {

        if (num.compareTo(zero) <= 0) {

            return false;

        }


        BigDecimal base = num.multiply(num).multiply(five);

        BigDecimal possibility1 = base.add(four);

        BigDecimal possibility2 = base.subtract(four);



        return (isPerfectSquare(possibility1) || isPerfectSquare(possibility2));

    }


    public static boolean isPerfectSquare(BigDecimal num) {

        BigDecimal squareRoot = one;

        BigDecimal square = one;

        BigDecimal i = one;

        BigDecimal newSquareRoot;

        int comparison = -1;


        while (comparison != 0) {

            if (comparison < 0) {

                i = i.multiply(two);

                newSquareRoot = squareRoot.add(i).setScale(0, RoundingMode.HALF_UP);

            } else {

                i = i.divide(two);

                newSquareRoot = squareRoot.subtract(i).setScale(0, RoundingMode.HALF_UP);

            }


            if (newSquareRoot.compareTo(squareRoot) == 0) {

                return false;

            }


            squareRoot = newSquareRoot;

            square = squareRoot.multiply(squareRoot);

            comparison = square.compareTo(num);

        }


        return true;

    }

}
