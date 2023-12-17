package ru.job4j.condition;
//1. Создайте класс ru.job4j.condition.Point. Допишите метод distance.
//2. Доработайте метод main. Нужно добавить в него вызов метода distance с различными аргументами.
//3. Загрузите код в репозиторий. Оставьте ссылку на коммит.
//double result = Math.pow(3, 2); // Возвести 3 в квадрат
//double result = Math.sqrt(16); // Вычислить квадратный корень из 16

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double result = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return result;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
    }
}
