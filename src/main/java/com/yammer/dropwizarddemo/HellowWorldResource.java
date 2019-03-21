package com.yammer.dropwizarddemo;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/greetings/{name}")
public class HellowWorldResource {
    @GET
    public String getGreeting(@PathParam("name") String name) {
        return "Hello, " + name + "!";
    }
}
