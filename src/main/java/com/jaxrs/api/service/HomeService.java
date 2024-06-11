package com.jaxrs.api.service;

import com.jaxrs.api.iservice.IHomeService;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Service("homeServiceBean")
public class HomeService implements IHomeService {

    @Override
    public Response getHome() {
        return Response
                .status(Response.Status.OK)
                .entity("{\"Greetings\":\"Hello World!!\"}")
                .type(MediaType.APPLICATION_JSON)
                .build();
    }
}
