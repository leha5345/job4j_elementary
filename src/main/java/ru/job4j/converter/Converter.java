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
        float inputEuro = 140F;
        float expectedToEuro = 2F;
        float outputEuro = rubleToEuro(inputEuro);
        boolean passedToEuro = expectedToEuro == outputEuro;
        if (passedToEuro) {
            System.out.println(inputEuro + " rubles are " + outputEuro + " Test result: " + passedToEuro);
        } else {
            System.out.println("Test failed");
        }

        float inputDollar = 180F;
        float expectedToDollar = 3F;
        float outputDollar = rubleToDollar(inputDollar);
        boolean passedToDollar = expectedToDollar == outputDollar;
        if (passedToDollar) {
            System.out.println(inputDollar + " rubles are " + outputDollar + " Test result: " + passedToDollar);
        } else {
            System.out.println("Test failed");
        }
    }
}