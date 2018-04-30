package com.arg_r.bmicalculator;

import java.text.DecimalFormat;

public class BMICalc {

    public static void main(String[] args) {

        double myBMI = BMI(69,1.73);
        DecimalFormat format = new DecimalFormat("##.00");

        System.out.println("Your BMI is: " + format.format(myBMI));

    }

    public static double BMI(double weight, double height) {

        double bmi = weight / Math.pow(height,2);

        return bmi;

    }

}
