package com.jaxrs.api.iservice;

import com.jaxrs.api.model.Student;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public interface IHealthService {

    @GET
    @Path("/health")
    @Produces({ MediaType.APPLICATION_JSON })
    Response getHealth();
}
