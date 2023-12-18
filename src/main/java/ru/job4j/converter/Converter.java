package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float input = 140F;
        float expectedToEuro = 2F;
        float outputEuro = rubleToEuro(input);
        boolean passedToEuro = expectedToEuro == outputEuro;
        if (passedToEuro) {
            System.out.println(input + " rubles are " + outputEuro + " Test result: " + passedToEuro);
        }
        float expectedToDollar = 2.3333333F;
        float outputDollar = rubleToDollar(input);
        boolean passedToDollar = expectedToDollar == outputDollar;
        if (passedToDollar) {
            System.out.println(input + " rubles are " + outputDollar + " Test result: " + passedToDollar);
        }
    }
}