package by.itacademy.hw8.classes.task7triangle;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void area(int a, int b) {
        double areaT = Math.pow(a,2)+Math.pow(b,2);
        System.out.println("area = " + areaT);

    }
    public static void perimetr(int a, int b, int c) {
        double perimetrT = a+b+c;
        System.out.println("perimetr = " + perimetrT);

    }
    public static void mediana(int a, int b, int c){
        double mA= Math.sqrt((2*Math.pow(b,2)+2*Math.pow(c,2)-Math.pow(a,2)/4));
        System.out.println("mediana for a = " + mA);
    }
}
