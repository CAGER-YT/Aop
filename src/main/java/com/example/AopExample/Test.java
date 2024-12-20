package com.example.AopExample;

public class Test {
    public static void main(String[] args) {
        int[] a = {7, 3, 4, 3, 5, 4, 1, 7};

        for (int i = 0; i < a.length; i++) {
            int count = 0;

            // Check if the current element is already counted or marked
            if (a[i] != 0) {
                // Count occurrences of a[i]
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++; // Increment count for duplicates found
                        a[j] = 0; // Mark duplicate as counted
                    }
                }

                // Print the element if there are duplicates
                if (count > 0) {
                    System.out.println(a[i]); // +1 to include the original occurrence
                }
            }
        }
    }
}
