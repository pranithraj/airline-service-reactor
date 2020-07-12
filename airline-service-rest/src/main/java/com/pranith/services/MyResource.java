package com.pranith.services;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.pranith.airline.service.AirlineService;
import com.pranith.airline.service.injector.AirlineServiceInjector;

import model.AirCraft;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
    //AirlineService service = new AirlineService();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }

    @GET
    @Path("/{flightName}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON})
    public Response getIt(@PathParam("flightName") String flightName) throws Exception {
        Injector injector = Guice.createInjector(new AirlineServiceInjector());

        AirlineService app = injector.getInstance(AirlineService.class);
        List<AirCraft> result = app.findAircraftDetailsByAircraftName(flightName);
        Gson gson = new Gson();
        return Response.ok(gson.toJson(result)).build();
    }
}
