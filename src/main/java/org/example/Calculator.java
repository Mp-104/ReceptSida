package org.example;


public class Calculator {

    public int addition(int a, int b) {

        return a + b;
    }

    public int subtract(int a, int b) {

        return a - b;
    }

    public int multiply(int a, int b) {

        return a * b;
    }

    public int division(int a, int b) {

        if (b == 0) {
            throw new ArithmeticException("kan inte delas med noll");
        } else {
            return a / b;
        }

        /*return a / b;*/
    }

    public float squareRoot(int a) {

        return (float) Math.sqrt(a);
    }


    public float circleCircumference(int radius) {

        return (float) (2 * Math.PI * radius);
    }


    public double circleArea(int radius) {

        return Math.PI * (radius * radius);
    }

    public boolean isAbleToEnterSystembolaget(int age, boolean inCompanyOfAParent, boolean isBringingADog) {

        boolean test;

        if (isBringingADog) {

            test = false;

        } else {

            if (inCompanyOfAParent || age > 20) {

                test = true;

            } else {

                test = false;

            }
        }


        return test;
    }

}
