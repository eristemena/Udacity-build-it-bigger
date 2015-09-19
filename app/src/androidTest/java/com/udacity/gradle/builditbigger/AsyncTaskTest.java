package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

public class AsyncTaskTest extends AndroidTestCase {
    private static final String LOG_TAG = AsyncTaskTest.class.getSimpleName();

    public void testNotNull(){
        EndpointsAsyncTask task = new EndpointsAsyncTask();
        task.execute(new Pair<Context, String>(getContext(), "hello"));

        String result = null;
        try{
            result = task.get();

            Log.v(LOG_TAG, result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
