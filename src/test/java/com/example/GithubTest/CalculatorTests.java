package com.example.GithubTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static java.lang.Double.NaN;

@SpringBootTest(classes = SpringBootTest.class)
class CalculatorTests {

    Calculator calc = new Calculator();

    @Test
    @DisplayName("Should return the sum of two added integers")
    void shouldReturnTheSumOfTwoAddedIntegers() {
        // given
        int firstNumber = 3;
        int secondNumber = 2;

        // when
        int result = calc.add(firstNumber,secondNumber);

        // then
        Assertions.assertEquals(6,result);
    }

    @Test
    @DisplayName("Should return the sum of two subtracted integers")
    void shouldReturnTheSumOfTwoSubtractedIntegers() {
        // given
        int firstNumber = 10;
        int secondNumber = 7;

        // when
        int result = calc.subtract(firstNumber,secondNumber);

        // then
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Should return the sum of two multiplied integers")
    void shouldReturnTheSumOfTwoMultipliedIntegers() {
        // given
        int firstNumber = 9;
        int secondNumber = 2;

        // when
        int result = calc.multiply(firstNumber,secondNumber);

        // then
        Assertions.assertEquals(18,result);
    }

    @Test
    @DisplayName("Should return the quotient of two divided integers")
    void shouldReturnTheQuotientOfTwoDividedIntegers() {
        // given
        int firstNumber = 6;
        int secondNumber = 2;

        // when
        double result = calc.divide(firstNumber,secondNumber);

        // then
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Should return the square root of an integer")
    void shouldReturnTheSquareRootOfAnInteger() {
        // given
        int number = 9;

        // when
        double result = calc.squareRootOf(number);

        // then
        Assertions.assertEquals(3,result);
    }

    @Test
    @DisplayName("Should return the area of a circle by its radius")
    void shouldReturnTheAreaOfACircle() {
        // given
        int number = 1;

        // when
        double result = calc.getArea(number);

        // then
        Assertions.assertEquals(3.14,result);
    }

    @Test
    @DisplayName("Should return not a number when integer is less than zero for calculating circle area")
    void shouldReturnNotANumberForCalculatingAreaWhenIntIsLessThanZero() {
        // given
        int number = -1;

        // when
        double result = calc.getArea(number);

        // then
        Assertions.assertEquals(NaN,result);
    }

    @Test
    @DisplayName("Should return the circumference of a circle by its radius")
    void shouldReturnTheCircumferenceOfACircle() {
        // given
        int number = 2;

        // when
        double result = calc.getCircumference(number);

        // then
        Assertions.assertEquals(12.57,result);
    }

    @Test
    @DisplayName("Should return not a number when integer is less than zero for calculating circle circumference")
    void shouldReturnNotANumberForCalculatingCircumferenceWhenIntIsLessThanZero() {
        // given
        int number = -1;

        // when
        double result = calc.getCircumference(number);

        // then
        Assertions.assertEquals(NaN,result);
    }

}
