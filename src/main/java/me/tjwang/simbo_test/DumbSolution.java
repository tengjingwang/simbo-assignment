package me.tjwang.simbo_test;

public class DumbSolution extends AbstractFindTwoNumberThatFits{
    
    // Solution assumes elements in array could be zero or negative
    // Dumb solution, O(n^2)
    public int[] findTwoNumberThatFits(int[] arr, int target) {
        for (int i = 0; i < arr.length - 1; i += 1) {
            int a = arr[i];
            for (int j = 0; j < arr.length; j += 1) {
                int b = arr[j];
                if (a + b == target) {
                    return new int[] { a, b };
                }
            }
        }
        return null;
    }
}
