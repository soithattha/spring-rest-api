/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc;

import com.vnpt.ssdc.controller.MoneyController;
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
        register(MoneyController.class);
    }

}
