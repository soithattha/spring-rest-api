/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vnpt.ssdc.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import org.springframework.stereotype.Component;

/**
 *
 * @author soithattha
 * @date Sep 23, 2018
 * @version
 * @description
 */
@Component
@Path("/money")
public class MoneyController {

    @GET
    @Path("/{id}")
    public String get(@PathParam("id") int id) {
        System.out.println(id);
        switch (id) {
            case 1:
                return "Day la money 1";
            case 2:
                return "Day la money 2";
            default:
                return "Day la money n";
        }
    }

}
