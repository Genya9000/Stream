package Fifth;


import java.util.*;

import java.util.stream.*;


public class TaskFive {
    public static void main(String[] args) {
        Stream<String> streamFromGenerate = Stream.generate(() -> "a1");
        Stream<String> streamFromGenerate1 = Stream.generate(() -> "b1").limit(6);

        System.out.println(Controller.zip(streamFromGenerate, streamFromGenerate1).collect(Collectors.toList()));
    }

}

class Controller {

    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        Stream<T> common = Stream.empty();
        while (firstIterator.hasNext() && secondIterator.hasNext()) {
            common = Stream.concat(common, Stream.of(firstIterator.next(), secondIterator.next()));
        }
        return common;
    }
}