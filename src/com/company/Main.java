package com.company;

public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args){
        //Задание №1
    int[] arr = generateRandomArray();
    int sum = 0;

    for (int value: arr){
        sum += value;
    }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
        //Задание №2
        int[] spending = generateRandomArray();
        int min = spending[0];
        int max = spending[0];
        for (int i : spending){
            if (i<min) {
                i = min;
            }else if (i > max) {
                max = i;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей");
        //Задание №3
        int[] average = generateRandomArray();
        for (int i : average){
            sum+= i;
        }
        System.out.println(("Средняя сумма трат за месяц составила " + sum / (float) arr.length + " рублей"));
        //Задание №4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}