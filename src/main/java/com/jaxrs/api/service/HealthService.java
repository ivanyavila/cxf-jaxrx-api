package com.jaxrs.api.service;

import com.jaxrs.api.iservice.IHealthService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Service("healthServiceBean")
public class HealthService implements IHealthService {

    @Override
    public Response getHealth() {
        return Response
                .status(Response.Status.OK)
                .entity("{\"Status\":\"UP\"}")
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
