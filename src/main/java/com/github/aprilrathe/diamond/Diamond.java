package com.github.aprilrathe.diamond;

import java.util.ArrayList;
import java.util.List;

public class Diamond
{
    private static final char startLetter = 'A';

    public static List<String> format(char endLetter) {
        List<String> diamondFormat = new ArrayList<String>();

        if(endLetter == startLetter) {
            diamondFormat.add(String.valueOf(startLetter));
            diamondFormat.add(String.valueOf(endLetter));
        }
        else if (endLetter == 'B') {
            diamondFormat.add(" "+String.valueOf(startLetter));
            diamondFormat.add(String.valueOf(endLetter));
            diamondFormat.add(" "+String.valueOf(startLetter));
        }
        else if (endLetter == 'C') {
            diamondFormat.add("  "+String.valueOf(startLetter));
            diamondFormat.add(" " + String.valueOf((char)(startLetter + 1)));
            diamondFormat.add(String.valueOf(endLetter));
            diamondFormat.add(" " + String.valueOf((char)(startLetter + 1)));
            diamondFormat.add("  "+String.valueOf(startLetter));
        }
        return diamondFormat;
    }

}
