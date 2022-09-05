package by.itacademy.hw8.classes.task5counter;

public class Counter {
    int counter;
    int min;
    int max;

    public Counter() {
        counter = 1;
        min = 0;
        max = 99;
    }

    public Counter(int counter, int min, int max) {
        this.counter = counter;
        this.min = min;
        this.max = max;
    }

    public Counter addition1() {
        int addition = min;
        while (addition < max) {
            ++addition;
            System.out.println(addition);
        }
        Counter res = new Counter(counter, min, max);
        return res;

    }

    public Counter subtraction() {
        int subtraction=max;
        while (subtraction > min) {
            --subtraction;
            System.out.println(subtraction);
        }
        Counter resS = new Counter(counter, min, max);
        return resS;
    }
}
