package by.itacademy.hw8.classes.task8customer;

public class Customer {
    int id;
    String secondName;
    String firstName;
    String surname;
    String address;
    int creditCard;
    int bankAccaunt;

    public Customer(int id, String secondName, String firstName, String surname, int creditCard, int bankAccaunt) {
        this.id = id;
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.creditCard = creditCard;
        this.bankAccaunt = bankAccaunt;
    }

    public Customer(String secondName, String firstName, String surname) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Customer(String secondName, String firstName, String surname, int creditCard) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.surname = surname;
        this.creditCard = creditCard;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public int getBankAccaunt() {
        return bankAccaunt;
    }

    public void setBankAccaunt(int bankAccaunt) {
        this.bankAccaunt = bankAccaunt;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", creditCard=" + creditCard +
                ", bankAccaunt=" + bankAccaunt +
                '}';
    }
}
