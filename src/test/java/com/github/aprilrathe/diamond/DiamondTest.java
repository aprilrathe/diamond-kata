package com.github.aprilrathe.diamond;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;


public class DiamondTest {

    @Test
    public void format_inputA_twoRowsNoSpaces()
    {
        char[] letters = {'A','A'};
        int[] spaces = {0,0};
        List<String> expected = createExpectedDiamondFormat(letters, spaces);
        List<String> actual = Diamond.format('A');
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void format_inputB_threeRowsOneSpaceANoSpaceB() {
        char[] letters = {'A','B','A'};
        int[] spaces = {1,0,1};
        List<String> expected = createExpectedDiamondFormat(letters, spaces);
        List<String> actual = Diamond.format('B');
        Assert.assertEquals(expected, actual);
    }

    private List<String> createExpectedDiamondFormat(char[] letters, int[] spaces) {
        List<String> diamond = new ArrayList<String>();
        for(int i = 0; i<letters.length ; i++) {
            String diamondRow = "";
            for(int j=0; j<spaces[i];j++) {
                diamondRow +=" ";
            }
            diamondRow += letters[i];
            diamond.add(diamondRow);
        }
        return diamond;
    }
}
