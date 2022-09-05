package by.itacademy.hw8.classes.task4train;

public class Train {
    String arrivalPoint;
    int trainNumber;
    double startTime;

    public Train(String arrivalPoint, int trainNumber, double startTime) {
        this.arrivalPoint = arrivalPoint;
        this.trainNumber = trainNumber;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return "Train{" +
                "arrivalPoint='" + arrivalPoint + '\'' +
                ", trainNumber=" + trainNumber +
                ", startTime=" + startTime +
                '}';
    }

    public String getArrivalPoint() {
        return arrivalPoint;
    }

    public void setArrivalPoint(String arrivalPoint) {
        this.arrivalPoint = arrivalPoint;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }
}
