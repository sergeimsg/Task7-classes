package by.itacademy.hw8.classes.task3student;

import java.util.Arrays;

public class Student {
    private String FIO;
    private int groupNumber;
    private int[] point = new int[5];

    public Student(String FIO, int groupNumber, int[] point) {
        this.FIO = FIO;
        this.groupNumber = groupNumber;
        this.point = point;

    }

    public void display10() {
        int x =0;
        for (int i = 0; i < 5; i++) {

            if (point[i] == 10 || point[i]==9) {
                x++;
            }
        }
        if (x==5)
        {System.out.println(FIO + groupNumber + Arrays.toString(point));}
//        else {
//            System.out.println("--------------");
//        }

    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int[] getPoint() {
        return point;
    }

    public void setPoint(int[] point) {
        this.point = point;
    }
}
