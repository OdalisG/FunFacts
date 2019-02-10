package com.example.treausre_lock.funfacts;

import android.graphics.Color;

import java.util.Random;

public class ColorWheel {
    // Remember that an object have 2 main components:
    //Fields or Member Variables - Properties about the object
    private String[] colors = {
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
    //Methods - Actions the object can take
    int getColor() {
        //Randomly select a fact
        Random randomGenerator = new Random();
        //randomly generates with number changed
        //int randomNumber = randomGenerator.nextInt(8);
        //randomly generates without having to change number every time something is added
        int randomNumber = randomGenerator.nextInt(colors.length);
        int color = Color.parseColor(colors [randomNumber]);
        return color;
    }

}
