package com.pranith.flight.service.ml.guice;

import org.glassfish.jersey.server.ResourceConfig;

public class FlightServiceApplication extends ResourceConfig
{
    public void CustomApplication()
    {
        packages("com.pranith.flight.service");
        //register(LoggingFilter.class);
        //register(GsonMessageBodyHandler.class);

        //Register Auth Filter here
        //register(AuthenticationFilter.class);
    }
}