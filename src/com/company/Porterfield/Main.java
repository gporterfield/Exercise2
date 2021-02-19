package com.company.Porterfield;

public class Main {

    public static void main(String[] args) {


        String day[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int temp[] = {45, 29, 10, 22, 41, 28, 33};
        int precipitation[] = {95, 60, 25, 5, 0, 75, 90};

        for (int i = 0; i <= 6; i++) {
            if (temp[i] <= 32 && precipitation[i] > 50) {
                System.out.println("It will snow on " + day[i] + " because the temperature is "
                        + temp[i] + " and the precipitation is " + precipitation[i] + ".");
            }
        }
    }
}