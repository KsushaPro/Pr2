package org.example.service;

public class Maxmin {
    public static void main(String[] args) {
        int[] array = new int[5]; // вариант 1 создания массива 5 чисел
        int[] array1 = new int[]{5, 6, 7, 12, -1, 6, 8, 25, 15}; // вариант 2 создания массива 5 чисел с инициализацией

        for (int i = 0; i < array1.length; i++) {
            System.out.println((i+1) + "-й элемент = " + array1[i]);
        }

        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (max < array1[i]) {
                max = array1[i];
            }
        }
        System.out.println("Максимальный элемень  массива = " + max);

        int min = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (min > array1[i]) {
                min = array1[i];
            }
        }
        System.out.println("Минимальный элемень  массива = " + min);
    }
}
