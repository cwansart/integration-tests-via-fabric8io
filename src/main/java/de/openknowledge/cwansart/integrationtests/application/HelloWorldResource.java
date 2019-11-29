package de.openknowledge.cwansart.integrationtests.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("hello-world")
@Produces({MediaType.APPLICATION_JSON})
public class HelloWorldResource {

    @GET
    public Response helloWorld() {
        return Response.ok("{\"message\": \"hello world\"}").build();
    }
}
