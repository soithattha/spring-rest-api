/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.controller;

import io.swagger.annotations.Api;
import java.io.Serializable;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import static javax.ws.rs.core.MediaType.APPLICATION_JSON;
import static javax.ws.rs.core.MediaType.TEXT_PLAIN;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author soithattha
 * @date Sep 24, 2018
 * @version
 * @description
 */
@Path("/car")
@Api("Car Endpoint")
public class CarEndpoint {

    class Info implements Serializable {

        public String username;
        public String password;

        public Info(String username, String password) {
            this.username = username;
            this.password = password;
        }

    }

    @GET
    public Info getAll() {
        return new Info("soithattha", "password");
    }

    @GET
    @Path("{id}")
    @Produces({TEXT_PLAIN, APPLICATION_JSON})
    public String findById(@PathParam("id") long id) {
        return "findById";
    }
}
