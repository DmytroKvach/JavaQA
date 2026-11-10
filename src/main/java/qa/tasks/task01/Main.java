package qa.tasks.task01;

import static qa.tasks.task01.QATask01.*;

public class Main {
    static  void main(String[] args) {
        System.out.printf("----------");
        taskIf(25, true);
        System.out.println("----------");
        taskSwitch(15);
        System.out.println("----------");
        taskIfMath(-5);
        System.out.println("----------");
    }
}
