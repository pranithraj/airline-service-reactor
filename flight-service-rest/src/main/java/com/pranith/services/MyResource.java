package com.pranith.services;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pranith.services.api.FlightDetailsApiService;
import com.pranith.services.factories.FlightDetailsApiServiceFactory;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("/flight")
public class  MyResource {

    private final FlightDetailsApiService delegate = FlightDetailsApiServiceFactory.getFlightDetailsApi();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Path("/{flightName}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_ATOM_XML, MediaType.APPLICATION_JSON})
    public Response getIt(@PathParam("flightName") String flightName) throws NotFoundException {
        return delegate.getFlightDetailsByFlightName(flightName);
    }
}
