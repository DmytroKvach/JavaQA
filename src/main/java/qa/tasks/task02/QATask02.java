package qa.tasks.task02;

import java.util.Scanner;

public class QATask02 {

    public static Scanner sc = new Scanner(System.in);

    public static StartStop enterStartStop() {
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
        StartStop value = enterStartStop();
        int start = value.start;
        int stop = value.stop;
        while (start < stop) {
            System.out.println(start);
            start++;
        }
    }

    public static void printDecrementVoidWhile() {
        StartStop value = enterStartStop();
        int start = value.start;
        int stop = value.stop;
        while (start > stop) {
            System.out.println(start);
            start--;
        }
    }

    public static void printSumVoidWhile() {
        StartStop value = enterStartStop();
        int start = value.start;
        int stop = value.stop;
        int sum = 0;
        while (start <= stop) {
            sum = sum + start;
            start++;
        }
        System.out.println("sum = " + sum);
    }

    public static void printIncrementVoidFor() {
        StartStop value = enterStartStop();
        int start = value.start;
        int stop = value.stop;
        for (int i = start; i < stop; i++) {
            System.out.println(i);
        }
    }

    public static void printDecrementVoidFor() {
        StartStop value = enterStartStop();
        int start = value.start;
        int stop = value.stop;
        for (int j = start; j > stop; j--) {
            System.out.println(j);
        }
    }

    public static void printSumVoidFor() {
        StartStop value = enterStartStop();
        int start = value.start;
        int stop = value.stop;
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
