package course1.methods;

public class Main {
    public static void main(String[] args) {
        runHomeWorkTask1();
        runHomeWorkTask2();
        runHomeWorkTask3();
    }
    public static void runHomeWorkTask1() {
        System.out.println("Задание 1");
        int year = 600;
        findOutLeapYear(year);
    }
    public static void findOutLeapYear (int numberYear) {
        if (numberYear % 4 == 0 && numberYear % 100 != 0 || numberYear % 400 == 0) {
            System.out.println(numberYear + " год является високосным");
        } else {
            System.out.println(numberYear + " год не является високосным");
        }
    }
    public static void runHomeWorkTask2() {
        System.out.println("Задание 2");
        int clientOS = 1;
        int clientDeviceYear = 2013;
        findOutTheAppVersion (clientOS, clientDeviceYear);
    }
    public static void findOutTheAppVersion (int oS, int deviceYear) {
        if ((oS == 0) && (deviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if ((oS == 0) && (deviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if ((oS == 1) && (deviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }
    public static void runHomeWorkTask3() {
        System.out.println("Задание 3");
        int deliveryDistance = 95;
        int deliveryTime = 1;
        findOutTheNumberOfDeliveryDays (deliveryDistance, deliveryTime);
    }
    public static int findOutTheNumberOfDeliveryDays (int distance, int time) {
        if (distance <= 20) {
            System.out.println("Потребуется дней: " + time);
        }
        else if (distance > 20 && distance <=60) {
            System.out.println("Потребуется дней: " + (time += 1));
        }
        else {
            System.out.println("Потребуется дней: " + (time += 2));
        }
    return time;
    }
}
