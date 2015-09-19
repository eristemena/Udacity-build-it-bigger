package com.ngoprekweb.jokes;

import java.util.Random;

public class MyJoke {
    private String[] mJokes;
    private Random random = new Random();

    public MyJoke(){
        mJokes = new String[4];
        mJokes[0] = "A foo walks into a bar, takes a look around and says \"Hello World!\" and meet up his friend Baz";
        mJokes[1] = "If your mom was a collection class, her insert method would be public";
        mJokes[2] = "When your hammer is C++, everything begins to look like a thumb";
        mJokes[3] = "A SQL query goes into a bar, walks up to two tables and asks, \"Can I join you?\"";
    }

    public String tellJoke() {
        return mJokes[random.nextInt(mJokes.length)];
    }
}
