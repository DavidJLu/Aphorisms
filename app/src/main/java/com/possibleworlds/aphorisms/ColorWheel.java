package com.possibleworlds.aphorisms;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by David Lu on 7/29/2015.
 */
public class ColorWheel {

    // Member fields (properties)
    private String [] mColors = {
            "#39add1","#3079ab","#c25975",
            "#e15258","#f9845b","#838cc7","#7d569e","#53bbb4",
            "#51b46d","#e0ab18","#637a91","#f092b0","#b7c0c7",
            "#FFAEB9","#CD8C95","#CD2990","#BA55D3","#3D59AB",
            "#436EEE","#BCD2EE","#00E5EE","#00EE76","#4EEE94",
            "#7CFC00","#B3EE3A","#EEAD0E","#CD8500","#FF4040",
            "#FF6A6A","#FF7256","#CD8162","#8B4513","#ED9121"
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
