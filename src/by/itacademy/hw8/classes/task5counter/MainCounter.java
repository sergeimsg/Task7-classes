package by.itacademy.hw8.classes.task5counter;

import java.util.Random;
import java.util.Scanner;

public class MainCounter {
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        counter1.addition1();
        counter1.subtraction();
        Random random = new Random();
        //int counter= random.nextInt(10);
        int min =  random.nextInt(100);
        int max = random.nextInt(100);
        Counter counter2 = new Counter(1,min,max);
        System.out.println("Random parameters " + "min = " + min + "; max = " + max);
        if (min>max) {
            System.out.println("Not possible to perform method, try one more time");
        }
        else {

            counter2.addition1();
            counter2.subtraction();

        };


    }


    }

