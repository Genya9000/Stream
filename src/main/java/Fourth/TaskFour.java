package Fourth;


import java.util.stream.*;

public class TaskFour {
    public static void main(String[] args) {
        Controller controller = new Controller(5L);
        controller.fourth();
    }

}

class Controller {
    private Long a = 25214903917L;
    private Long c = 11L;
    private Long m = Long.valueOf(2 ^ 48);

    private Long x;

    public Controller(Long x) {
        this.x = x;
    }

    void fourth() {
        Stream<Long> streamIterate = Stream.iterate(x, x -> x = (a * x + c) % m);

        System.out.println("streamFromIterate = " + streamIterate.limit(10).collect(Collectors.toList()));
    }


}
