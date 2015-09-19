/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.ngoprekweb.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.ngoprekweb.jokes.MyJoke;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.ngoprekweb.com",
                ownerName = "backend.builditbigger.ngoprekweb.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name="getBean")
    public MyBean getBean(){
        MyJoke myJoke = new MyJoke();

        MyBean myBean = new MyBean(myJoke.tellJoke());

        return myBean;
    }


}
