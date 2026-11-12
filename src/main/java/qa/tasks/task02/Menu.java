package qa.tasks.task02;

import static qa.tasks.task02.QATask02.printDecrementVoidFor;
import static qa.tasks.task02.QATask02.printDecrementVoidWhile;
import static qa.tasks.task02.QATask02.printHi;
import static qa.tasks.task02.QATask02.printIncrementVoidFor;
import static qa.tasks.task02.QATask02.printIncrementVoidWhile;
import static qa.tasks.task02.QATask02.printSumVoidFor;
import static qa.tasks.task02.QATask02.printSumVoidWhile;

import java.util.Scanner;

public class Menu {
    public static void menu() {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------MENU--------");
            System.out.println("1. printHi");
            System.out.println("2. printIncrementVoidWhile(10, 20)");
            System.out.println("3. printDecrementVoidWhile(20, 10)");
            System.out.println("4. printSumVoidWhile(1, 15)");
            System.out.println("5. printIncrementVoidFor(0, 10)");
            System.out.println("6. printDecrementVoidFor(20, 10)");
            System.out.println("7. printSumVoidFor(1, 15)");
            System.out.println("0. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    printHi();
                    break;
                case 2:
                    printIncrementVoidWhile(10, 20);
                    break;
                case 3:
                    printDecrementVoidWhile(20, 10);
                    break;
                case 4:
                    printSumVoidWhile(1, 15);
                    break;
                case 5:
                    printIncrementVoidFor(0, 10);
                    break;
                case 6:
                    printDecrementVoidFor(20, 10);
                    break;
                case 7:
                    printSumVoidFor(1, 15);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Wrong choice");
            }

            int backChoice;

            do {
                System.out.println("9. BACK to main menu");
                backChoice = sc.nextInt();

            } while (backChoice != 9);
        }
    }
}
