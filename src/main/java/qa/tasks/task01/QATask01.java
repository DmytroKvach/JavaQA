package qa.tasks.task01;

public class QATask01 {

    public static void taskSwitch(int month) {

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid month");
        }
    }

    public static int taskIfMath(int value) {

        if (value == 0) {
            System.out.println(0);
            return 0;
        } else if (value > 0) {
            System.out.println(value * value);
            return value * value;
        } else {
            System.out.println(Math.abs(value));
            return Math.abs(value);
        }
    }

    public static void taskIf(int age, boolean isDay) {

        if (age > 18 && isDay) {
            System.out.println("i can by beer");
        } else if (age < 18 || !isDay) {
            System.out.println("i can by cola");
        } else {
            System.out.println("close");
        }
    }
}
