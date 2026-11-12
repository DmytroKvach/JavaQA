package qa.tasks.task02;


public class QATask02 {
    public static void printHi() {

        System.out.println("HI");
    }

    public static void printIncrementVoidWhile(int start, int stop) {
        int i = start;
        while (i < stop) {
            System.out.println(i);
            i++;
        }
    }

    public static void printDecrementVoidWhile(int start, int stop) {
        int j = start;
        while (j > stop) {
            System.out.println(j);
            j--;
        }
    }

    public static void printSumVoidWhile(int start, int stop) {
        int sum = 0;
        int i = start;
        while (i <= stop) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum = " + sum);
    }

    public static void printIncrementVoidFor(int start, int stop) {
        for (int i = start; i < stop; i++) {
            System.out.println(i);
        }
    }

    public static void printDecrementVoidFor(int start, int stop) {
        for (int j = start; j > stop; j--) {
            System.out.println(j);
        }
    }

    public static void printSumVoidFor(int start, int stop) {
        int sum = 0;
        for (int i = start; i <= stop; i++) {
            sum = sum + i;
        }
        System.out.println("sum = " + sum);
    }
}
