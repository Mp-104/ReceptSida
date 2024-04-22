package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    static Calculator calculator;

    @BeforeAll
    public static void init () {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Plussa på två tal")
    public void testAdditionOfTwoIntegers () {
        int a = -5;
        int b = 5;
        int result = calculator.addition(a, b);

        assertEquals(0, result, "tre plus 5 ska bli 8");
    };

    @Test
    @DisplayName("minus")
    public void testSubtractTwoIntegers () {
        int a = -1;
        int b = 1;
        int result = calculator.subtract(a, b);

        assertEquals(-2, result);
    }

    @Test
    @DisplayName("Multiplikation")
    public void testMultiplication () {
        int a = -1;
        int b = 5;
        int result = calculator.multiply(a, b);

        assertEquals(-5, result);
    }

    @Test
    @DisplayName("division")
    public void testDivision () {
        int a = 5;
        int b = 2;
        double result2 = (double) a / b;
        int result = calculator.division(a, b);

        System.out.println(result2);

        assertEquals(a/b, result );
    }

    @Test
    public void divByZero () {

        assertThrows( ArithmeticException.class, () -> calculator.division(10, 0), "Division by zero should throw <ArithmeticException");
    }

    @Test
    public void testSR () {
        int a = 0;

        float result = calculator.squareRoot(a);
        System.out.println(result);

        assertEquals(0, result);
    }


    @Test
    public void testCircleCircumference () {

        int a = 3;

        float result = calculator.circleCircumference(a);

        System.out.println(result);

        assertEquals(18.85, Math.round(result * 100.0) /100.0);
    }

    @Test
    public void getArea () {

        int a = -3;

        double result = calculator.circleArea(a);
        System.out.println(result);

        assertEquals(28.27, Math.round(result * 100.0) /100.0);

    }



    @Test
    void givenTooYoungAgeWithoutAdult_WhenAskingToEnterTheSystembolaget_ThenReturnFalse(){
        int age = 16;
        boolean inCompanyOfAParent = false;
        boolean isBringingADog = false;
        Assertions.assertFalse(calculator.isAbleToEnterSystembolaget(age, inCompanyOfAParent, isBringingADog));
    }
    @Test
    void givenTooYoungAgeWithAdult_WhenAskingToEnterTheSystembolaget_ThenReturnTrue(){
        int age = 16;
        boolean inCompanyOfAParent = true;
        boolean isBringingADog = false;
        Assertions.assertTrue(calculator.isAbleToEnterSystembolaget(age, inCompanyOfAParent, isBringingADog));
    }
    @Test
    void givenAnAdultWithADog_WhenAskingToEnterTheSystembolaget_ThenReturnFalse(){
        int age = 25;
        boolean inCompanyOfAParent = false;
        boolean isBringingADog = true;
        Assertions.assertFalse(calculator.isAbleToEnterSystembolaget(age, inCompanyOfAParent, isBringingADog));
    }



}
