package First;

import java.util.*;
import java.util.stream.*;

 class TaskOne {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.first();

    }
}

class Controller {
    void first() {
        List<String> myList = new ArrayList<String>();
        for (int i = 0; i <= 10; i++) {
            myList.add("Ivan" + i);
            System.out.print(myList.get(i) + " ");
        }
        System.out.println();
        Stream<String> oddVals = myList.stream().filter((n) -> (myList.indexOf(n) % 2) == 1);
        oddVals.forEach(n -> System.out.print(n + " "));

    }
}
