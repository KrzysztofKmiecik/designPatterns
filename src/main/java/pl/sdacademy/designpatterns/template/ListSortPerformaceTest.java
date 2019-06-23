package pl.sdacademy.designpatterns.template;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ListSortPerformaceTest extends PerformanceTestTemplate {
    @Override
    public int getWarmupIterationNum() {
        return 3;
    }

    @Override
    public int getIterationNum() {
        return 100;
    }

    @Override
    public void testIteration() {
        final List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(new Random().nextInt());
        }
        numbers.sort(Comparator.naturalOrder());
    }
}
