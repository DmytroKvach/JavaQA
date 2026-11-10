package qa.tasks.task02;

import static qa.tasks.task02.QATask02.*;

public class Main {

    static void main(String[] args) {

        System.out.println("----------");
        printHi();
        System.out.println("----------");
        printIncrementVoidWhile(10, 20);
        System.out.println("----------");
        printDecrementVoidWhile(20, 10);
        System.out.println("----------");
        printSumVoidWhile(1, 15);
        System.out.println("----------");
        printIncrementVoidFor(0, 10);
        System.out.println("----------");
        printDecrementVoidFor(20, 10);
        System.out.println("----------");
        printSumVoidFor(1, 15);
        System.out.println("----------");
    }
}
