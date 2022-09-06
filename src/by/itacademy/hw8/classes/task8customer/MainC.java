package by.itacademy.hw8.classes.task8customer;

import java.util.Arrays;

public class MainC {
    public static void main(String[] args) {


        Customer customer1 = new Customer(125, "Ivanov", "Ivan", "Ich1",
                123456, 6564987);
        Customer customer2 = new Customer(25, "Melnik", "Sergey", "Ich2",
                125, 256);

        Customer customer3 = new Customer(185, "Petrov", "Olga", "Ich3",
                258, 963);
        Customer customer4 = new Customer(789, "Sidorov", "Alex", "Ich4",
                654, 895);

        Customer customer5 = new Customer(745, "Durov", "Dima", "Ich5",
                654, 852);


        Customer[] custom = {customer1, customer2, customer3, customer4, customer5};
        System.out.println(Arrays.toString(custom));
        sortArray(custom);
        System.out.println(Arrays.toString(custom));
    }

    public static Customer[] sortArray(Customer[] customers) {


        for (int i = 0; i < customers.length; i++) {
            Customer temp;
            for (int j = 0; j < customers.length-i-1; j++) {
                if (customers[j].getSecondName().charAt(0) > customers[j + 1].getSecondName().charAt(0)) {
                                       temp = customers[j];
                    customers[j] = customers[j + 1];
                    customers[j + 1] = temp;
                }
            }

        }
        return customers;
    }
}





