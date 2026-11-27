package qa.tasks.task02;

import static qa.tasks.task02.QATask02.printDecrementVoidFor;
import static qa.tasks.task02.QATask02.printDecrementVoidWhile;
import static qa.tasks.task02.QATask02.printHi;
import static qa.tasks.task02.QATask02.printIncrementVoidFor;
import static qa.tasks.task02.QATask02.printIncrementVoidWhile;
import static qa.tasks.task02.QATask02.printSumVoidFor;
import static qa.tasks.task02.QATask02.printSumVoidWhile;

public class Menu {
    public static void menu() {

        while (true) {
            printMenu();

            if (choiceCaseInMenu()) {
                return;
            }
        }
    }

    private static boolean choiceCaseInMenu() {
        int choice = QATask02.sc.nextInt();

        switch (choice) {
            case 1:
                printHi();
                break;
            case 2:
                printIncrementVoidWhile();
                break;
            case 3:
                printDecrementVoidWhile();
                break;
            case 4:
                printSumVoidWhile();
                break;
            case 5:
                printIncrementVoidFor();
                break;
            case 6:
                printDecrementVoidFor();
                break;
            case 7:
                printSumVoidFor();
                break;
            case 0:
                return true;
            default:
                System.out.println("Wrong choice");
        }

        int backChoice;

        do {
            System.out.println("9. BACK to main menu");
            backChoice = QATask02.sc.nextInt();

            if (backChoice != 9) {
                System.out.println("Wrong choice");
            }

        } while (backChoice != 9);
        return false;
    }

    private static void printMenu() {
        System.out.println(
            "----------MENU--------\n" +
                "1. printHi\n" +
                "2. printIncrementVoidWhile(start value, stop value)\n" +
                "3. printDecrementVoidWhile(start value, stop value)\n" +
                "4. printSumVoidWhile(start value, stop value)\n" +
                "5. printIncrementVoidFor(start value, stop value)\n" +
                "6. printDecrementVoidFor(start value, stop value)\n" +
                "7. printSumVoidFor(start value, stop value)\n" +
                "0. Exit"
        );
    }
}
