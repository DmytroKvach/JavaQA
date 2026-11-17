package qa.tasks.task02;

import java.util.Scanner;

public class QATask02 {

    public static Scanner sc = new Scanner(System.in);

    public static void printHi() {
        System.out.println("HI");
    }

    public static void printIncrementVoidWhile(int start, int stop) {
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter stop");
        stop = sc.nextInt();
        int i = start;
        while (i < stop) {
            System.out.println(i);
            i++;
        }
    }

    public static void printDecrementVoidWhile(int start, int stop) {
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter stop");
        stop = sc.nextInt();
        int j = start;
        while (j > stop) {
            System.out.println(j);
            j--;
        }
    }

    public static void printSumVoidWhile(int start, int stop) {
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter stop");
        stop = sc.nextInt();
        int sum = 0;
        int i = start;
        while (i <= stop) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    public static void printIncrementVoidFor(int start, int stop) {
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter stop");
        stop = sc.nextInt();
        for (int i = start; i < stop; i++) {
            System.out.println(i);
        }
    }

    public static void printDecrementVoidFor(int start, int stop) {
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter stop");
        stop = sc.nextInt();
        for (int j = start; j > stop; j--) {
            System.out.println(j);
        }
    }

    public static void printSumVoidFor(int start, int stop) {
        System.out.println("Enter start");
        start = sc.nextInt();
        System.out.println("Enter stop");
        stop = sc.nextInt();
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
