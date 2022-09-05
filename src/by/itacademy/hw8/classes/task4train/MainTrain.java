package by.itacademy.hw8.classes.task4train;

import java.util.Arrays;
import java.util.Scanner;

public class MainTrain {
    public static void main(String[] args) {
        Train train1 = new Train("Pinsk", 126, 9.35);
        Train train2 = new Train("Gomel", 128, 10.25);
        Train train3 = new Train("Minsk", 1152, 11.25);
        Train train4 = new Train("Pinsk", 159, 15.25);
        Train train5 = new Train("Brest", 99, 19.55);
        Train[] trains = new Train[5];
        trains[0] = train1;
        trains[1] = train2;
        trains[2] = train3;
        trains[3] = train4;
        trains[4] = train5;
//create array from train's numbers
        int[] sortTrainNumber = new int[5];
        sortTrainNumber = new int[]{train1.getTrainNumber(), train2.getTrainNumber(), train3.getTrainNumber(),
                train4.getTrainNumber(), train5.getTrainNumber()};
        // method to sort arrays for train numbers and trains

        System.out.println("***********");
        sortTrainNumber(trains, sortTrainNumber);
        System.out.println();
        System.out.println("*******************");


        Scanner scanner = new Scanner(System.in);
        System.out.println("Put train number");
        int number = scanner.nextInt();
        int x = 0;
        for (int i = 0; i < 5; i++) {

            if (number == sortTrainNumber[i]) {
                System.out.println(Arrays.toString(new Train[]{trains[i]}));
                x++;
            }

        }
        if (x == 0) {
            System.out.println("No the right train number");
        }

//        System.out.println("Sorted trains by route numbers");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(sortTrainNumber[i]);
//        }


        // create arrays from arrivalpoints

        String[] arrivalPoint = new String[]{train1.getArrivalPoint(), train2.getArrivalPoint(),
                train3.getArrivalPoint(), train4.getArrivalPoint(), train5.getArrivalPoint()};

        System.out.println("Before sorting by arrival point's name");
        System.out.println(Arrays.toString(arrivalPoint));




       Train[] trainsArrivalPoint= new Train[]{train1,train2,train3,train4,train5};
        System.out.println("Time table before sorting by arrival point");
       System.out.println(Arrays.toString(trainsArrivalPoint));
//sort arrays

       sortArrivalPoint(trainsArrivalPoint, arrivalPoint);

    }

    private static void sortTrainNumber(Train[] trainsSortNumber, int[] sortTrainNumber) {
        Train tempTr;
        int min, temp;
        for (int i = 0; i < (sortTrainNumber.length - 1); i++) {

            min = i;
            for (int j = i + 1; j < sortTrainNumber.length; j++) {
                if (sortTrainNumber[j] < sortTrainNumber[min]) {
                    min = j;
                }
            }
            temp = sortTrainNumber[i];
            sortTrainNumber[i] = sortTrainNumber[min];
            sortTrainNumber[min] = temp;
            tempTr = trainsSortNumber[i];
            trainsSortNumber[i] = trainsSortNumber[min];
            trainsSortNumber[min] = tempTr;
        }

        System.out.println("New time table by train number");
       // System.out.print(Arrays.toString(trainsSortNumber));
        for (int i = 0; i < trainsSortNumber.length; i++) {
            System.out.println(Arrays.toString(new Train[] {trainsSortNumber[i]}));
        }

    }
        public static void sortArrivalPoint(Train[] trainsArrivalPoint, String[] arrivalPoint)
    {
    int minAr;
    String tempAr;
    Train tempArTr;
        for(
    int l = 0; l<(arrivalPoint.length -1);l++)

    {
        minAr = l;
        for (int m = l + 1; m < arrivalPoint.length; m++) {
            if (arrivalPoint[m].compareTo(arrivalPoint[minAr]) < 0) {
                minAr = m;
            }

        }
        tempAr = arrivalPoint[l];
        arrivalPoint[l] = arrivalPoint[minAr];
        arrivalPoint[minAr] = tempAr;
        tempArTr = trainsArrivalPoint[l];
        trainsArrivalPoint[l] = trainsArrivalPoint[minAr];
        trainsArrivalPoint[minAr] = tempArTr;

    }

    //after sorting by arrival points in alphabet order
        System.out.println("New time table by arrival point name");
        System.out.println(Arrays.toString(arrivalPoint));
        for( int i = 0; i< trainsArrivalPoint.length;i++)

    {
        System.out.println(Arrays.toString(new Train[]{trainsArrivalPoint[i]}));
    }
}
}
