package com.github.aprilrathe.diamond;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class DiamondFormatterTest {

    @Test
    public void format_inputA_oneRowNoSpaces()
    {
        DiamondFormatter formatter = new DiamondFormatter();
        int expectedSpaces = 0;
        int actualSpaces = formatter.calculateLayout('A');
        Assert.assertSame(actualSpaces, expectedSpaces);
    }
}
