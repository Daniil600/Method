import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        task1(2024);

        System.out.println();

        task2(1, LocalDate.now().getYear());

        System.out.println();

        task3(19);


    }
    public static void task1(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }
    }

    public static void task2(int clientOS, int year) {
        if (clientOS == 0 && year > 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if(clientOS == 0 && year < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && year > 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else{
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void task3(int deliveryDistance) {
        int day = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            day += 1;
            System.out.println("Потребуется дней: " + day);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            day +=2;
            System.out.println("Потребуется дней: " + day);
        } else {
            System.out.println("Доставки нет");
        }
    }
}