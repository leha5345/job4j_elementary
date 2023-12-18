package ru.job4j.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {
    @Test
    void whenConvert140RblThen2Euro() {
        float inputEuro = 140;
        float expectedToEuro = 2;
        float outputEuro = Converter.rubleToEuro(inputEuro);
        float value = 0.0001f;
        Assertions.assertThat(outputEuro).isEqualTo(expectedToEuro, withPrecision(value));
    }

    @Test
    void whenConvert200RblThen3dot3333Euro() {
        float inputDollar = 180;
        float expectedToDollar = 3;
        float outputDollar = Converter.rubleToDollar(inputDollar);
        float value = 0.0001f;
        Assertions.assertThat(outputDollar).isEqualTo(expectedToDollar, withPrecision(value));
    }
}