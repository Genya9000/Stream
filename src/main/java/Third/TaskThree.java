package Third;

import java.util.*;


public class TaskThree {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.second();
    }

}

class Controller {
    void second() {
        List<String> myList = Arrays.asList ("1, 2, 0", "4, 5");

        myList.forEach(n -> System.out.print(n + " "));
        System.out.println();
        String[]  throughComas = myList.stream().flatMap((p) -> Arrays.asList(p.split(",")).stream()).toArray(String[]::new);

         System.out.println(Arrays.asList(throughComas));

    }
}
