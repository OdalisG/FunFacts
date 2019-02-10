package com.example.treausre_lock.funfacts;

import java.util.Random;

 class FactBook {
    // Remember that an object have 2 main components:
    //Fields or Member Variables - Properties about the object
    private String[] facts = {
            "God is our saviour",
            "I love learning new things",
            "I am enjoying creating this mobile app",
            "2019 is just around the corner",
            "Can't wait for new beginnings",
            "On average, it will take 45 days",
            "Upside down",
            "Just acting silly"
    };
    //Methods - Actions the object can take
    String getFact() {

        //Randomly select a fact
        Random randomGenerator = new Random();
        //randomly generates with number changed
        //int randomNumber = randomGenerator.nextInt(8);
        //randomly generates without having to change number every time something is added
        int randomNumber = randomGenerator.nextInt(facts.length);
        return facts [randomNumber];
    }

}
