/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc;

import com.vnpt.ssdc.controller.CarEndpoint;
import com.vnpt.ssdc.controller.HouseController;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author soithattha
 * @date Sep 23, 2018
 * @version
 * @description
 */
@Configuration
@ApplicationPath("/api")
public class MyResourceConfig extends ResourceConfig {

    public MyResourceConfig() {
        registerEndpoints();
    }

    private void registerEndpoints() {
        register(CarEndpoint.class);
        register(HouseController.class);
        configureSwagger();
    }

    private void configureSwagger() {
        this.register(ApiListingResource.class);
        this.register(SwaggerSerializers.class);

        BeanConfig config = new BeanConfig();
        config.setConfigId("my-jersey");
        config.setTitle("Rest API");
        config.setDescription("Demo rest api");
        config.setHost("localhost:8088/swagger-ui");
        config.setVersion("v1");
        config.setBasePath("/api");
        config.setResourcePackage("com.vnpt.ssdc");
        config.setPrettyPrint(true);
        config.setScan(true);

    }

}
