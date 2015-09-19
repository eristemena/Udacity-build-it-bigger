package com.ngoprekweb.builditbigger.backend;

import com.ngoprekweb.jokes.MyJoke;

/**
 * The object model for the data we are sending through endpoints
 */
public class MyBean {
    private MyJoke mMyJoke;

    private String myData;

    public MyBean(String joke){
        myData = joke;
    }

    public String getJoke() {
        return myData;
    }

}