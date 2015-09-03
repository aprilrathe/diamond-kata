package com.github.aprilrathe.diamond;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;


public class DiamondTest {

    @Test
    public void format_inputA_oneRowsNoSpaces()
    {
        List<String> actual = Diamond.format('A');
        Assert.assertEquals("A", actual.get(0));
    }

    @Test
    public void format_inputB_threeRowsOneSpaceANoSpaceB() {
        List<String> actual = Diamond.format('B');

        Assert.assertEquals("-A-", actual.get(0));
        Assert.assertEquals("B-B", actual.get(1));
    }

    @Test
    public void format_inputC_fiveRowsTwoSpacesAOneSpaceBNoSpaceC() {
        List<String> actual = Diamond.format('C');
        Assert.assertEquals("--A--", actual.get(0));
        Assert.assertEquals("-B-B-", actual.get(1));
    }

}
