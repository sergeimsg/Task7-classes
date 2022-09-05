package by.itacademy.hw8.classes.task6time;

public class Time {

    int hour;
    int minut;
    int sec;

    public Time(int hour, int minut, int sec) {
        if (hour > 24 || hour < 0) {
            hour = 0;
        }
        if (minut > 60 || minut < 0) {
            minut = 0;
        }
        if (sec > 60 || sec < 0) {
            sec = 0;
        }


        this.hour = hour;
        this.minut = minut;
        this.sec = sec;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour > 24 || hour < 0) {
            hour = 0;
        }
        this.hour = hour;
    }

    public int getMinut() {
        return minut;
    }

    public void setMinut(int minut) {
        if (minut > 60 || minut < 0) {
            minut = 0;
        }
        this.minut = minut;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        if (sec > 60 || sec < 0) {
            sec = 0;
        }
        this.sec = sec;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hour=" + hour +
                ", minut=" + minut +
                ", sec=" + sec +
                '}';
    }

    public static void changeSec(int hour, int min, int sec, int secN) {
        int newSec = sec + secN;
        if (newSec > 60) {
            newSec = 0;
        } else {
            System.out.println("hour:" + hour + " min " + min + " sec " + newSec);
        }
    }

    public static void changeMin(int hour, int min, int sec, int minN) {
        int newMin = min + minN;
        if (newMin > 60) {
            newMin = 0;
        }
            System.out.println("hour:" + hour + " min " + newMin + " sec " + sec);

    }

    public static void changeHour(int hour, int min, int sec, int minH) {
        int newH = hour + minH;
        if (newH > 24) {
            newH = 0;
        }
            System.out.println("hour:" + newH + " min " + min + " sec " + sec);

    }



}
