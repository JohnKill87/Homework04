public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        byte age = 19;
        if (age <= 21) {
            System.out.println("Если человеку " + age + " то он не достиг совершеннолетия, нужно немного подождать");
        } else {
            System.out.println("Если человеку " + age + " то он совершеннолетний");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        byte temperature = 6;
        if (temperature < 5) {
            System.out.println("Если на улице " + temperature + " градусов, нужно надеть шапку");
        } else if (temperature > 5){
            System.out.println("Если на улице " + temperature + " градусов, можно идти без шапки");
        }
    }
    public static void task3() {
        System.out.println("Задача 3");
        byte speedKmPerHour = 70;
        if (speedKmPerHour > 60) {
            System.out.println("Если скорость " + speedKmPerHour + " км/ч, то придется заплатить штраф");
        } else if (speedKmPerHour <= 60){
            System.out.println("Если скорость " + speedKmPerHour + " км/ч, то можно ездить спокойно");
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        byte age = 17;
        if (age == 2 || age < 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age == 7 || age < 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 17 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете");
        } else {
             System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу");
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        byte age = 12;
        if (age < 5) {
            System.out.println("Если возраст ребёнка равен " + age + " то он не может кататься на атракционах");
        } else if (age > 5 && age < 14) {
            System.out.println("Если возраст ребёнка равен " + age + " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        } else {
            System.out.println("Если возраст ребёнка равен " + age + " то он может кататся без сопровождения взрослого");
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        byte peoples = 54;
        byte wagonCapacity = 102;
        byte seatingPlace = 60;
        int standingPlace = wagonCapacity - seatingPlace;
        if (peoples < wagonCapacity && peoples > seatingPlace) {
            System.out.println("В вагоне есть только стоячие места");
        } else if (peoples < wagonCapacity && peoples < seatingPlace) {
            System.out.println("В вагоне есть сидячие места");
        } else if (peoples > standingPlace && peoples < standingPlace) {
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("Вагон полностью забит");
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 6;
        int two = 10;
        int three = 8;
        if (one > two && one > three) {
            System.out.println(one + " Большее число");
        } else if (two > one && two > three) {
            System.out.println(two + " Большее число");
        } else {
            System.out.println(three + " Большее число");
        }
    }
}