package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите Ваш возраст: ");
        int age = sc.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Введите температуру на улице: ");
        int temperature = sc2.nextInt();


        if ((age > 20 && age < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять");
        }

        if (age <= 20 && (temperature >= 0 && temperature <= 28)) {
            System.out.println("Можно идти гулять");
        }

        if (age >= 45 && (temperature >= -10 && temperature <= 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома!");
        }
    }
}
