package com.possibleworlds.aphorisms;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by David Lu on 7/29/2015.
 */
public class ColorWheel {

    // Member fields (properties)
    private String [] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    // Member methods (behaviors)
    public int getColor() {

        String color = "";   // Initialize to empty string
        // Randomly select a fact
        Random randomGenerator = new Random();  // Construct new random number generator
        int randomNumber = randomGenerator.nextInt(mColors.length);
        if(randomNumber >= 0 && randomNumber < mColors.length){
            color = mColors[randomNumber];
        }
        else {
            color = "An error has occurred!";
        }
        int colorAsInt = Color.parseColor(color);
        return colorAsInt;
    }
}
