package me.tjwang.simbo_test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public abstract class AbstractFindTwoNumberThatFitsTest
{
    protected AbstractFindTwoNumberThatFits instance;

    public int[] findTwoNumberThatFits(int[] arr, int target) {
        return this.instance.findTwoNumberThatFits(arr, target);
    }

    @Test
    public void testOfficialSample()
    {
        int[] arr = new int[]{1, 4, 7, 23, 9};
        int target = 13;
        int[] expected = new int[]{4, 9};

        int[] result = this.instance.findTwoNumberThatFits(arr, target);
        assertArrayEquals("testOfficialSample", expected, result);;
    }

    @Test
    public void testOnlyTwoOnes()
    {
        int[] arr = new int[]{1, 1};
        int target = 2;
        int[] expected = new int[]{1, 1};

        int[] result = this.instance.findTwoNumberThatFits(arr, target);
        assertArrayEquals("testOnlyTwoOnes", expected, result);;
    }

    @Test
    public void testWithZero()
    {
        int[] arr = new int[]{0, 5, -2, 1, 5, 10};
        int target = 5;
        int[] expected = new int[]{0, 5};

        int[] result = this.instance.findTwoNumberThatFits(arr, target);
        assertArrayEquals("testWithZero", expected, result);;
    }

    @Test
    public void testTwoZeros()
    {
        int[] arr = new int[]{0, 5, -2, 1, 5, 0};
        int target = 0;
        int[] expected = new int[]{0, 0};

        int[] result = this.instance.findTwoNumberThatFits(arr, target);
        assertArrayEquals("testTwoZeros", expected, result);;
    }
    @Test
    public void testPosNegToZero()
    {
        int[] arr = new int[]{-100, 100, -2, 1, 5, 0};
        int target = 0;
        int[] expected = new int[]{-100, 100};

        int[] result = this.instance.findTwoNumberThatFits(arr, target);
        assertArrayEquals("testPosNegToZero", expected, result);;
    }
}
