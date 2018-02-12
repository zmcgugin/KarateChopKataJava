package kata;

import java.util.List;

import static java.util.stream.IntStream.range;

public class Chop {

    public int chop(Integer number, List<Integer> array) {
        for(int i=0; i < array.size(); i++) {
            if(number.equals(array.get(i))) {
                return i;
            }
        }
        return -1;
    }

    public int chopJava8Streams(Integer number, List<Integer> array) {
        return range(0, array.size())
                .filter(index -> array.get(index).equals(number))
                .findFirst().orElse(-1);
    }
}
