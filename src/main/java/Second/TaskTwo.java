package Second;

import java.util.*;
import java.util.stream.*;

public class TaskTwo {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.second();
    }

}

class Controller {
    void second() {
        List<String> myList = new ArrayList<String>();
        for (int i = 10; i >= 0; i--) {
            myList.add("Ivan" + i);
        }
        myList.forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream<String> upVals = myList.stream().map((n) -> n.toUpperCase()).sorted();
        upVals.forEach(n -> System.out.print(n + " "));

    }
}
