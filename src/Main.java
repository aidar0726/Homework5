public class Main {
    public static void main(String[] args) {
        //задание 1
        System.out.println("задание 1,2");

        int clientOS = 1;
        int clientDeviceYear = 2022;

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 0 && clientDeviceYear <= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке,также необходимо установить облегченную версию приложения");
        } else if (clientOS == 1 && clientDeviceYear <= 2015 ) {
            System.out.println("Установите версию приложения для Android по ссылке,также необходимо установить облегченную версию приложения");
        }

        //задание 3
        System.out.println("задание 3");

        int year = 2000;
        if ((year % 4) == 0 && (year % 100 != 0 && year % 400 == 0)) {
            System.out.println("Високосный год");
        } else {
            System.out.println("Невисокосный год");
        }


        //задание 4
        System.out.println("задание 4");

        int monthNumber = 12;
        System.out.println("задание 4");

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


        //задание 5
        System.out.println("задание 5");

        int distance = 95;
        if (distance <=  20) {
            System.out.println("Потребуется дней: 1 день");
        } else if (distance > 20 && distance < 60) {
            System.out.println("Потребуется дней: Потребуется дней: 2 дня");
        } else if (distance > 60 && distance < 100) {
            System.out.println("Потребуется дней: Потребуется дней: 3 дня");
        } else {
            System.out.println("Свыше 100 км банк не достовляет");
        }

    }
}