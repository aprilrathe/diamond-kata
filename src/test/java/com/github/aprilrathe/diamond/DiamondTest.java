package com.github.aprilrathe.diamond;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DiamondTest {

    @Test
    public void format_inputA_twoRowsNoSpaces()
    {
        List<String> expected = new ArrayList<String>();
        expected.add("A");
        expected.add("A");
        List<String> actual = Diamond.format('A');
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void format_inputB_threeRowsOneSpaceBeforeANoSpaceBeforeB() {
        List<String> expected = new ArrayList<String>();
        expected.add(" A ");
        expected.add("B");
        expected.add(" A ");
        List<String> actual = Diamond.format('B');
        Assert.assertEquals(expected, actual);
    }
}
