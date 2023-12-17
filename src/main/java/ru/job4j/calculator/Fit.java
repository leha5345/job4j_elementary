package ru.job4j.calculator;

//В этом задании нужно написать программу для вычисления идеального веса.
//        Ниже приведены формулы для вычисления идеального веса.
//        Идеальный вес для мужчин = (рост в сантиметрах – 100) · 1,15.
//        Идеальный вес для женщин = (рост в сантиметрах – 110) · 1,15.
//        Нужно дописать код, чтобы методы вычисляли идеальный вес для мужчины и женщины.
//        Вместо -1 вам нужно написать формулу приведенную выше.
public class Fit {

    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        double woman = womanWeight(height);
        System.out.println("Man " + height + " is " + man);
        System.out.println("Woman " + height + " is " + woman);
    }

}
