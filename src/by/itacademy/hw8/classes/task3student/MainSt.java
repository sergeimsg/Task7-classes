package by.itacademy.hw8.classes.task3student;

public class MainSt {
    public static void main(String[] args) {

        Student st1 = new Student("��������.�.", 100, new int[]{10, 10, 6, 8, 9});
        Student st2 = new Student("������ �.�.", 122, new int[]{10, 9, 10, 10, 9});
        Student st3 = new Student("������ �.�.", 124, new int[]{8, 9, 10, 10, 9});
        Student st4 = new Student("������� �.�.", 122, new int[]{8, 9, 10, 10, 10});
        Student st5 = new Student("��������� �.�.", 124, new int[]{8, 9, 5, 6, 9});
        Student st6 = new Student("��������� �.�.", 110, new int[]{8, 9, 10, 10, 9});
        Student st7 = new Student("������� �.�.", 121, new int[]{8, 9, 10, 8, 9});
        Student st8 = new Student("������ �.�.", 125, new int[]{8, 9, 10, 7, 9});
        Student st9 = new Student("����� �.�.", 126, new int[]{9, 9, 10, 10, 9});
        Student st10 = new Student("������ �.�.", 127, new int[]{8, 9, 10, 10, 9});
        Student[] listSt = new Student[10];
        listSt[0]=st1;
        listSt[1]=st2;
        listSt[2]=st3;
        listSt[3]=st4;
        listSt[4]=st5;
        listSt[5]=st6;
        listSt[6]=st7;
        listSt[7]=st8;
        listSt[8]=st9;
        listSt[9]=st10;
        listSt[0].display10();
        listSt[1].display10();
        listSt[2].display10();
        listSt[3].display10();
        listSt[4].display10();
        listSt[5].display10();
        listSt[6].display10();
        listSt[7].display10();
        listSt[8].display10();
        listSt[9].display10();

    }
}
