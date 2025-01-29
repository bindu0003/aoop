package com.generics;
import java.util.*;

public class GenericMinMaxDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer array input
        System.out.print("Enter the size of the Integer array: ");
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }
        MinMax<Integer> intMinMax = new MinMaxImpl<>();
        System.out.println("Integer Array: Min = " + intMinMax.findMin(intArray) + ", Max = " + intMinMax.findMax(intArray));

        // Float array input
        System.out.print("\nEnter the size of the Float array: ");
        n = scanner.nextInt();
        Float[] floatArray = new Float[n];
        System.out.println("Enter " + n + " float values:");
        for (int i = 0; i < n; i++) {
            floatArray[i] = scanner.nextFloat();
        }
        MinMax<Float> floatMinMax = new MinMaxImpl<>();
        System.out.println("Float Array: Min = " + floatMinMax.findMin(floatArray) + ", Max = " + floatMinMax.findMax(floatArray));

        // String array input
        System.out.print("\nEnter the size of the String array: ");
        n = scanner.nextInt();
        String[] stringArray = new String[n];
        System.out.println("Enter " + n + " strings:");
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        MinMax<String> stringMinMax = new MinMaxImpl<>();
        System.out.println("String Array: Min = " + stringMinMax.findMin(stringArray) + ", Max = " + stringMinMax.findMax(stringArray));

        // Character array input
        System.out.print("\nEnter the size of the Character array: ");
        n = scanner.nextInt();
        Character[] charArray = new Character[n];
        System.out.println("Enter " + n + " characters:");
        for (int i = 0; i < n; i++) {
            charArray[i] = scanner.next().charAt(0);
        }
        MinMax<Character> charMinMax = new MinMaxImpl<>();
        System.out.println("Character Array: Min = " + charMinMax.findMin(charArray) + ", Max = " + charMinMax.findMax(charArray));

        scanner.close();
    }
}