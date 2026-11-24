package qa.tasks.task02;

import java.util.Scanner;

public class QATask02 {

    public static Scanner sc = new Scanner(System.in);

    public static StartStop readStartStop() {
        System.out.println("Enter start");
        int start = sc.nextInt();

        System.out.println("Enter stop");
        int stop = sc.nextInt();

        return new StartStop(start, stop);
    }

    public static void printHi() {
        System.out.println("HI");
    }

    public static void printIncrementVoidWhile() {
        StartStop value = readStartStop();
        int start = value.start;
        int stop = value.stop;
        int i = start;
        while (i < stop) {
            System.out.println(i);
            i++;
        }
    }

    public static void printDecrementVoidWhile() {
        StartStop value = readStartStop();
        int start = value.start;
        int stop = value.stop;
        int j = start;
        while (j > stop) {
            System.out.println(j);
            j--;
        }
    }

    public static void printSumVoidWhile() {
        StartStop value = readStartStop();
        int start = value.start;
        int stop = value.stop;
        int sum = 0;
        int i = start;
        while (i <= stop) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    public static void printIncrementVoidFor() {
        StartStop value = readStartStop();
        int start = value.start;
        int stop = value.stop;
        for (int i = start; i < stop; i++) {
            System.out.println(i);
        }
    }

    public static void printDecrementVoidFor() {
        StartStop value = readStartStop();
        int start = value.start;
        int stop = value.stop;
        for (int j = start; j > stop; j--) {
            System.out.println(j);
        }
    }

    public static void printSumVoidFor() {
        StartStop value = readStartStop();
        int start = value.start;
        int stop = value.stop;
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
