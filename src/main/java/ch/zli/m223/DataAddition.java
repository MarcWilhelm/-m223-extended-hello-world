package ch.zli.m223;

import org.jboss.resteasy.reactive.RestPath;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/calc/add/{summand1}/{summand2}")
public class DataAddition {

    @GET
    public Integer hello(@RestPath Integer summand1, @RestPath Integer summand2) {
        int summe = summand1 + summand2;
        return summe;
    }
}
