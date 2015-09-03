package com.github.aprilrathe.diamond;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import org.apache.commons.lang3.StringUtils;

public class Diamond
{
    public static final char SPACER = '-';
    public static final char START_LETTER = 'A';

    public static List<String> format(char endLetter) {
        List<String> diamondStructure = new ArrayList<String>();
        List<String> diamondTop = createTopRows(endLetter);
        List<String> diamondBottom = createBottomRows(diamondTop);
        diamondStructure.addAll(diamondTop);
        diamondStructure.addAll(diamondBottom);
        return diamondStructure;
    }

    private static List<String> createTopRows(char endLetter) {
        List<String> rows = new ArrayList<String>();
        int numColumns = numberOfColumns(endLetter);
        int numLetters = numberOfLetters(endLetter);

        for(int i=0; i < numLetters; i++) {
            char currentChar = (char)(START_LETTER + i);
            rows.add(createRow(currentChar, i, numColumns, numLetters));
        }
        return rows;
    }

    private static List<String> createBottomRows(List<String> firstHalf) {
        List<String> mirror = new ArrayList<String>(firstHalf);
        Collections.reverse(mirror);
        // Remove duplicate middle row
        mirror.remove(0);
        return mirror;
    }

    private static String createRow(char currentLetter, int rowNumber, int numColumns, int numbLetters) {
        String row = StringUtils.EMPTY;
        int firstIndex = numColumns - numbLetters - rowNumber;
        int middleIndex = numbLetters - firstIndex - 1;

        row += createSpaceString(firstIndex);
        row += currentLetter;
        row += createSpaceString(middleIndex);

        String mirror = StringUtils.reverse(row);
        mirror = StringUtils.right(mirror, numbLetters - 1);
        row += mirror;

        return row;
    }


    private static int numberOfColumns(char endLetter) {
        return (endLetter - START_LETTER) * 2 + 1;
    }

    private static int numberOfLetters(char endLetter) {
        return endLetter - START_LETTER + 1;
    }

    private static String createSpaceString(int length) {
        return StringUtils.repeat(SPACER, length);
    }
}